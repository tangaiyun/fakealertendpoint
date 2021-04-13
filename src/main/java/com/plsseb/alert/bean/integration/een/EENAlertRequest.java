package com.plsseb.alert.bean.integration.een;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.plsseb.alert.bean.integration.IPayload;

/**
 * The Java class representing the XML structure of the EEN alert request.
 * 
 */

@XmlRootElement(name = "ExternalEvent", namespace = "com.plsseb.event.notification")
@XmlType(propOrder = { "eenAlertRequestMeta", "eenAlertRequestDatas" })
public class EENAlertRequest<S, T extends EENAlertRequestBeanData> implements IPayload{

  private S eenAlertRequestMeta;
  private List<T> eenAlertRequestDatas;

  /**
   * Gets the eenAlertRequestMeta
   * 
   * @return the eenAlertRequestMeta
   */

  @XmlElement(name = "externalEventMeta", namespace = "com.plsseb.event.notification")
  public S getEenAlertRequestMeta() {
    return eenAlertRequestMeta;
  }

  /**
   * Sets the eenAlertRequestMeta
   * 
   * @param eenAlertRequestMeta
   *          the eenAlertRequestMeta to set
   */
  public void setEenAlertRequestMeta(S eenAlertRequestMeta) {
    this.eenAlertRequestMeta = eenAlertRequestMeta;
  }

  /**
   * Gets the eenAssessmentRequests
   * 
   * @return the eenAssessmentRequests
   */
  @XmlElementWrapper(name = "events", namespace = "com.plsseb.event.notification")
  @XmlElement(name = "event", namespace = "com.plsseb.event.notification")
  public List<T> getEenAlertRequestDatas() {
    return eenAlertRequestDatas;
  }

  /**
   * Sets the eenAlertRequest
   * 
   * @param eenAlertRequest
   *          the eenAlertRequest to set
   */
  public void setEenAlertRequestDatas(List<T> eenAlertRequestDatas) {
    this.eenAlertRequestDatas = eenAlertRequestDatas;
  }

  @Override
  public Class[] dynamicBoundClasses() {
    List<T> requestDatas = this.getEenAlertRequestDatas();
    Set<Class> payloadClasses = new HashSet<Class>();
    if (eenAlertRequestMeta != null) {
      payloadClasses.add(eenAlertRequestMeta.getClass());
    }
    
    for (T requestData : requestDatas) {
      payloadClasses.add(requestData.getClass());
      Object payload = requestData.getEventPayload();
      if (payload != null) {
        payloadClasses.add(payload.getClass());
      }
    }
    Class[] result = new Class[payloadClasses.size()];
    return payloadClasses.toArray(result);
  }
  
  @Override
  public String toString() {
    if (eenAlertRequestMeta!= null && eenAlertRequestMeta instanceof EENAlertRequestMeta) {
      EENAlertRequestMeta meta = (EENAlertRequestMeta)eenAlertRequestMeta;
      return "(" + meta.getExternalEventId() + ")";
    }
    
    return super.toString();
  }
}