package com.plsseb.alert.bean.integration.een.v2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public class EENAlertRequestBeanData {

  private Object eventPayload;

  /**
   * @return the eventPayload
   */
  @XmlElement(name = "eventPayload", namespace = "http://notification.event.successfactors.com")
  public Object getEventPayload() {
    return eventPayload;
  }

  /**
   * @param eventPayload
   *          the eventPayload to set
   */
  public void setEventPayload(Object eventPayload) {
    this.eventPayload = eventPayload;
  }
}