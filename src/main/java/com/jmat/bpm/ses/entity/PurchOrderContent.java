package com.jmat.bpm.ses.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by User on 1/18/2016.
 */
@Entity
@Table(name = "mm_purch_order_content")
public class PurchOrderContent  {
    @Id
    @Type(type = "pg-uuid")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy = "uuid2")
    private UUID id;

    @Column(name = "po_id", nullable = false)
    private UUID poID;
    @Column(name = "bpm_po_no",nullable =true)
    private Integer bpmPoNo;
    @Column(name = "sap_po_no",nullable = true)
    private String sapPoNo;
    @Column(name = "pr_no", nullable = false, length = 10)
    private String prNo;
    @Column(name = "item_no",nullable = false,length = 5)
    private String itemNo;
    @Column(name = "line_no",nullable = false,length = 18)
    private String line_no;
    @Column(name = "gross_price",nullable = false,length = 18)
    private Double grossPrice;
    @Column(name = "activity_no",nullable = true,length = 18)
    private String activityNo;
    @Column(name = "quantity",nullable = false,length = 13,precision = 3)
    private Double quantity;
    @Column(name = "uom",nullable = true,length = 8)
    private String uom;
    @Column(name = "percentage",nullable = true,length = 10,precision = 3)
    private Double percentage;
    @Column(name = "net_value",nullable = true,length = 18,precision = 2)
    private Double netValue;
    @Column(name = "cost_center",nullable = true,length = 24)
    private String costCenter;
    @Column(name = "wbs",nullable = true,length = 24)
    private String wbs;
    @Column(name = "gl_account",nullable = true,length = 24)
    private String glAccount;


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

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getLine_no() {
        return line_no;
    }

    public void setLine_no(String line_no) {
        this.line_no = line_no;
    }

    public Double getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(Double grossPrice) {
        this.grossPrice = grossPrice;
    }

    public String getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo;
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

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Double getNetValue() {
        return netValue;
    }

    public void setNetValue(Double netValue) {
        this.netValue = netValue;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getWbs() {
        return wbs;
    }

    public void setWbs(String wbs) {
        this.wbs = wbs;
    }

    public String getGlAccount() {
        return glAccount;
    }

    public void setGlAccount(String glAccount) {
        this.glAccount = glAccount;
    }
}
