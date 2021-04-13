package com.plsseb.alert.rcm.v2;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import com.plsseb.alert.bean.integration.rcm.RCMAssessmentAlertRequestPayloadV2;
import com.plsseb.alert.bean.integration.rcm.RCMAssessmentAlertResponsePayloadV2;
import com.plsseb.utils.HttpUtils;

@WebService(endpointInterface = "com.plsseb.alert.rcm.v2.INotify", portName="NotifyImplPort")
public class NotifyImpl implements INotify {

  @Resource
  WebServiceContext wsctx;

  @Override
  public RCMAssessmentAlertResponsePayloadV2 notify(RCMAssessmentAlertRequestPayloadV2 rcmAssessmentRequest) {
    System.out.println(">===========HELLO RCM V2=============: " + new java.util.Date());
    HttpUtils.authenticate(wsctx, "admin", "pwd");

    RCMAssessmentAlertResponsePayloadV2 payload = new RCMAssessmentAlertResponsePayloadV2();
    payload.setEntityId(rcmAssessmentRequest.getEntityId());
    payload.setStatusDate(new java.util.Date());
    payload.setStatusDetails("EntityName = " + rcmAssessmentRequest.getEntityName());
    System.out.println(">===========BYEBYE RCM V2=============: "+ new java.util.Date());

    return payload;
  }
}