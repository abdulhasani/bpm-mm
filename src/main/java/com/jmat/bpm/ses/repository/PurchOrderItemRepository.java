package com.jmat.bpm.ses.repository;

import com.jmat.bpm.ses.entity.PurchOrderItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

/**
 * Created by User on 3/10/2016.
 */
public interface PurchOrderItemRepository extends CrudRepository<PurchOrderItem,UUID>{
    public List<PurchOrderItem> findAll();

    @Query(value = "SELECT * FROM mm_purch_order_item AS poi WHERE CAST(poi.po_id as varchar) LIKE :poId " +
            "AND poi.pr_no LIKE :prNo",nativeQuery = true)
    public List<PurchOrderItem> findByPoIDAndPrNo(@Param("poId")String poId, @Param("prNo")String prNo);
}
