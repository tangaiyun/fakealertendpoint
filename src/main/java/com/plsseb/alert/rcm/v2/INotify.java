package com.plsseb.alert.rcm.v2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.plsseb.alert.bean.integration.rcm.RCMAssessmentAlertRequestPayloadV2;
import com.plsseb.alert.bean.integration.rcm.RCMAssessmentAlertResponsePayloadV2;

@WebService(targetNamespace="http://alert.successfactors.com")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface INotify {

  @WebMethod(operationName = "createRcmAssessmentRequest", action="createRcmAssessmentRequest")
  @WebResult(name = "rcmAssessmentResponse", targetNamespace = "http://alert.successfactors.com")
  public RCMAssessmentAlertResponsePayloadV2 notify(
          @WebParam(name = "rcmAssessmentRequest", targetNamespace = "http://alert.successfactors.com") RCMAssessmentAlertRequestPayloadV2 rcmAssessmentRequest);

}