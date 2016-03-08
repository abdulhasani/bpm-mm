package com.jmat.bpm.user.wrapper;

import com.jmat.bpm.user.entity.Employee;

import java.util.Date;

/**
 * Created by User on 3/8/2016.
 */
public class EmployeeWrap {
    private final String resource = "EmployeeWrap";

    private String payrollNum;

    private String nameFirst;

    private String nameLast;

    private Date validForm;

    private Date validTo;

    private String status;

    private String phoneNum;

    private String motherName;

    private CostCenterWrap costCenterWrap;

    private String orgUnit;

    private String vendorNum;

    private String houseBank;

    private String paymentMethod;

    private String partnerBank;

    private Boolean deleted;

    private FuncPositionWrap funcPositionWrap;

    private String customerNum;

    private String locatioN;

    private String nameFull;

    private String workingDayType;

    private String employmentStatus;

    private Boolean assetCustodian;

    public EmployeeWrap() {
    }

    public EmployeeWrap(Employee entity) {

        this.payrollNum = entity.getPayrollNum();
        this.nameFirst = entity.getNameFirst();
        this.nameLast = entity.getNameLast();
        this.validForm = entity.getValidFrom();
        this.validTo = entity.getValidTo();

        this.status = entity.getStatus();
        this.phoneNum = entity.getPhoneNum();
        this.motherName = entity.getMotherName();
        this.costCenterWrap = new CostCenterWrap(entity.getCostCenterDefault());
        this.orgUnit = entity.getOrgUnit();
        this.vendorNum = entity.getVendorNum();

        this.houseBank = entity.getHouseBank();
        this.paymentMethod = entity.getPaymentMethod();
        this.partnerBank = entity.getPartnerBank();
        this.deleted = entity.getDeleted();
        this.funcPositionWrap = new FuncPositionWrap(entity.getFuncPosition());
        this.customerNum = entity.getCustomerNum();

        this.locatioN = entity.getLocatioN();
        this.nameFull = entity.getNameFull();
        this.workingDayType = entity.getWorkingDayType();
        this.employmentStatus = entity.getEmploymentStatus();
        this.assetCustodian = entity.getAssetCustodian();


    }

    public String getResource() {
        return resource;
    }

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

    public Date getValidForm() {
        return validForm;
    }

    public void setValidForm(Date validForm) {
        this.validForm = validForm;
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

    public CostCenterWrap getCostCenterWrap() {
        return costCenterWrap;
    }

    public void setCostCenterWrap(CostCenterWrap costCenterWrap) {
        this.costCenterWrap = costCenterWrap;
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

    public FuncPositionWrap getFuncPositionWrap() {
        return funcPositionWrap;
    }

    public void setFuncPositionWrap(FuncPositionWrap funcPositionWrap) {
        this.funcPositionWrap = funcPositionWrap;
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
