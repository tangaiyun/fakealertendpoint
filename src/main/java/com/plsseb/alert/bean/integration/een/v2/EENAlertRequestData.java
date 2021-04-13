package com.plsseb.alert.bean.integration.een.v2;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.plsseb.alert.een.subscriber.bean.ExternalEventParam;

@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(propOrder = { "internalId", "entityType",
    "effectiveStartDate", "publishedAt", "publishedBy",
    "repost", "entityKeys", "params", "eventPayload"})
public class EENAlertRequestData extends EENAlertRequestBeanData{

  /**
   * e.g Employee
   */
  private String entityType;

  private String effectiveStartDate;
  
  private String publishedAt;

  private String publishedBy;
  
  private String internalId;
  
  private Boolean repost;

  private List<ExternalEventParam> entityKeys;
  
  private List<ExternalEventParam> params;
  
  
  @XmlElement(name = "eventId", namespace = "http://notification.event.successfactors.com")
  public String getInternalId() {
    return internalId;
  }
  
  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  /**
   * @return the entityType
   */
  @XmlElement(name = "entityType", namespace = "http://notification.event.successfactors.com")
  public String getEntityType() {
    return entityType;
  }

  /**
   * @param entityType
   *          the entityType to set
   */
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }
  
  /**
   * @return the effectiveStartDate
   */
  @XmlElement(name = "effectiveStartDate", namespace = "http://notification.event.successfactors.com")
  public String getEffectiveStartDate() {
    return this.effectiveStartDate;
  }
  
  /**
   * @param effectiveStartDate
   *          the effectiveStartDate to set
   */
  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
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
   * @return the entityKeys
   */
  @XmlElementWrapper(name="entityKeys", namespace = "http://notification.event.successfactors.com")
  @XmlElement(name = "entityKey", namespace = "http://notification.event.successfactors.com")
  public List<ExternalEventParam> getEntityKeys() {
    return entityKeys;
  }

  /**
   * @param entityKeys
   *          the entityKeys to set
   */
  public void setEntityKeys(List<ExternalEventParam> entityKeys) {
    this.entityKeys = entityKeys;
  }

  /**
   * @return the params
   */
  @XmlElementWrapper(name="params", namespace = "http://notification.event.successfactors.com")
  @XmlElement(name = "param", namespace = "http://notification.event.successfactors.com")
  public List<ExternalEventParam> getParams() {
    return params;
  }

  /**
   * @param params
   *          the params to set
   */
  public void setParams(List<ExternalEventParam> params) {
    this.params = params;
  }
  
  /**
   * @return the postFromTransaction
   */
  @XmlElement(name = "repost", namespace = "http://notification.event.successfactors.com")
  public Boolean isRepost() {
    return repost;
  }
  
  /**
   * @param repost
   *          the repost to set
   */
  public void setRepost(Boolean repost) {
    this.repost = repost;
  }
}