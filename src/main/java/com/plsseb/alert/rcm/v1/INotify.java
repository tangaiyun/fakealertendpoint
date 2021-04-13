package com.plsseb.alert.rcm.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.plsseb.alert.bean.integration.rcm.RCMAssessmentAlertRequestPayload;
import com.plsseb.alert.bean.integration.rcm.RCMAssessmentAlertResponsePayload;

@WebService(targetNamespace="http://www.boomi.com/connector/wss")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface INotify {

  @WebMethod(operationName = "createRcmAssessmentRequest")
  @WebResult(name = "rcmAssessmentResponse", targetNamespace = "com.plsseb.alert")
  public RCMAssessmentAlertResponsePayload notify(
          @WebParam(name = "rcmAssessmentRequest", targetNamespace = "com.plsseb.alert") RCMAssessmentAlertRequestPayload rcmAssessmentRequest);

}