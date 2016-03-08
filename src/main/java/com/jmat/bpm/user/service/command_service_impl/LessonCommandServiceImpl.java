package com.jmat.bpm.user.service.command_service_impl;

import com.jmat.bpm.user.repository.LessonRepository;
import com.jmat.bpm.user.constants.ConvertLesson;
import com.jmat.bpm.user.entity.Lesson;
import com.jmat.bpm.user.service.command_service.LessonCommandService;
import com.jmat.bpm.user.wrapper.LessonWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by User on 2/29/2016.
 */
@Service("lessonCommandService")
@Transactional(readOnly = false,propagation = Propagation.REQUIRED,rollbackFor = {Exception.class,RuntimeException.class})
public class LessonCommandServiceImpl implements LessonCommandService{

    private static final Logger LOG= LoggerFactory.getLogger(LessonCommandServiceImpl.class);

    @Autowired
    private LessonRepository lessonRepository;


    @Override
    public Lesson submit(LessonWrapper lessonWrapper) {
        Lesson lesson = ConvertLesson.convertToEntity(lessonWrapper);
        if(lesson==null){
            return null;
        }
        lessonRepository.save(lesson);
        return lesson;
    }



}
