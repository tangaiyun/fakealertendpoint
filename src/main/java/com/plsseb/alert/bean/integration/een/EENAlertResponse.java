package com.plsseb.alert.bean.integration.een;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlType
@XmlRootElement(name = "ExternalEventResponse", namespace = "com.plsseb.event.notification")
public class EENAlertResponse {

  private EENAlertResponsePayload responsePayload;

  /**
   * Gets the responsePayload
   * 
   * @return the responsePayload
   */
  @XmlElement(name = "responsePayload", namespace = "com.plsseb.event.notification")
  public EENAlertResponsePayload getResponsePayload() {
    return responsePayload;
  }

  /**
   * Sets the responsePayload
   * 
   * @param responsePayload
   *          the responsePayload to set
   */
  public void setResponsePayload(EENAlertResponsePayload responsePayload) {
    this.responsePayload = responsePayload;
  }
}
