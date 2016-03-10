package com.jmat.bpm.ses.service.query_service_impl;

import com.jmat.bpm.ses.entity.PurchOrderContent;
import com.jmat.bpm.ses.repository.PurchOrderContentRepository;
import com.jmat.bpm.ses.service.query_service.PurchOrderContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by User on 3/10/2016.
 */
@Service("purchOrderContentService")
@Transactional(readOnly = true)
public class PurchOrderContentServiceImpl implements PurchOrderContentService {

    @Autowired
    private PurchOrderContentRepository purchOrderContentRepository;

    @Override
    public List<PurchOrderContent> findAll() {
        return purchOrderContentRepository.findAll();
    }

    @Override
    public List<PurchOrderContent> findByPoIDAndPrNo(@Param("poId") String poId, @Param("prNo") String prNo) {
        return purchOrderContentRepository.findByPoIDAndPrNo(poId,prNo);
    }


}
