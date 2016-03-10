package com.jmat.bpm.ses.rest.resource;

import com.jmat.bpm.ses.entity.PurchOrderHeader;
import com.jmat.bpm.ses.service.query_service.PurchOrderHeaderService;
import com.jmat.bpm.ses.wrapper.PurchOrderHeaderWrap;
import com.jmat.bpm.support.Notification;
import com.jmat.bpm.support.transfer.ArrayTransfer;
import com.jmat.bpm.support.wrapper.ResponseWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
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

    @GET
    @Path("/headers")
    @Produces(MediaType.APPLICATION_JSON)
    @javax.transaction.Transactional
    public ResponseWrapper<ArrayTransfer<PurchOrderHeaderWrap>> getAll() {
        List<PurchOrderHeader> purchOrderHeaders = purchOrderHeaderService.getPurchOrderHeaders();
        ResponseWrapper<ArrayTransfer<PurchOrderHeaderWrap>> response = new ResponseWrapper<>();
        ArrayTransfer<PurchOrderHeaderWrap> purchOrderHeaderArr = new ArrayTransfer<PurchOrderHeaderWrap>(PurchOrderHeaderWrap.class);
        for (PurchOrderHeader poh:purchOrderHeaders){
            PurchOrderHeaderWrap purchOrderHeaderWrap=new PurchOrderHeaderWrap(poh);
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
                                                                       @QueryParam("purchGroup") String purchGroup){
        List<PurchOrderHeader> search = purchOrderHeaderService.search("%" + poId + "%", "%" + prNo + "%", "%" + bpmPoNo + "%", "%" + purchOrg + "%", "%" + purchGroup + "%");
        ResponseWrapper<ArrayTransfer<PurchOrderHeaderWrap>> response = new ResponseWrapper<>();
        ArrayTransfer<PurchOrderHeaderWrap> purchOrderHeaderArr = new ArrayTransfer<PurchOrderHeaderWrap>(PurchOrderHeaderWrap.class);
        for (PurchOrderHeader poh:search){
            PurchOrderHeaderWrap purchOrderHeaderWrap=new PurchOrderHeaderWrap(poh);
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
    public ResponseWrapper<ArrayTransfer<PurchOrderHeaderWrap>> filter(@QueryParam("po_id")String poId,@QueryParam("pr_no")String pr_no){

        return null;
    }
}
