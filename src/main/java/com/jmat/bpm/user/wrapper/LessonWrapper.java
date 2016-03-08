package com.jmat.bpm.user.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jmat.bpm.user.entity.Lesson;

import java.util.UUID;

/**
 * Created by User on 2/28/2016.
 */
public class LessonWrapper {
    private final String resource = "lesson";
    private UUID id;
    private String name;
    private String abbreviation;

    public LessonWrapper() {
    }

    public LessonWrapper(Lesson entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.abbreviation = entity.getAbbreviation();
    }

    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
