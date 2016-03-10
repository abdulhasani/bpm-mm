package com.jmat.bpm.ses.rest.resource;

import com.jmat.bpm.ses.entity.PurchOrderContent;
import com.jmat.bpm.ses.entity.PurchOrderHeader;
import com.jmat.bpm.ses.entity.PurchOrderItem;
import com.jmat.bpm.ses.service.query_service.PurchOrderContentService;
import com.jmat.bpm.ses.service.query_service.PurchOrderHeaderService;
import com.jmat.bpm.ses.service.query_service.PurchOrderItemService;
import com.jmat.bpm.ses.wrapper.*;
import com.jmat.bpm.support.Notification;
import com.jmat.bpm.support.transfer.ArrayTransfer;
import com.jmat.bpm.support.wrapper.ResponseWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 3/10/2016.
 */
@Component
@Path("/ses/purch-order-header")
public class PurchOrderHeaderResource {
    private static final Logger logger = LoggerFactory.getLogger(PurchOrderHeaderResource.class);

    @Autowired
    private PurchOrderHeaderService purchOrderHeaderService;
    @Autowired
    private PurchOrderItemService purchOrderItemService;
    @Autowired
    private PurchOrderContentService purchOrderContentService;

    @GET
    @Path("/headers")
    @Produces(MediaType.APPLICATION_JSON)
    @javax.transaction.Transactional
    public ResponseWrapper<ArrayTransfer<PurchOrderHeaderWrap>> getAll() {
        List<PurchOrderHeader> purchOrderHeaders = purchOrderHeaderService.getPurchOrderHeaders();
        ResponseWrapper<ArrayTransfer<PurchOrderHeaderWrap>> response = new ResponseWrapper<>();
        ArrayTransfer<PurchOrderHeaderWrap> purchOrderHeaderArr = new ArrayTransfer<PurchOrderHeaderWrap>(PurchOrderHeaderWrap.class);
        for (PurchOrderHeader poh : purchOrderHeaders) {
            PurchOrderHeaderWrap purchOrderHeaderWrap = new PurchOrderHeaderWrap(poh);
            purchOrderHeaderArr.addItem(purchOrderHeaderWrap);
        }
        Notification notification = new Notification("success", "200");
        List<Notification> notifications = new ArrayList<>();
        notifications.add(notification);
        response.setNotifications(notifications);
        response.setData(purchOrderHeaderArr);
        return response;
    }

    @GET
    @Path("/search")
    @Produces(MediaType.APPLICATION_JSON)
    @javax.transaction.Transactional
    public ResponseWrapper<ArrayTransfer<PurchOrderHeaderWrap>> search(@QueryParam("poId") String poId,
                                                                       @QueryParam("prNo") String prNo,
                                                                       @QueryParam("bpmPoNo") String bpmPoNo,
                                                                       @QueryParam("purchOrg") String purchOrg,
                                                                       @QueryParam("purchGroup") String purchGroup) {
        List<PurchOrderHeader> search = purchOrderHeaderService.search("%" + poId + "%", "%" + prNo + "%", "%" + bpmPoNo + "%", "%" + purchOrg + "%", "%" + purchGroup + "%");
        ResponseWrapper<ArrayTransfer<PurchOrderHeaderWrap>> response = new ResponseWrapper<>();
        ArrayTransfer<PurchOrderHeaderWrap> purchOrderHeaderArr = new ArrayTransfer<PurchOrderHeaderWrap>(PurchOrderHeaderWrap.class);
        for (PurchOrderHeader poh : search) {
            PurchOrderHeaderWrap purchOrderHeaderWrap = new PurchOrderHeaderWrap(poh);
            purchOrderHeaderArr.addItem(purchOrderHeaderWrap);
        }
        Notification notification = new Notification("success", "200");
        List<Notification> notifications = new ArrayList<>();
        notifications.add(notification);
        response.setNotifications(notifications);
        response.setData(purchOrderHeaderArr);
        return response;
    }

    @GET
    @Path("/filter")
    @Produces(MediaType.APPLICATION_JSON)
    @javax.transaction.Transactional
    public ResponseWrapper<PurchOrderHeaderItemContentWrap> filter(@QueryParam("po_id") String poId, @QueryParam("pr_no") String prNo) {
        ResponseWrapper<PurchOrderHeaderItemContentWrap> responseWrapper = new ResponseWrapper<>();
        ArrayTransfer<PurchOrderItemWrap> purchOrderItemArr = new ArrayTransfer<PurchOrderItemWrap>(PurchOrderItemWrap.class);
        ArrayTransfer<PurchOrderContentWrap> purchOrderContentArr = new ArrayTransfer<PurchOrderContentWrap>(PurchOrderContentWrap.class);
        PurchOrderHeader purchOrderHeader = purchOrderHeaderService.selectByPoIdANDPrNo(poId, prNo);
        if (purchOrderHeader instanceof PurchOrderHeader) {
            PurchOrderHeaderItemContentWrap purchOrderHeaderItemContentWrap = new PurchOrderHeaderItemContentWrap(purchOrderHeader);
            ArrayTransfer<PurchOrderItemContentWrap> purchOrderItemContentWrapArrayTransfer = filterPoOrderItemANDContent(poId, prNo);
            if (!purchOrderItemContentWrapArrayTransfer.getItems().isEmpty()) {
                Notification notification = new Notification("success", "200");
                List<Notification> notifications = new ArrayList<>();
                notifications.add(notification);
                purchOrderHeaderItemContentWrap.setPurchOrderItemContentArr(purchOrderItemContentWrapArrayTransfer);
                responseWrapper.setNotifications(notifications);
                responseWrapper.setData(purchOrderHeaderItemContentWrap);
            }
            return responseWrapper;
        }
        return responseWrapper;
    }


    private ArrayTransfer<PurchOrderItemContentWrap> filterPoOrderItemANDContent(String poId, String prNo) {
        ArrayTransfer<PurchOrderItemContentWrap> purchOrderItemContentArr = new ArrayTransfer<PurchOrderItemContentWrap>(PurchOrderItemContentWrap.class);
        List<PurchOrderItem> orderItems = purchOrderItemService.findByPoIDAndPrNo("%" + poId + "%", "%" + prNo + "%");
        List<PurchOrderContent> orderContents = purchOrderContentService.findByPoIDAndPrNo("%" + poId + "%", "%" + prNo + "%");
        if (!orderItems.isEmpty()) {
            for (PurchOrderItem poi : orderItems) {
                PurchOrderItemContentWrap purchOrderItemContentWrap = new PurchOrderItemContentWrap(poi);
                if (!orderContents.isEmpty()) {
                    ArrayTransfer<PurchOrderContentWrap> listPurchOrderContentWrap = new ArrayTransfer<PurchOrderContentWrap>(PurchOrderContentWrap.class);
                    for (PurchOrderContent poc : orderContents) {
                        if (poi.getItemNo().equals(poc.getItemNo())) {
                            PurchOrderContentWrap purchOrderContentWrap = new PurchOrderContentWrap(poc);
                            listPurchOrderContentWrap.addItem(purchOrderContentWrap);
                        }
                    }
                    purchOrderItemContentWrap.setPurchOrderContentWrapList(listPurchOrderContentWrap);
                }
                purchOrderItemContentArr.addItem(purchOrderItemContentWrap);
            }
        }
        return purchOrderItemContentArr;
    }

}
