package com.jmat.bpm.user.rest.resource;

import com.jmat.bpm.support.transfer.EnvelopeTransfer;
import com.jmat.bpm.user.entity.CandidateStudent;
import com.jmat.bpm.user.wrapper.CandidateStudentWrap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;

/**
 * Created by User on 2/28/2016.
 */
@Controller
@RequestMapping("/user/can-st")
public class CandidateStudentRR {

    private static final Logger logger= LoggerFactory.getLogger(CandidateStudentRR.class);

    @ResponseBody
    @RequestMapping(value = "/new",method = RequestMethod.GET,produces = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    public EnvelopeTransfer<CandidateStudentWrap> getCadidateStudent(){
        CandidateStudent hasani=new CandidateStudent();
        hasani.setFirstName("Abdul");
        hasani.setLastName("Kadir Hasani");
        hasani.setFullName("Abdul Kadir Hasani");
        hasani.setBirthDate(new Date());
        hasani.setOriginSMP("SMP Negeri 03 Bumiayu");
        hasani.setOriginSD("MI Muhammadiyah Langkap");
        CandidateStudentWrap hasaniWrap=new CandidateStudentWrap(hasani);
        EnvelopeTransfer<CandidateStudentWrap> transfer=new EnvelopeTransfer<>();
        transfer.setData(hasaniWrap);
        return transfer;
    }
}
