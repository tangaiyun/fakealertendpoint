package com.plsseb.alert.rcm.v1;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import com.plsseb.alert.bean.integration.rcm.RCMAssessmentAlertRequestPayload;
import com.plsseb.alert.bean.integration.rcm.RCMAssessmentAlertResponsePayload;
import com.plsseb.utils.HttpUtils;

@WebService(endpointInterface = "com.plsseb.alert.rcm.v1.INotify", targetNamespace = "http://www.boomi.com/connector/wss")
public class NotifyImpl implements INotify {

  @Resource
  WebServiceContext wsctx;

  @Override
  public RCMAssessmentAlertResponsePayload notify(RCMAssessmentAlertRequestPayload rcmAssessmentRequest) {
    System.out.println(">===========HELLO RCM V1=============: " + new java.util.Date());
    HttpUtils.authenticate(wsctx, "admin", "pwd");

    RCMAssessmentAlertResponsePayload payload = new RCMAssessmentAlertResponsePayload();
    payload.setEntityId(rcmAssessmentRequest.getEntityId());
    payload.setStatusDate(new java.util.Date());
    payload.setStatusDetails("EntityName = " + rcmAssessmentRequest.getEntityName());
    System.out.println(">===========BYEBYE RCM V1=============: "+ new java.util.Date());

    return payload;
  }
}