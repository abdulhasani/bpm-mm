package com.jmat.bpm.ses.service.query_service_impl;

import com.jmat.bpm.ses.entity.PurchOrderItem;
import com.jmat.bpm.ses.repository.PurchOrderItemRepository;
import com.jmat.bpm.ses.service.query_service.PurchOrderItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by User on 3/10/2016.
 */
@Service("purchOrderItemService")
@Transactional(readOnly = true)
public class PurchOrderItemServiceImpl implements PurchOrderItemService {

    @Autowired
    private PurchOrderItemRepository purchOrderItemRepository;

    @Override
    public List<PurchOrderItem> getPurchOrderItems() {
        return purchOrderItemRepository.findAll();
    }

    @Override
    public List<PurchOrderItem> findByPoIDAndPrNo(String poId, String prNo) {
        return purchOrderItemRepository.findByPoIDAndPrNo(poId, prNo);
    }

    @Override
    public Long count() {
        return purchOrderItemRepository.count();
    }
}
