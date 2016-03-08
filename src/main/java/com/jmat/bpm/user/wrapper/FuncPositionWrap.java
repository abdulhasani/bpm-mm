package com.jmat.bpm.user.wrapper;

import com.jmat.bpm.user.entity.FuncPosition;

/**
 * Created by User on 3/8/2016.
 */
public class FuncPositionWrap {
    private final String resource = "FuncPositionWrap";

    private String positionId;

    private String positionName;

    private String description;

    private String parentId;

    private boolean deleted;

    private String positionLevel;

    public FuncPositionWrap() {
    }

    public FuncPositionWrap(FuncPosition entity) {
            this.positionId = entity.getPositionId();
            this.positionName = entity.getPositionName();
            this.description = entity.getDescription();
            this.parentId = entity.getParentId();
            this.deleted = entity.isDeleted();
            this.positionLevel = entity.getPositionLevel();
    }

    public String getResource() {
        return resource;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }
}
