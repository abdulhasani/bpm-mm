package com.jmat.bpm.ses.service.query_service_impl;

import com.jmat.bpm.ses.entity.PurchOrderHeader;
import com.jmat.bpm.ses.repository.PurchOrderHeaderRepository;
import com.jmat.bpm.ses.service.query_service.PurchOrderHeaderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by User on 3/10/2016.
 */
@Service("purchOrderHeaderService")
@Transactional(readOnly = true)
public class PurchOrderHeaderServiceImpl implements PurchOrderHeaderService{
    private static final Logger LOG= LoggerFactory.getLogger(PurchOrderHeaderServiceImpl.class);

    @Autowired
    private PurchOrderHeaderRepository purchOrderHeaderRepository;

    @Override
    public List<PurchOrderHeader> getPurchOrderHeaders() {
        return purchOrderHeaderRepository.findAll();
    }

    @Override
    public List<PurchOrderHeader> search(String poId, String prNo, String bpmPoNo, String purOrg, String purGroup) {
        return purchOrderHeaderRepository.filter(poId,prNo,bpmPoNo,purOrg,purGroup);
    }

    @Override
    public PurchOrderHeader selectByPoIdANDPrNo(String poId, String prNo) {
        return purchOrderHeaderRepository.findByPoIDAndPrNo(poId,prNo);
    }

    @Override
    public Long count() {
        return purchOrderHeaderRepository.count();
    }

}
