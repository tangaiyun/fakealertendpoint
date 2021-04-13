package com.plsseb.event.notification.v2;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.plsseb.alert.bean.integration.een.v2.EENAlertRequestData;

@XmlType
public class Events {

  private List<EENAlertRequestData> eenAlertRequestDatas;

  @XmlElement(name = "event", namespace = "http://notification.event.successfactors.com")
  public List<EENAlertRequestData> getEenAlertRequestDatas() {
    return eenAlertRequestDatas;
  }

  public void setEenAlertRequestDatas(List<EENAlertRequestData> eenAlertRequestDatas) {
    this.eenAlertRequestDatas = eenAlertRequestDatas;
  }
}