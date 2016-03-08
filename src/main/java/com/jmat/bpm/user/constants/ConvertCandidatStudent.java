package com.jmat.bpm.user.constants;

import com.jmat.bpm.user.entity.CandidateStudent;
import com.jmat.bpm.user.wrapper.CandidateStudentWrap;

/**
 * Created by User on 3/8/2016.
 */
public class ConvertCandidatStudent {
    public static CandidateStudent convertToEntity(CandidateStudentWrap wrap) {
        if (wrap instanceof CandidateStudentWrap) {
            CandidateStudent candidateStudent = new CandidateStudent();
            candidateStudent.setFirstName(wrap.getFirstName());
            candidateStudent.setLastName(wrap.getLastName());
            candidateStudent.setFullName(wrap.getFullName());
            candidateStudent.setBirthDate(wrap.getBirthDate());
            candidateStudent.setOriginSMP(wrap.getOriginSMP());
            candidateStudent.setOriginSD(wrap.getOriginSD());
            return candidateStudent;
        } else {
            return null;
        }
    }

    public static CandidateStudentWrap convertToWrap(CandidateStudent entity) {
        if (entity instanceof CandidateStudent) {
            CandidateStudentWrap candidateStudentWrap = new CandidateStudentWrap();
            candidateStudentWrap.setId(entity.getId());
            candidateStudentWrap.setFirstName(entity.getFirstName());
            candidateStudentWrap.setLastName(entity.getLastName());
            candidateStudentWrap.setFullName(entity.getFullName());
            candidateStudentWrap.setBirthDate(entity.getBirthDate());
            candidateStudentWrap.setOriginSD(entity.getOriginSD());
            candidateStudentWrap.setOriginSMP(entity.getOriginSMP());
            return candidateStudentWrap;
        } else {
            return null;
        }
    }
}
