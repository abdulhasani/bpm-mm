package com.jmat.bpm.ses.wrapper;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.jmat.bpm.ses.entity.PurchOrderContent;

import java.util.UUID;

/**
 * Created by User on 1/20/2016.
 */
public class PurchOrderContentWrap {

    private final String resource = "PurchOrderContentWrap";

    private UUID id;

    private UUID poID;

    private Integer bpmPoNo;

    private String sapPoNo;

    private String prNo;

    private String itemNo;

    private String line_no;

    private Double grossPrice;

    private String activityNo;

    private Double quantity;

    private String uom;

    private Double percentage;

    private Double netValue;

    private String costCenter;

    private String wbs;

    private String glAccount;

    public PurchOrderContentWrap(PurchOrderContent entity) {

        this.id = entity.getId();
        this.poID = entity.getPoID();
        this.bpmPoNo = entity.getBpmPoNo();
        this.sapPoNo = entity.getSapPoNo();
        this.prNo = entity.getPrNo();
        this.itemNo = entity.getItemNo();
        this.line_no = entity.getLine_no();
        this.grossPrice = entity.getGrossPrice();
        this.activityNo = entity.getActivityNo();
        this.quantity = entity.getQuantity();
        this.uom = entity.getUom();
        this.percentage = entity.getPercentage();
        this.netValue = entity.getNetValue();
        this.costCenter = entity.getCostCenter();
        this.wbs = entity.getWbs();
        this.glAccount = entity.getGlAccount();
    }

    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    @JsonProperty("item_no")
    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    @JsonProperty("line_no")
    public String getLine_no() {
        return line_no;
    }

    public void setLine_no(String line_no) {
        this.line_no = line_no;
    }

    @JsonProperty("gross_price")
    public Double getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(Double grossPrice) {
        this.grossPrice = grossPrice;
    }

    @JsonProperty("activity_no")
    public String getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo;
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

    @JsonProperty("percentage")
    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @JsonProperty("net_value")
    public Double getNetValue() {
        return netValue;
    }

    public void setNetValue(Double netValue) {
        this.netValue = netValue;
    }

    @JsonProperty("cost_center")
    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    @JsonProperty("wbs")
    public String getWbs() {
        return wbs;
    }

    public void setWbs(String wbs) {
        this.wbs = wbs;
    }

    @JsonProperty("gl_account")
    public String getGlAccount() {
        return glAccount;
    }

    public void setGlAccount(String glAccount) {
        this.glAccount = glAccount;
    }
}
