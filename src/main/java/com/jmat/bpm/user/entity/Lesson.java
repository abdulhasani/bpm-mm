package com.jmat.bpm.user.entity;

import com.jmat.bpm.support.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by User on 2/28/2016.
 */
@Entity
@Table(name = "mtd_lesson")
public class Lesson extends AbstractEntity{

    @Column(name = "name")
    private String name;
    @Column(name = "abbreviation")
    private String abbreviation;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
