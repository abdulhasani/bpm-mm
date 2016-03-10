package com.jmat.bpm.ses.repository;

import com.jmat.bpm.ses.entity.PurchOrderContent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

/**
 * Created by User on 3/10/2016.
 */
public interface PurchOrderContentRepository extends CrudRepository<PurchOrderContent, UUID> {
    public List<PurchOrderContent> findAll();

    @Query(value = "SELECT * FROM mm_purch_order_content AS poc WHERE CAST(poc.po_id as varchar) LIKE :poId " +
            "AND poc.pr_no LIKE :prNo", nativeQuery = true)
    public List<PurchOrderContent> findByPoIDAndPrNo(@Param("poId") String poId, @Param("prNo") String prNo);
}
