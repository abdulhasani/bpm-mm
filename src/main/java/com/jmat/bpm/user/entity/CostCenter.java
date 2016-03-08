package com.jmat.bpm.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by User on 3/8/2016.
 */
@Entity
@Table(name = "cost_center")
public class CostCenter  {

    @Id
    @Column(name="cost_center_id", nullable = false, length = 64)
    private String costCenterId;

    @Column (name="name", nullable = false)
    private String name;

    @Column (name="is_active", nullable = false)
    private Boolean isActive;

    @Column (name = "description", nullable = false)
    private String descriptionCost;

    @Column (name = "owner", nullable = false, length = 64)
    private String ownerCost;

    @Column (name = "deleted")
    private Boolean deletedCost;

    @Column (name = "for_settlement")
    private Boolean forSettlement;

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
