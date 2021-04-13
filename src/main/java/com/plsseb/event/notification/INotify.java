package com.plsseb.event.notification;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.plsseb.alert.bean.integration.een.EENAlertRequestMeta;
import com.plsseb.alert.bean.integration.een.EENAlertResponsePayload;

@WebService(targetNamespace="com.plsseb.event.notification")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface INotify {

  @WebMethod(operationName = "ExternalEvent")
  @WebResult(name = "responsePayload", targetNamespace = "com.plsseb.event.notification")
  public EENAlertResponsePayload notify(
          @WebParam(name = "externalEventMeta", targetNamespace = "com.plsseb.event.notification") EENAlertRequestMeta externalEventMeta,
          @WebParam(name = "events", targetNamespace = "com.plsseb.event.notification") Events events);

}