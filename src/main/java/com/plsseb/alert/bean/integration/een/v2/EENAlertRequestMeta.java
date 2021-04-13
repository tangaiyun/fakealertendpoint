package com.plsseb.alert.bean.integration.een.v2;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(propOrder = { "externalEventId", "type", "publishedAt",
    "publishedBy", "effective", "repost" })
public class EENAlertRequestMeta {

  private String externalEventId;

  private String type;

  /**
   * UTC timestamp
   */
  private String publishedAt;

  private String publishedBy;
  
  private String effective;
  
  private Boolean repost;

  /**
   * @return the eventID
   */
  @XmlElement(name = "externalEventId", namespace = "http://notification.event.successfactors.com")
  public String getExternalEventId() {
    return externalEventId;
  }

  /**
   * @param eventID
   *          the eventID to set
   */
  public void setExternalEventId(String externalEventId) {
    this.externalEventId = externalEventId;
  }

  /**
   * @return the proxyId
   */
  @XmlElement(name = "type", namespace = "http://notification.event.successfactors.com")
  public String getType() {
    return type;
  }

  /**
   * @param proxyId
   *          the proxyId to set
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * @return the publishedAt
   */
  @XmlElement(name = "publishedAt", namespace = "http://notification.event.successfactors.com")
  public String getPublishedAt() {
    return publishedAt;
  }

  /**
   * @param publishedAt
   *          the publishedAt to set
   */
  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }

  /**
   * @return the publishedBy
   */
  @XmlElement(name = "publishedBy", namespace = "http://notification.event.successfactors.com")
  public String getPublishedBy() {
    return publishedBy;
  }

  /**
   * @param publishedBy
   *          the publishedBy to set
   */
  public void setPublishedBy(String publishedBy) {
    this.publishedBy = publishedBy;
  }
  
  /**
   * @return the effective
   */
  @XmlElement(name = "effective", namespace = "http://notification.event.successfactors.com")
  public String getEffective() {
    return effective;
  }
  
  /**
   * @param effective
   *          the effective to set
   */
  public void setEffective(String effective) {
    this.effective = effective;
  }
  
  /**
   * @return the postFromTransaction
   */
  @XmlElement(name = "repost", namespace = "http://notification.event.successfactors.com")
  public Boolean getRepost() {
    return repost;
  }
  
  /**
   * @param postFromTransaction
   *          the postFromTransaction to set
   */
  public void setRepost(Boolean repost) {
    this.repost = repost;
  }
}
