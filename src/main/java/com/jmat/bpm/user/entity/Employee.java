package com.jmat.bpm.user.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 3/8/2016.
 */
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name="payroll_num", nullable = false, length = 64)
    private String payrollNum;

    @Column (name = "name_first", nullable = false, length = 128)
    private String nameFirst;

    @Column (name = "name_last", nullable = false, length = 128)
    private String nameLast;

    @Column (name = "valid_from", nullable = false)
    private Date validFrom;

    @Column (name = "valid_to", nullable = false)
    private Date validTo;

    @Column (name = "status", nullable = false, length = 6)
    private String status;

    @Column (name = "phone_num", nullable = false, length = 32)
    private String phoneNum;

    @Column (name = "mother_name", nullable = false, length = 256)
    private String motherName;

    @ManyToOne
    @JoinColumn (name = "cost_center_default", nullable = true, foreignKey=@ForeignKey(name = "cost_center_employee_fk"))
    private CostCenter costCenterDefault;

    @Column (name = "org_unit", nullable = false)
    private String orgUnit;

    @Column (name = "vendor_num", nullable = false)
    private String vendorNum;

    @Column (name = "house_bank", nullable = false)
    private String houseBank;

    @Column (name = "payment_method", nullable = false)
    private String paymentMethod;

    @Column (name = "partner_bank", nullable = false)
    private String partnerBank;

    @Column (name = "deleted")
    private Boolean deleted;

    @ManyToOne
    @JoinColumn (name = "func_position", nullable = false, foreignKey = @ForeignKey(name = "employee_func_position_fk"))
    private FuncPosition funcPosition;

    @Column (name = "customer_num", nullable = false)
    private String customerNum;

    @Column (name = "location", nullable = false)
    private String locatioN;

    @Column (name = "name_full", nullable = false)
    private String nameFull;

    @Column (name = "working_day_type", nullable = false)
    private String workingDayType;

    @Column (name = "employment_status", nullable = false)
    private String employmentStatus;

    @Column (name = "asset_custodian")
    private Boolean assetCustodian;


    public String getPayrollNum() {
        return payrollNum;
    }

    public void setPayrollNum(String payrollNum) {
        this.payrollNum = payrollNum;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public CostCenter getCostCenterDefault() {
        return costCenterDefault;
    }

    public void setCostCenterDefault(CostCenter costCenterDefault) {
        this.costCenterDefault = costCenterDefault;
    }

    public String getOrgUnit() {
        return orgUnit;
    }

    public void setOrgUnit(String orgUnit) {
        this.orgUnit = orgUnit;
    }

    public String getVendorNum() {
        return vendorNum;
    }

    public void setVendorNum(String vendorNum) {
        this.vendorNum = vendorNum;
    }

    public String getHouseBank() {
        return houseBank;
    }

    public void setHouseBank(String houseBank) {
        this.houseBank = houseBank;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPartnerBank() {
        return partnerBank;
    }

    public void setPartnerBank(String partnerBank) {
        this.partnerBank = partnerBank;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public FuncPosition getFuncPosition() {
        return funcPosition;
    }

    public void setFuncPosition(FuncPosition funcPosition) {
        this.funcPosition = funcPosition;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public String getLocatioN() {
        return locatioN;
    }

    public void setLocatioN(String locatioN) {
        this.locatioN = locatioN;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public String getWorkingDayType() {
        return workingDayType;
    }

    public void setWorkingDayType(String workingDayType) {
        this.workingDayType = workingDayType;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public Boolean getAssetCustodian() {
        return assetCustodian;
    }

    public void setAssetCustodian(Boolean assetCustodian) {
        this.assetCustodian = assetCustodian;
    }
}
