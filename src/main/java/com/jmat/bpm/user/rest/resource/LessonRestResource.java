package com.jmat.bpm.user.rest.resource;

import com.jmat.bpm.support.transfer.EnvelopeTransfer;
import com.jmat.bpm.user.constants.ConvertLesson;
import com.jmat.bpm.user.entity.CandidateStudent;
import com.jmat.bpm.user.entity.Lesson;
import com.jmat.bpm.user.service.command_service.CandidateStudentCommandService;
import com.jmat.bpm.user.service.command_service.LessonCommandService;
import com.jmat.bpm.user.wrapper.CandidateStudentWrap;
import com.jmat.bpm.user.wrapper.LessonWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by User on 2/28/2016.
@Component
 */
@Controller
@RequestMapping("/user/lesson")
public class LessonRestResource {
    private static final Logger logger= LoggerFactory.getLogger(LessonRestResource.class);

    @Autowired
    private LessonCommandService lessonCommandService;
    @Autowired
    private CandidateStudentCommandService candidatStudentCommandService;


    @ResponseBody
    @RequestMapping(value = "/new",method = RequestMethod.GET,produces = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    @Transactional(readOnly = true)
    public EnvelopeTransfer<LessonWrapper> getLesson() throws Exception{
        Lesson fisika=new Lesson();
        fisika.setName("Fisika");
        fisika.setAbbreviation("FS");
        LessonWrapper fisikaWrap=new LessonWrapper(fisika);
        EnvelopeTransfer<LessonWrapper> transfer=new EnvelopeTransfer<>();
        transfer.setData(fisikaWrap);
        return transfer;
    }


    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST,produces = "application/json",consumes = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    @Transactional(readOnly = false)
    public EnvelopeTransfer<LessonWrapper> createLesson(@RequestBody LessonWrapper lessonWrapper){
        Lesson lesson = lessonCommandService.submit(lessonWrapper);
        CandidateStudent hasani=new CandidateStudent();
        hasani.setFirstName("Abdul");
        hasani.setLastName("Kadir Hasani");
        hasani.setFullName("Abdul Kadir Hasani");
        hasani.setBirthDate(new Date());
        hasani.setOriginSMP("SMP Negeri 03 Bumiayu");
        hasani.setOriginSD("MI Muhammadiyah Langkap");
        CandidateStudentWrap hasaniWrap=new CandidateStudentWrap(hasani);
        candidatStudentCommandService.submit(hasaniWrap);
        EnvelopeTransfer<LessonWrapper> transfer=new EnvelopeTransfer<>();
        transfer.setData(ConvertLesson.convertToWrapper(lesson));
        return transfer;
    }

}
