package com.jmat.bpm.user.constants;

import com.jmat.bpm.user.entity.Employee;
import com.jmat.bpm.user.wrapper.EmployeeWrap;

/**
 * Created by User on 3/8/2016.
 */
public class ConvertEmployee {
    public static Employee convertToEntity(EmployeeWrap wrap) {
        if (wrap instanceof EmployeeWrap) {
            Employee employee = new Employee();
            employee.setPayrollNum(wrap.getPayrollNum());
            employee.setNameFirst(wrap.getNameFirst());
            employee.setNameLast(wrap.getNameLast());
            employee.setValidFrom(wrap.getValidForm());
            employee.setValidTo(wrap.getValidTo());
            employee.setStatus(wrap.getStatus());
            employee.setPhoneNum(wrap.getPhoneNum());
            employee.setMotherName(wrap.getMotherName());
            employee.setCostCenterDefault(ConvertCostCenter.convertToEntity(wrap.getCostCenterWrap()));
            employee.setOrgUnit(wrap.getOrgUnit());
            employee.setVendorNum(wrap.getVendorNum());
            employee.setHouseBank(wrap.getHouseBank());
            employee.setPaymentMethod(wrap.getPaymentMethod());
            employee.setPartnerBank(wrap.getPartnerBank());
            employee.setDeleted(wrap.getDeleted());
            employee.setFuncPosition(ConvertFuncPosition.convertToEntity(wrap.getFuncPositionWrap()));
            employee.setCustomerNum(wrap.getCustomerNum());
            employee.setLocatioN(wrap.getLocatioN());
            employee.setNameFull(wrap.getNameFull());
            employee.setWorkingDayType(wrap.getWorkingDayType());
            employee.setEmploymentStatus(wrap.getEmploymentStatus());
            employee.setAssetCustodian(wrap.getAssetCustodian());
            return employee;
        } else {
            return null;
        }
    }

    public static EmployeeWrap convertToWrapper(Employee entity) {
        if (entity instanceof Employee) {
            EmployeeWrap employeeWrap = new EmployeeWrap();
            employeeWrap.setAssetCustodian(entity.getAssetCustodian());
            employeeWrap.setCostCenterWrap(ConvertCostCenter.convertToWrapper(entity.getCostCenterDefault()));
            employeeWrap.setCustomerNum(entity.getCustomerNum());
            employeeWrap.setDeleted(entity.getDeleted());
            employeeWrap.setEmploymentStatus(employeeWrap.getStatus());
            employeeWrap.setFuncPositionWrap(ConvertFuncPosition.convertToWrapper(entity.getFuncPosition()));
            employeeWrap.setHouseBank(entity.getHouseBank());
            employeeWrap.setLocatioN(entity.getLocatioN());
            employeeWrap.setMotherName(entity.getMotherName());
            employeeWrap.setNameFirst(entity.getNameFirst());
            employeeWrap.setNameFull(entity.getNameFull());
            employeeWrap.setNameLast(entity.getNameLast());
            employeeWrap.setOrgUnit(entity.getOrgUnit());
            employeeWrap.setPartnerBank(entity.getPartnerBank());
            employeeWrap.setPaymentMethod(entity.getPaymentMethod());
            employeeWrap.setPayrollNum(entity.getPayrollNum());
            employeeWrap.setPhoneNum(entity.getPhoneNum());
            employeeWrap.setStatus(entity.getStatus());
            employeeWrap.setValidForm(entity.getValidFrom());
            employeeWrap.setValidTo(entity.getValidTo());
            employeeWrap.setVendorNum(entity.getVendorNum());
            employeeWrap.setWorkingDayType(entity.getWorkingDayType());
            return employeeWrap;
        } else {
            return null;
        }
    }
}
