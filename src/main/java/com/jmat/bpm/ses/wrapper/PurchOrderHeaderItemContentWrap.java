package com.jmat.bpm.ses.wrapper;



import com.jmat.bpm.ses.entity.PurchOrderHeader;
import com.jmat.bpm.support.transfer.ArrayTransfer;

import java.util.Date;
import java.util.UUID;

/**
 * Created by User on 1/19/2016.
 */
public class PurchOrderHeaderItemContentWrap {

    private final String resource = "PurchOrderHeaderItemContent";

    private UUID poID;

    private Integer bpmPoNo;

    private String sapPoNo;

    private String prNo;

    private String processId;

    private String initiatorId;

    private Date docDate;

    private String docType;

    private String vendor;

    private String currency;

    private String companyCode;

    private String purchasingOrg;

    private String purchasingGroup;

    private Date validityStart;

    private Date completion_date;

    private Double exchange_rate;

    private Date commencementDate;

    private Double totalValue;

    private String headerText;

    private String headerNotes;

    private String scopeOfWork;

    private String jobRepresentative;

    private String vendorRepresentative;

    private String jobProvide;

    private String specialCondReimbursable;

    private String basisCompensations;

    private String shippingInstructions;

    private ArrayTransfer<PurchOrderItemContentWrap> purchOrderItemContentArr;

    public PurchOrderHeaderItemContentWrap(PurchOrderHeader entity) {
        this.poID = entity.getPoID();
        this.bpmPoNo=entity.getBpmPoNo();
        this.sapPoNo=entity.getSapPoNo();
        this.prNo = entity.getPrNo();
        this.processId = entity.getProcessId();
        this.initiatorId = entity.getInitiatorId();
        this.docDate = entity.getDocDate();
        this.docType = entity.getDocType();
        this.vendor = entity.getVendor();
        this.currency = entity.getCurrency();
        this.companyCode = entity.getCompanyCode();
        this.purchasingOrg = entity.getPurchasingOrg();
        this.purchasingGroup = entity.getPurchasingGroup();
        this.validityStart = entity.getValidityStart();
        this.completion_date = entity.getCompletion_date();
        this.exchange_rate = entity.getExchange_rate();
        this.commencementDate = entity.getCommencementDate();
        this.totalValue = entity.getTotalValue();
        this.headerText = entity.getHeaderText();
        this.headerNotes = entity.getHeaderNotes();
        this.scopeOfWork = entity.getScopeOfWork();
        this.jobRepresentative = entity.getJobRepresentative();
        this.vendorRepresentative = entity.getVendorRepresentative();
        this.jobProvide = entity.getJobProvide();
        this.specialCondReimbursable = entity.getSpecialCondReimbursable();
        this.basisCompensations = entity.getBasisCompensations();
        this.shippingInstructions = entity.getShippingInstructions();
    }

    public String getResource() {
        return resource;
    }

    public UUID getPoID() {
        return poID;
    }

    public void setPoID(UUID poID) {
        this.poID = poID;
    }

    public Integer getBpmPoNo() {
        return bpmPoNo;
    }

    public void setBpmPoNo(Integer bpmPoNo) {
        this.bpmPoNo = bpmPoNo;
    }

    public String getSapPoNo() {
        return sapPoNo;
    }

    public void setSapPoNo(String sapPoNo) {
        this.sapPoNo = sapPoNo;
    }

    public String getPrNo() {
        return prNo;
    }

    public void setPrNo(String prNo) {
        this.prNo = prNo;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getInitiatorId() {
        return initiatorId;
    }

    public void setInitiatorId(String initiatorId) {
        this.initiatorId = initiatorId;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getPurchasingOrg() {
        return purchasingOrg;
    }

    public void setPurchasingOrg(String purchasingOrg) {
        this.purchasingOrg = purchasingOrg;
    }

    public String getPurchasingGroup() {
        return purchasingGroup;
    }

    public void setPurchasingGroup(String purchasingGroup) {
        this.purchasingGroup = purchasingGroup;
    }

    public Date getValidityStart() {
        return validityStart;
    }

    public void setValidityStart(Date validityStart) {
        this.validityStart = validityStart;
    }

    public Date getCompletion_date() {
        return completion_date;
    }

    public void setCompletion_date(Date completion_date) {
        this.completion_date = completion_date;
    }

    public Double getExchange_rate() {
        return exchange_rate;
    }

    public void setExchange_rate(Double exchange_rate) {
        this.exchange_rate = exchange_rate;
    }

    public Date getCommencementDate() {
        return commencementDate;
    }

    public void setCommencementDate(Date commencementDate) {
        this.commencementDate = commencementDate;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public String getHeaderNotes() {
        return headerNotes;
    }

    public void setHeaderNotes(String headerNotes) {
        this.headerNotes = headerNotes;
    }

    public String getScopeOfWork() {
        return scopeOfWork;
    }

    public void setScopeOfWork(String scopeOfWork) {
        this.scopeOfWork = scopeOfWork;
    }

    public String getJobRepresentative() {
        return jobRepresentative;
    }

    public void setJobRepresentative(String jobRepresentative) {
        this.jobRepresentative = jobRepresentative;
    }

    public String getVendorRepresentative() {
        return vendorRepresentative;
    }

    public void setVendorRepresentative(String vendorRepresentative) {
        this.vendorRepresentative = vendorRepresentative;
    }

    public String getJobProvide() {
        return jobProvide;
    }

    public void setJobProvide(String jobProvide) {
        this.jobProvide = jobProvide;
    }

    public String getSpecialCondReimbursable() {
        return specialCondReimbursable;
    }

    public void setSpecialCondReimbursable(String specialCondReimbursable) {
        this.specialCondReimbursable = specialCondReimbursable;
    }

    public String getBasisCompensations() {
        return basisCompensations;
    }

    public void setBasisCompensations(String basisCompensations) {
        this.basisCompensations = basisCompensations;
    }

    public String getShippingInstructions() {
        return shippingInstructions;
    }

    public void setShippingInstructions(String shippingInstructions) {
        this.shippingInstructions = shippingInstructions;

    }

    public ArrayTransfer<PurchOrderItemContentWrap> getPurchOrderItemContentArr() {
        return purchOrderItemContentArr;
    }

    public void setPurchOrderItemContentArr(ArrayTransfer<PurchOrderItemContentWrap> purchOrderItemContentArr) {
        this.purchOrderItemContentArr = purchOrderItemContentArr;
    }

}
