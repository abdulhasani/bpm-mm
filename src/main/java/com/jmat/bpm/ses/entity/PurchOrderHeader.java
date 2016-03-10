package com.jmat.bpm.ses.entity;



import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by User on 1/16/2016.
 */
@Entity
@Table(name = "mm_purch_order_header")
public class PurchOrderHeader {
    @Id
    @Type(type = "pg-uuid")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;
    @Column(name = "po_id", nullable = false)
    private UUID poID;
    @Column(name = "bpm_po_no", nullable = true)
    private Integer bpmPoNo;
    @Column(name = "sap_po_no", nullable = true)
    private String sapPoNo;
    @Column(name = "pr_no", nullable = false, length = 10)
    private String prNo;
    @Column(name = "process_id", nullable = false)
    private String processId;
    @Column(name = "initiator_id", nullable = true, length = 64)
    private String initiatorId;
    @Column(name = "doc_date", nullable = false)
    private Date docDate;
    @Column(name = "doc_type", nullable = false, length = 4)
    private String docType;
    @Column(name = "vendor", nullable = true, length = 16)
    private String vendor;
    @Column(name = "currency", nullable = false, length = 5)
    private String currency;
    @Column(name = "company_code", nullable = false, length = 4)
    private String companyCode;
    @Column(name = "purchasing_org", nullable = true, length = 4)
    private String purchasingOrg;
    @Column(name = "purchasing_group", nullable = false, length = 3)
    private String purchasingGroup;
    @Column(name = "validity_start", nullable = true)
    private Date validityStart;
    @Column(name = "completion_date", nullable = true)
    private Date completion_date;
    @Column(name = "exchange_rate", nullable = true, length = 18, precision = 3)
    private Double exchange_rate;
    @Column(name = "commencement_date", nullable = true)
    private Date commencementDate;
    @Column(name = "total_value", nullable = true, length = 18, precision = 3)
    private Double totalValue;
    @Column(name = "header_text", nullable = true)
    private String headerText;
    @Column(name = "header_notes", nullable = true)
    private String headerNotes;
    @Column(name = "scope_of_work", nullable = true)
    private String scopeOfWork;
    @Column(name = "job_representative", nullable = true)
    private String jobRepresentative;
    @Column(name = "vendor_representative", nullable = true)
    private String vendorRepresentative;
    @Column(name = "job_provide")
    private String jobProvide;
    @Column(name = "special_cond_reimbursable", nullable = true)
    private String specialCondReimbursable;
    @Column(name = "basis_compensations", nullable = true)
    private String basisCompensations;
    @Column(name = "shipping_instructions", nullable = true)
    private String shippingInstructions;
    @Column(name = "deleted", nullable = false)
    private Boolean deleted;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }


}

