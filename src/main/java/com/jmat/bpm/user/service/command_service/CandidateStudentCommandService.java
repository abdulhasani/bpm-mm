package com.jmat.bpm.user.service.command_service;

import com.jmat.bpm.user.entity.CandidateStudent;
import com.jmat.bpm.user.wrapper.CandidateStudentWrap;

/**
 * Created by User on 2/29/2016.
 */
public interface CandidateStudentCommandService {
    public CandidateStudent submit(CandidateStudentWrap candidateStudentWrap);
}
