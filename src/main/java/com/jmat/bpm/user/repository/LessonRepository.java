package com.jmat.bpm.user.repository;

import com.jmat.bpm.user.entity.Lesson;
import org.springframework.data.repository.CrudRepository;


import java.util.UUID;

/**
 * Created by User on 3/1/2016.
 */
public interface LessonRepository extends CrudRepository<Lesson,UUID> {

    public Lesson findById(UUID id);

}
