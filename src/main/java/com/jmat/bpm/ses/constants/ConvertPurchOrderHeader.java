package com.jmat.bpm.ses.constants;

import com.jmat.bpm.ses.entity.PurchOrderHeader;
import com.jmat.bpm.ses.wrapper.PurchOrderHeaderWrap;

/**
 * Created by User on 3/10/2016.
 */
public class ConvertPurchOrderHeader {
    public static PurchOrderHeader convertToEntity(PurchOrderHeaderWrap wrap) {
        if (wrap instanceof PurchOrderHeaderWrap) {
            PurchOrderHeader purchOrderHeader = new PurchOrderHeader();
            purchOrderHeader.setId(wrap.getId());
            purchOrderHeader.setBasisCompensations(wrap.getBasisCompensations());
            purchOrderHeader.setBpmPoNo(wrap.getBpmPoNo());
            purchOrderHeader.setCommencementDate(wrap.getCommencementDate());
            purchOrderHeader.setCompanyCode(wrap.getCompanyCode());
            purchOrderHeader.setCompletion_date(wrap.getCompletion_date());
            purchOrderHeader.setCurrency(wrap.getCurrency());
            purchOrderHeader.setDocDate(wrap.getDocDate());
            purchOrderHeader.setDocType(wrap.getDocType());
            purchOrderHeader.setExchange_rate(wrap.getExchange_rate());
            purchOrderHeader.setHeaderNotes(wrap.getHeaderNotes());
            purchOrderHeader.setHeaderText(wrap.getHeaderText());
            purchOrderHeader.setInitiatorId(wrap.getInitiatorId());
            purchOrderHeader.setJobProvide(wrap.getJobProvide());
            purchOrderHeader.setPoID(wrap.getPoID());
            purchOrderHeader.setPrNo(wrap.getPrNo());
            purchOrderHeader.setProcessId(wrap.getProcessId());
            purchOrderHeader.setPurchasingGroup(wrap.getPurchasingGroup());
            purchOrderHeader.setPurchasingOrg(wrap.getPurchasingOrg());
            purchOrderHeader.setSapPoNo(wrap.getSapPoNo());
            purchOrderHeader.setScopeOfWork(wrap.getScopeOfWork());
            purchOrderHeader.setShippingInstructions(wrap.getShippingInstructions());
            purchOrderHeader.setSpecialCondReimbursable(wrap.getSpecialCondReimbursable());
            purchOrderHeader.setTotalValue(wrap.getTotalValue());
            purchOrderHeader.setValidityStart(wrap.getValidityStart());
            purchOrderHeader.setVendor(wrap.getVendor());
            purchOrderHeader.setVendorRepresentative(wrap.getVendorRepresentative());
            return purchOrderHeader;
        } else {
            return null;
        }
    }

    public static PurchOrderHeaderWrap convertToWrapper(PurchOrderHeader entity) {
        if (entity instanceof PurchOrderHeader) {

            PurchOrderHeaderWrap purchOrderHeader = new PurchOrderHeaderWrap();
            purchOrderHeader.setId(entity.getId());
            purchOrderHeader.setBasisCompensations(entity.getBasisCompensations());
            purchOrderHeader.setBpmPoNo(entity.getBpmPoNo());
            purchOrderHeader.setCommencementDate(entity.getCommencementDate());
            purchOrderHeader.setCompanyCode(entity.getCompanyCode());
            purchOrderHeader.setCompletion_date(entity.getCompletion_date());
            purchOrderHeader.setCurrency(entity.getCurrency());
            purchOrderHeader.setDocDate(entity.getDocDate());
            purchOrderHeader.setDocType(entity.getDocType());
            purchOrderHeader.setExchange_rate(entity.getExchange_rate());
            purchOrderHeader.setHeaderNotes(entity.getHeaderNotes());
            purchOrderHeader.setHeaderText(entity.getHeaderText());
            purchOrderHeader.setInitiatorId(entity.getInitiatorId());
            purchOrderHeader.setJobProvide(entity.getJobProvide());
            purchOrderHeader.setPoID(entity.getPoID());
            purchOrderHeader.setPrNo(entity.getPrNo());
            purchOrderHeader.setProcessId(entity.getProcessId());
            purchOrderHeader.setPurchasingGroup(entity.getPurchasingGroup());
            purchOrderHeader.setPurchasingOrg(entity.getPurchasingOrg());
            purchOrderHeader.setSapPoNo(entity.getSapPoNo());
            purchOrderHeader.setScopeOfWork(entity.getScopeOfWork());
            purchOrderHeader.setShippingInstructions(entity.getShippingInstructions());
            purchOrderHeader.setSpecialCondReimbursable(entity.getSpecialCondReimbursable());
            purchOrderHeader.setTotalValue(entity.getTotalValue());
            purchOrderHeader.setValidityStart(entity.getValidityStart());
            purchOrderHeader.setVendor(entity.getVendor());
            purchOrderHeader.setVendorRepresentative(entity.getVendorRepresentative());
            return purchOrderHeader;
        } else {
            return null;
        }
    }
}
