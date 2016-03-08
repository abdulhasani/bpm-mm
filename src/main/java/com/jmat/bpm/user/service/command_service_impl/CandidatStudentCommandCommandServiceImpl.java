package com.jmat.bpm.user.service.command_service_impl;

import com.jmat.bpm.user.constants.ConvertCandidatStudent;
import com.jmat.bpm.user.entity.CandidateStudent;
import com.jmat.bpm.user.repository.CandidatStudentRepository;
import com.jmat.bpm.user.service.command_service.CandidateStudentCommandService;
import com.jmat.bpm.user.wrapper.CandidateStudentWrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by User on 2/29/2016.
@Service("candidatStudentCommandServiceImpl")
 */
@Service("candidatStudentCommandService")
@Transactional(readOnly = false,propagation = Propagation.REQUIRED,rollbackFor = {Exception.class,RuntimeException.class})
public class CandidatStudentCommandCommandServiceImpl implements CandidateStudentCommandService {

    @Autowired
    private CandidatStudentRepository candidatStudentRepository;

    @Override
    public CandidateStudent submit(CandidateStudentWrap candidateStudentWrap) {
        CandidateStudent candidateStudent = ConvertCandidatStudent.convertToEntity(candidateStudentWrap);
        /**
        if(candidateStudent==null){
            return null;
        }
         */
        candidatStudentRepository.save(candidateStudent);
        return candidateStudent;
    }
}
