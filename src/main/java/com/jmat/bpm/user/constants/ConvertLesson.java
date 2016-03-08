package com.jmat.bpm.user.constants;

import com.jmat.bpm.user.entity.Lesson;
import com.jmat.bpm.user.wrapper.LessonWrapper;

/**
 * Created by User on 2/29/2016.
 */
public class ConvertLesson {
    public static Lesson convertToEntity(LessonWrapper wrapper) {
        if (wrapper instanceof LessonWrapper) {
            Lesson lesson = new Lesson();
            lesson.setName(wrapper.getName());
            lesson.setAbbreviation(wrapper.getAbbreviation());
            return lesson;
        } else {
            return null;
        }
    }

    public static LessonWrapper convertToWrapper(Lesson entity) {
        if (entity instanceof Lesson) {
            LessonWrapper lessonWrapper=new LessonWrapper();
            lessonWrapper.setId(entity.getId());
            lessonWrapper.setName(entity.getName());
            lessonWrapper.setAbbreviation(entity.getAbbreviation());
            return lessonWrapper;
        } else {
            return null;
        }
    }

}
