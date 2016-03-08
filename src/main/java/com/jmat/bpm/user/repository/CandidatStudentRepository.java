package com.jmat.bpm.user.repository;

import com.jmat.bpm.user.entity.CandidateStudent;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by User on 3/8/2016.
 */
public interface CandidatStudentRepository extends CrudRepository<CandidateStudent,UUID>{

}
