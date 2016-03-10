package com.jmat.bpm.ses.wrapper;


import com.fasterxml.jackson.annotation.JsonProperty;
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
        this.bpmPoNo = entity.getBpmPoNo();
        this.sapPoNo = entity.getSapPoNo();
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

    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    @JsonProperty("po_id")
    public UUID getPoID() {
        return poID;
    }

    public void setPoID(UUID poID) {
        this.poID = poID;
    }

    @JsonProperty("bpm_po_no")
    public Integer getBpmPoNo() {
        return bpmPoNo;
    }

    public void setBpmPoNo(Integer bpmPoNo) {
        this.bpmPoNo = bpmPoNo;
    }

    @JsonProperty("sap_po_no")
    public String getSapPoNo() {
        return sapPoNo;
    }

    public void setSapPoNo(String sapPoNo) {
        this.sapPoNo = sapPoNo;
    }

    @JsonProperty("pr_no")
    public String getPrNo() {
        return prNo;
    }

    public void setPrNo(String prNo) {
        this.prNo = prNo;
    }

    @JsonProperty("proccess_id")
    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    @JsonProperty("initiator_id")
    public String getInitiatorId() {
        return initiatorId;
    }

    public void setInitiatorId(String initiatorId) {
        this.initiatorId = initiatorId;
    }

    @JsonProperty("doc_date")
    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    @JsonProperty("doc_type")
    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    @JsonProperty("vendor")
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("company_code")
    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    @JsonProperty("purchasing_org")
    public String getPurchasingOrg() {
        return purchasingOrg;
    }

    public void setPurchasingOrg(String purchasingOrg) {
        this.purchasingOrg = purchasingOrg;
    }

    @JsonProperty("purchasing_group")
    public String getPurchasingGroup() {
        return purchasingGroup;
    }

    public void setPurchasingGroup(String purchasingGroup) {
        this.purchasingGroup = purchasingGroup;
    }

    @JsonProperty("validity_start")
    public Date getValidityStart() {
        return validityStart;
    }

    public void setValidityStart(Date validityStart) {
        this.validityStart = validityStart;
    }

    @JsonProperty("completion_date")
    public Date getCompletion_date() {
        return completion_date;
    }

    public void setCompletion_date(Date completion_date) {
        this.completion_date = completion_date;
    }

    @JsonProperty("exchange_rate")
    public Double getExchange_rate() {
        return exchange_rate;
    }

    public void setExchange_rate(Double exchange_rate) {
        this.exchange_rate = exchange_rate;
    }

    @JsonProperty("commencement_date")
    public Date getCommencementDate() {
        return commencementDate;
    }

    public void setCommencementDate(Date commencementDate) {
        this.commencementDate = commencementDate;
    }

    @JsonProperty("total_value")
    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    @JsonProperty("header_text")
    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    @JsonProperty("header_notes")
    public String getHeaderNotes() {
        return headerNotes;
    }

    public void setHeaderNotes(String headerNotes) {
        this.headerNotes = headerNotes;
    }

    @JsonProperty("scope_of_work")
    public String getScopeOfWork() {
        return scopeOfWork;
    }

    public void setScopeOfWork(String scopeOfWork) {
        this.scopeOfWork = scopeOfWork;
    }

    @JsonProperty("job_representative")
    public String getJobRepresentative() {
        return jobRepresentative;
    }

    public void setJobRepresentative(String jobRepresentative) {
        this.jobRepresentative = jobRepresentative;
    }

    @JsonProperty("vendor_representative")
    public String getVendorRepresentative() {
        return vendorRepresentative;
    }

    public void setVendorRepresentative(String vendorRepresentative) {
        this.vendorRepresentative = vendorRepresentative;
    }

    @JsonProperty("job_provide")
    public String getJobProvide() {
        return jobProvide;
    }

    public void setJobProvide(String jobProvide) {
        this.jobProvide = jobProvide;
    }

    @JsonProperty("special_cond_reimbursable")
    public String getSpecialCondReimbursable() {
        return specialCondReimbursable;
    }

    public void setSpecialCondReimbursable(String specialCondReimbursable) {
        this.specialCondReimbursable = specialCondReimbursable;
    }

    @JsonProperty("basis_compensations")
    public String getBasisCompensations() {
        return basisCompensations;
    }

    public void setBasisCompensations(String basisCompensations) {
        this.basisCompensations = basisCompensations;
    }

    @JsonProperty("shipping_instructions")
    public String getShippingInstructions() {
        return shippingInstructions;
    }

    public void setShippingInstructions(String shippingInstructions) {
        this.shippingInstructions = shippingInstructions;

    }

    @JsonProperty("purch_order_item_content")
    public ArrayTransfer<PurchOrderItemContentWrap> getPurchOrderItemContentArr() {
        return purchOrderItemContentArr;
    }

    public void setPurchOrderItemContentArr(ArrayTransfer<PurchOrderItemContentWrap> purchOrderItemContentArr) {
        this.purchOrderItemContentArr = purchOrderItemContentArr;
    }

}
