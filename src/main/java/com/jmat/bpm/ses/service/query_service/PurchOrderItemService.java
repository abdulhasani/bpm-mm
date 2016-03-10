package com.jmat.bpm.ses.service.query_service;

import com.jmat.bpm.ses.entity.PurchOrderItem;

import java.util.List;

/**
 * Created by User on 3/10/2016.
 */
public interface PurchOrderItemService {
    public List<PurchOrderItem> getPurchOrderItems();
    public List<PurchOrderItem> findByPoIDAndPrNo(String poId, String prNo);
    public Long count();
}
