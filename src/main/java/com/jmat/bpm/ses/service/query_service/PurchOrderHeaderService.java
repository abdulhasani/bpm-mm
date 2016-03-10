package com.jmat.bpm.ses.service.query_service;

import com.jmat.bpm.ses.entity.PurchOrderHeader;

import java.util.List;

/**
 * Created by User on 3/10/2016.
 */
public interface PurchOrderHeaderService {
    public List<PurchOrderHeader> getPurchOrderHeaders();

    public List<PurchOrderHeader> search(String poId, String prNo, String bpmPoNo, String purOrg, String purGroup);

    public PurchOrderHeader selectByPoIdANDPrNo(String poId, String prNo);

    public Long count();
}
