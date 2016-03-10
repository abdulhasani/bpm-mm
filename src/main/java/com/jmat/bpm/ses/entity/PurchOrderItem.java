package com.jmat.bpm.ses.entity;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by User on 1/18/2016.
 */
@Entity
@Table(name = "mm_purch_order_item")
public class PurchOrderItem {
    @Id
    @Type(type = "pg-uuid")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;
    @Column(name = "po_id", nullable = false)
    private UUID poID;
    @Column(name = "bpm_po_no",nullable =true)
    private Integer bpmPoNo;
    @Column(name = "sap_po_no",nullable = true)
    private String sapPoNo;
    @Column(name = "pr_no", nullable = false, length = 10)
    private String prNo;
    @Column(name = "po_no",nullable = true)
    private String poNo;
    @Column(name = "item_no",nullable = false,length = 5)
    private String itemNo;
    @Column(name = "item_desc",nullable = true)
    private String itemDesc;
    @Column(name = "package_no",nullable = true,length = 5)
    private String packageNo;
    @Column(name = "item_category",nullable = false,length = 3)
    private String itemCategory;
    @Column(name = "material_no",nullable = true,length = 18)
    private String materialNo;
    @Column(name = "quantity",nullable = false,length = 13,precision = 3)
    private Double quantity;
    @Column(name = "uom",nullable = true,length = 8)
    private String uom;
    @Column(name = "currency",nullable = false,length = 5)
    private String currency;
    @Column(name = "net_price",nullable = false,length = 18,precision = 2)
    private Double netPrice;
    @Column(name = "subtotal",nullable = true,length = 18,precision = 2)
    private Double subtotal;
    @Column(name = "plant",nullable = true,length = 8)
    private String plant;
    @Column(name = "account_assignment_category",nullable = true,length = 3)
    private String accountAssignmentCategory;
    @Column(name = "distribution_type",nullable = true)
    private Integer distributionType;
    @Column(name = "delivery_date",nullable = true)
    private Date deliveryDate;
    @Column(name = "deleted",nullable = false)
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
