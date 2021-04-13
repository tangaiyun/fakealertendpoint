package com.plsseb.event.notification;

import java.io.StringWriter;
import java.util.Arrays;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.ws.WebServiceContext;

import com.plsseb.alert.bean.integration.een.EENAlertRequest;
import com.plsseb.alert.bean.integration.een.EENAlertRequestData;
import com.plsseb.alert.bean.integration.een.EENAlertRequestMeta;
import com.plsseb.alert.bean.integration.een.EENAlertResponsePayload;
import com.plsseb.utils.HttpUtils;

@WebService(endpointInterface = "com.plsseb.event.notification.INotify", targetNamespace = "com.plsseb.event.notification")
public class NotifyImpl implements INotify {

  @Resource
  WebServiceContext wsctx;

  @Override
  public EENAlertResponsePayload notify(EENAlertRequestMeta externalEventMeta,
      Events events) {
    System.out.println(">===========HELLO SUCCESSFACTORS V1=============: "
        + new java.util.Date());
    
    HttpUtils.authenticate(wsctx, "admin", "pwd");
    
	HttpUtils.delay(wsctx);

	EENAlertResponsePayload payload = new EENAlertResponsePayload();
	payload.setStatusDate(new java.util.Date());
	if (HttpUtils.fault(wsctx)){
		payload.setErrorCode("400");
		payload.setErrorMessage("Event Process Error");
	} else{
		payload.setStatus(0);
	}

    EENAlertRequest<EENAlertRequestMeta, EENAlertRequestData> request = new EENAlertRequest<EENAlertRequestMeta, EENAlertRequestData>();
    request.setEenAlertRequestMeta(externalEventMeta);
    request.setEenAlertRequestDatas(events.getEenAlertRequestDatas());
    payload.setStatusDetails(this.marshall(request));

    System.out.println(">===========BYEBYE SUCCESSFACTORS V1=============: "
        + new java.util.Date());

    return payload;
  }

  private String marshall(
      EENAlertRequest<EENAlertRequestMeta, EENAlertRequestData> request) {
    try {
      Class<?>[] dynamicBoundTypes = request.dynamicBoundClasses();
      Class<?>[] jaxbTypes = Arrays.copyOf(dynamicBoundTypes,
          dynamicBoundTypes.length + 1);
      jaxbTypes[dynamicBoundTypes.length] = EENAlertRequest.class;
      JAXBContext jaxbContext = JAXBContext.newInstance(jaxbTypes);
      Marshaller marshaller = jaxbContext.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      StringWriter writer = new StringWriter();
      marshaller.marshal(request, writer);
      return writer.toString();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}