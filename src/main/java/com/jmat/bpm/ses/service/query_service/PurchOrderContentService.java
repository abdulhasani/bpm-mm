package com.jmat.bpm.ses.service.query_service;


import com.jmat.bpm.ses.entity.PurchOrderContent;

import java.util.List;

/**
 * Created by User on 3/10/2016.
 */
public interface PurchOrderContentService {
    public List<PurchOrderContent> findAll();
    public List<PurchOrderContent> findByPoIDAndPrNo(String poId,String prNo);
}
