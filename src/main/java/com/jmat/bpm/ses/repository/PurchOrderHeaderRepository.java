package com.jmat.bpm.ses.repository;

import com.jmat.bpm.ses.entity.PurchOrderHeader;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

/**
 * Created by User on 3/10/2016.
 */
public interface PurchOrderHeaderRepository extends CrudRepository<PurchOrderHeader,UUID>{
    public List<PurchOrderHeader> findAll();
    @Query(value = "SELECT * FROM mm_purch_order_header AS poh WHERE CAST(poh.po_id as varchar) LIKE :poId " +
            "AND poh.pr_no LIKE :prNo " +
            "AND CAST(poh.bpm_po_no as varchar) LIKE :bpmPoNo " +
            "AND poh.purchasing_org LIKE :purchasingOrg " +
            "AND poh.purchasing_group LIKE :purchasingGroup ", nativeQuery = true)
    public List<PurchOrderHeader> filter(@Param("poId") String poId, @Param("prNo") String prNo, @Param("bpmPoNo") String bpmPoNo,
                                         @Param("purchasingOrg") String purchasingOrg, @Param("purchasingGroup") String purchasingGroup);
    @Query(value = "SELECT * FROM mm_purch_order_header AS poh WHERE CAST(poh.po_id as varchar)=:poId OR poh.pr_no=:PrNo ",nativeQuery = true)
    public PurchOrderHeader findByPoIDAndPrNo(@Param("poId") String poId,@Param("PrNo") String PrNo);
}
