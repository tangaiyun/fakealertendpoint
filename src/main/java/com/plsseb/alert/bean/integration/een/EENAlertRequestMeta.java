package com.plsseb.alert.bean.integration.een;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(propOrder = { "externalEventId", "sourceArea", "proxyId", "publishedAt",
    "publishedBy", "isEffectiveDated", "effectiveStartDate", "validity", "postFromTransaction" })
public class EENAlertRequestMeta {

  private String externalEventId;

  private String sourceArea;

  private String proxyId;

  /**
   * UTC timestamp
   */
  private String publishedAt;

  private String publishedBy;
  
  private String validity;
  
  private Boolean postFromTransaction;

  private Boolean isEffectiveDated = false;

  /**
   * format of YYYY-MM-DD
   */
  private String effectiveStartDate;

  /**
   * @return the eventID
   */
  @XmlElement(name = "externalEventId", namespace = "com.plsseb.event.notification")
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
   * @return the sourceArea
   */
  @XmlElement(name = "sourceArea", namespace = "com.plsseb.event.notification")
  public String getSourceArea() {
    return sourceArea;
  }

  /**
   * @param sourceArea
   *          the sourceArea to set
   */
  public void setSourceArea(String sourceArea) {
    this.sourceArea = sourceArea;
  }

  /**
   * @return the proxyId
   */
  @XmlElement(name = "proxyUserID", namespace = "com.plsseb.event.notification")
  public String getProxyId() {
    return proxyId;
  }

  /**
   * @param proxyId
   *          the proxyId to set
   */
  public void setProxyId(String proxyId) {
    this.proxyId = proxyId;
  }

  /**
   * @return the publishedAt
   */
  @XmlElement(name = "publishedAt", namespace = "com.plsseb.event.notification")
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
  @XmlElement(name = "publishedBy", namespace = "com.plsseb.event.notification")
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
   * @return the validity
   */
  @XmlElement(name = "validity", namespace = "com.plsseb.event.notification")
  public String getValidity() {
    return validity;
  }
  
  /**
   * @param validity
   *          the validity to set
   */
  public void setValidity(String validity) {
    this.validity = validity;
  }
  
  /**
   * @return the postFromTransaction
   */
  @XmlElement(name = "postFromTransaction", namespace = "com.plsseb.event.notification")
  public Boolean getPostFromTransaction() {
    return postFromTransaction;
  }
  
  /**
   * @param postFromTransaction
   *          the postFromTransaction to set
   */
  public void setPostFromTransaction(Boolean postFromTransaction) {
    this.postFromTransaction = postFromTransaction;
  }

  /**
   * @return the isEffectiveDated
   */
  @XmlElement(name = "isEffectiveDated", namespace = "com.plsseb.event.notification")
  public Boolean getIsEffectiveDated() {
    return isEffectiveDated;
  }

  /**
   * @param isEffectiveDated
   *          the isEffectiveDated to set
   */
  public void setIsEffectiveDated(Boolean isEffectiveDated) {
    this.isEffectiveDated = isEffectiveDated;
  }

  /**
   * @return the effectiveDate
   */
  @XmlElement(name = "effectiveStartDate", namespace = "com.plsseb.event.notification")
  public String getEffectiveStartDate() {
    return effectiveStartDate;
  }

  /**
   * @param effectiveDate
   *          the effectiveDate to set
   */
  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }
}
