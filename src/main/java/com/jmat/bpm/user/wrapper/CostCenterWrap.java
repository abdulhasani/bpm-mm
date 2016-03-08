package com.jmat.bpm.user.wrapper;

import com.jmat.bpm.user.entity.CostCenter;

/**
 * Created by User on 3/8/2016.
 */
public class CostCenterWrap {

    private final String resource = "ConstCenter";

    private String costCenterId;

    private String name;

    private Boolean isActive;

    private String descriptionCost;

    private String ownerCost;

    private Boolean deletedCost;

    private Boolean forSettlement;

    public CostCenterWrap() {
    }

    public CostCenterWrap(CostCenter entity) {
        this.costCenterId = entity.getCostCenterId();
        this.name = entity.getCostCenterId();
        this.isActive = entity.getActive();
        this.descriptionCost = entity.getDescriptionCost();
        this.ownerCost = entity.getOwnerCost();
        this.deletedCost = entity.getDeletedCost();
        this.forSettlement = entity.getForSettlement();
    }

    public String getResource() {
        return resource;
    }

    public String getCostCenterId() {
        return costCenterId;
    }

    public void setCostCenterId(String costCenterId) {
        this.costCenterId = costCenterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getDescriptionCost() {
        return descriptionCost;
    }

    public void setDescriptionCost(String descriptionCost) {
        this.descriptionCost = descriptionCost;
    }

    public String getOwnerCost() {
        return ownerCost;
    }

    public void setOwnerCost(String ownerCost) {
        this.ownerCost = ownerCost;
    }

    public Boolean getDeletedCost() {
        return deletedCost;
    }

    public void setDeletedCost(Boolean deletedCost) {
        this.deletedCost = deletedCost;
    }

    public Boolean getForSettlement() {
        return forSettlement;
    }

    public void setForSettlement(Boolean forSettlement) {
        this.forSettlement = forSettlement;
    }
}
