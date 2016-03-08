package com.jmat.bpm.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Time;

/**
 * Created by User on 3/8/2016.
 */

@Entity
@Table(name = "project_wbs")
public class ProjectWbs implements Serializable {

    @Id
    @Column(name="wbs_id", nullable = false, length = 64)
    private String wbsId;

    @Column (name="project_definition", nullable = false, length = 64)
    private String projectDefinition;

    @Column (name="description", nullable = false)
    private String descriptionProject;

    @Column (name="short_id", nullable = false, length = 32)
    private String shortId;

    @Column (name="deleted", nullable = false)
    private Boolean deletedProject;

    @Column (name="wbs_up", nullable = false, length = 64)
    private String wbsUp;

    @Column (name="wbs_down", nullable = false, length = 64)
    private String wbsDown;

    @Column (name="wbs_left", nullable = false, length = 64)
    private String wbsLeft;

    @Column (name="wbs_right", nullable = false, length = 64)
    private String wbsRight;

    @Column (name="start_time", nullable = false)
    private Time startTime;

    @Column (name="end_time", nullable = false)
    private Time endTime;

    @Column (name="for_settlement", nullable = false)
    private Boolean forSettlementProject;

    @Column (name="account_assignment", nullable = false)
    private Boolean accountAssignment;

    public String getWbsId() {
        return wbsId;
    }

    public void setWbsId(String wbsId) {
        this.wbsId = wbsId;
    }

    public String getProjectDefinition() {
        return projectDefinition;
    }

    public void setProjectDefinition(String projectDefinition) {
        this.projectDefinition = projectDefinition;
    }

    public String getDescriptionProject() {
        return descriptionProject;
    }

    public void setDescriptionProject(String descriptionProject) {
        this.descriptionProject = descriptionProject;
    }

    public String getShortId() {
        return shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    public Boolean getDeletedProject() {
        return deletedProject;
    }

    public void setDeletedProject(Boolean deletedProject) {
        this.deletedProject = deletedProject;
    }

    public String getWbsUp() {
        return wbsUp;
    }

    public void setWbsUp(String wbsUp) {
        this.wbsUp = wbsUp;
    }

    public String getWbsDown() {
        return wbsDown;
    }

    public void setWbsDown(String wbsDown) {
        this.wbsDown = wbsDown;
    }

    public String getWbsLeft() {
        return wbsLeft;
    }

    public void setWbsLeft(String wbsLeft) {
        this.wbsLeft = wbsLeft;
    }

    public String getWbsRight() {
        return wbsRight;
    }

    public void setWbsRight(String wbsRight) {
        this.wbsRight = wbsRight;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Boolean getForSettlementProject() {
        return forSettlementProject;
    }

    public void setForSettlementProject(Boolean forSettlementProject) {
        this.forSettlementProject = forSettlementProject;
    }

    public Boolean getAccountAssignment() {
        return accountAssignment;
    }

    public void setAccountAssignment(Boolean accountAssignment) {
        this.accountAssignment = accountAssignment;
    }
}
