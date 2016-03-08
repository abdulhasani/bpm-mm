package com.jmat.bpm.user.service.command_service;

import com.jmat.bpm.user.entity.Lesson;
import com.jmat.bpm.user.wrapper.LessonWrapper;

/**
 * Created by User on 2/29/2016.
 */
public interface LessonCommandService {
    public Lesson submit(LessonWrapper lessonWrapper);
}
