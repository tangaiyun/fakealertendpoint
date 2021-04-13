package com.plsseb.alert.bean.integration.een.v2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlType
@XmlRootElement(name = "ExternalEventResponse", namespace = "http://notification.event.successfactors.com")
public class EENAlertResponse {

  private EENAlertResponsePayload responsePayload;

  /**
   * Gets the responsePayload
   * 
   * @return the responsePayload
   */
  @XmlElement(name = "responsePayload", namespace = "http://notification.event.successfactors.com")
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
