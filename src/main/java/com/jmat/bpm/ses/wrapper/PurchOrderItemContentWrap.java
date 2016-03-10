package com.jmat.bpm.ses.wrapper;



import com.jmat.bpm.ses.entity.PurchOrderItem;
import com.jmat.bpm.support.transfer.ArrayTransfer;

import java.util.Date;
import java.util.UUID;

/**
 * Created by User on 1/22/2016.
 */
public class PurchOrderItemContentWrap {
    private final String resource="PurchOrderItemContentWrap";

    private UUID poID;

    private Integer bpmPoNo;

    private String sapPoNo;

    private String prNo;

    private String poNo;

    private String itemNo;

    private String itemDesc;

    private String packageNo;

    private String itemCategory;

    private String materialNo;

    private Double quantity;

    private String uom;

    private String currency;

    private Double netPrice;

    private Double subtotal;

    private String plant;

    private String accountAssignmentCategory;

    private Integer distributionType;

    private Date deliveryDate;

    private ArrayTransfer<PurchOrderContentWrap> purchOrderContentWrapList;

    public PurchOrderItemContentWrap(PurchOrderItem entity) {
        this.poID = entity.getPoID();
        this.bpmPoNo=entity.getBpmPoNo();
        this.sapPoNo=entity.getSapPoNo();
        this.prNo = entity.getPrNo();
        this.poNo = entity.getPoNo();
        this.itemNo = entity.getItemNo();
        this.itemDesc = entity.getItemDesc();
        this.packageNo = entity.getPackageNo();
        this.itemCategory = entity.getItemCategory();
        this.materialNo = entity.getMaterialNo();
        this.quantity = entity.getQuantity();
        this.uom = entity.getUom();
        this.currency = entity.getCurrency();
        this.netPrice = entity.getNetPrice();
        this.subtotal = entity.getSubtotal();
        this.plant = entity.getPlant();
        this.accountAssignmentCategory = entity.getAccountAssignmentCategory();
        this.distributionType = entity.getDistributionType();
        this.deliveryDate = entity.getDeliveryDate();
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

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getMaterialNo() {
        return materialNo;
    }

    public void setMaterialNo(String materialNo) {
        this.materialNo = materialNo;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(Double netPrice) {
        this.netPrice = netPrice;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getAccountAssignmentCategory() {
        return accountAssignmentCategory;
    }

    public void setAccountAssignmentCategory(String accountAssignmentCategory) {
        this.accountAssignmentCategory = accountAssignmentCategory;
    }

    public Integer getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(Integer distributionType) {
        this.distributionType = distributionType;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public ArrayTransfer<PurchOrderContentWrap> getPurchOrderContentWrapList() {
        return purchOrderContentWrapList;
    }

    public void setPurchOrderContentWrapList(ArrayTransfer<PurchOrderContentWrap> purchOrderContentWrapList) {
        this.purchOrderContentWrapList = purchOrderContentWrapList;
    }
}
