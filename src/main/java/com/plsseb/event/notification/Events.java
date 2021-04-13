package com.plsseb.event.notification;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.plsseb.alert.bean.integration.een.EENAlertRequestData;

@XmlType
public class Events {

  private List<EENAlertRequestData> eenAlertRequestDatas;

  @XmlElement(name = "event", namespace = "com.plsseb.event.notification")
  public List<EENAlertRequestData> getEenAlertRequestDatas() {
    return eenAlertRequestDatas;
  }

  public void setEenAlertRequestDatas(List<EENAlertRequestData> eenAlertRequestDatas) {
    this.eenAlertRequestDatas = eenAlertRequestDatas;
  }
}