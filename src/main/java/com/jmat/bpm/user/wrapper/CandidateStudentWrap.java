package com.jmat.bpm.user.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jmat.bpm.user.entity.CandidateStudent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by User on 2/28/2016.
 */
public class CandidateStudentWrap {

    private final String resource = "candidate_student";

    private UUID id;

    private String firstName;

    private String lastName;

    private String fullName;

    private Date birthDate;

    private String originSMP;

    private String originSD;

    public CandidateStudentWrap() {
    }

    public CandidateStudentWrap(CandidateStudent entity) {
        this.id=entity.getId();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.fullName = entity.getFullName();
        this.birthDate = entity.getBirthDate();
        this.originSMP = entity.getOriginSMP();
        this.originSD = entity.getOriginSD();
    }


    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("birth_date")
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("origin_smp")
    public String getOriginSMP() {
        return originSMP;
    }

    public void setOriginSMP(String originSMP) {
        this.originSMP = originSMP;
    }

    @JsonProperty("origin_sd")
    public String getOriginSD() {
        return originSD;
    }

    public void setOriginSD(String originSD) {
        this.originSD = originSD;
    }
}
