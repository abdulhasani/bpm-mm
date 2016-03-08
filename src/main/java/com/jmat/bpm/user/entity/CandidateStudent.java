package com.jmat.bpm.user.entity;

import com.jmat.bpm.support.entity.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 2/27/2016.
 */
@Entity
@Table(name = "mtd_candidate_student")
public class CandidateStudent extends AbstractEntity{
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "birthDate")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Column(name = "origin_SMP")
    private String originSMP;
    @Column(name = "origin_SD")
    private String originSD;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getOriginSMP() {
        return originSMP;
    }

    public void setOriginSMP(String originSMP) {
        this.originSMP = originSMP;
    }

    public String getOriginSD() {
        return originSD;
    }

    public void setOriginSD(String originSD) {
        this.originSD = originSD;
    }
}
