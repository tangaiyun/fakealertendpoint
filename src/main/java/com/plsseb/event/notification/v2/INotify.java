package com.plsseb.event.notification.v2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.plsseb.alert.bean.integration.een.v2.EENAlertResponsePayload;
import com.plsseb.alert.bean.integration.een.v2.EENAlertRequestMeta;

@WebService(targetNamespace="http://notification.event.successfactors.com")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface INotify {

  @WebMethod(operationName = "ExternalEvent")
  @WebResult(name = "responsePayload", targetNamespace = "http://notification.event.successfactors.com")
  public EENAlertResponsePayload notify(
          @WebParam(name = "externalEventMeta", targetNamespace = "http://notification.event.successfactors.com") EENAlertRequestMeta externalEventMeta,
          @WebParam(name = "events", targetNamespace = "http://notification.event.successfactors.com") Events events);

}