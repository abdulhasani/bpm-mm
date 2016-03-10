package com.jmat.bpm.ses.wrapper;



import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("po_no")
    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    @JsonProperty("item_no")
    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    @JsonProperty("item_desc")
    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    @JsonProperty("package_no")
    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    @JsonProperty("item_category")
    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    @JsonProperty("material_no")
    public String getMaterialNo() {
        return materialNo;
    }

    public void setMaterialNo(String materialNo) {
        this.materialNo = materialNo;
    }

    @JsonProperty("quantity")
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("uom")
    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("net_price")
    public Double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(Double netPrice) {
        this.netPrice = netPrice;
    }

    @JsonProperty("sub_total")
    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    @JsonProperty("plant")
    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    @JsonProperty("account_assignment_cateory")
    public String getAccountAssignmentCategory() {
        return accountAssignmentCategory;
    }

    public void setAccountAssignmentCategory(String accountAssignmentCategory) {
        this.accountAssignmentCategory = accountAssignmentCategory;
    }

    @JsonProperty("distribution_type")
    public Integer getDistributionType() {
        return distributionType;
    }

    public void setDistributionType(Integer distributionType) {
        this.distributionType = distributionType;
    }

    @JsonProperty("delivery_date")
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @JsonProperty("purch_order_content")
    public ArrayTransfer<PurchOrderContentWrap> getPurchOrderContentWrapList() {
        return purchOrderContentWrapList;
    }

    public void setPurchOrderContentWrapList(ArrayTransfer<PurchOrderContentWrap> purchOrderContentWrapList) {
        this.purchOrderContentWrapList = purchOrderContentWrapList;
    }
}
