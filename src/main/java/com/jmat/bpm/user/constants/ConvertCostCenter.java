package com.jmat.bpm.user.constants;

import com.jmat.bpm.user.entity.CostCenter;
import com.jmat.bpm.user.wrapper.CostCenterWrap;

/**
 * Created by User on 3/8/2016.
 */
public class ConvertCostCenter {
    public static CostCenter convertToEntity(CostCenterWrap wrap) {
        if (wrap instanceof CostCenterWrap) {
            CostCenter costCenter = new CostCenter();
            costCenter.setCostCenterId(wrap.getCostCenterId());
            costCenter.setName(wrap.getName());
            costCenter.setActive(wrap.getActive());
            costCenter.setDescriptionCost(wrap.getDescriptionCost());
            costCenter.setOwnerCost(wrap.getOwnerCost());
            costCenter.setDeletedCost(wrap.getDeletedCost());
            costCenter.setForSettlement(wrap.getForSettlement());
            return costCenter;
        } else {
            return null;
        }
    }

    public static CostCenterWrap convertToWrapper(CostCenter entity) {
        if (entity instanceof CostCenter) {
            CostCenterWrap costCenterWrap=new CostCenterWrap();
            costCenterWrap.setCostCenterId(entity.getCostCenterId());
            costCenterWrap.setActive(entity.getActive());
            costCenterWrap.setDeletedCost(entity.getDeletedCost());
            costCenterWrap.setDescriptionCost(entity.getDescriptionCost());
            costCenterWrap.setForSettlement(entity.getForSettlement());
            costCenterWrap.setName(entity.getName());
            costCenterWrap.setOwnerCost(entity.getOwnerCost());
            return costCenterWrap;
        } else {
            return null;
        }
    }
}
