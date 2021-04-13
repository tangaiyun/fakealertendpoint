package com.plsseb.alert.bean.integration.een;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.plsseb.alert.een.subscriber.bean.ExternalEventParam;

@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(propOrder = { "internalId", "entity", "type", "isEffectiveDated",
    "effectiveStartDate", "publishedAt", "publishedBy", "validity",
    "processId", "postFromTransaction", "entityKeys", "params", "eventPayload"})
public class EENAlertRequestData extends EENAlertRequestBeanData{

  /**
   * e.g Employee
   */
  private String entity;

  private String type;
  
  private String effectiveStartDate;
  
  private Boolean isEffectiveDated = false;

  private Long publishedAt;

  private String publishedBy;
  
  private String validity;
  
  private String processId;
  
  private String internalId;
  
  private Boolean postFromTransaction;

  private List<ExternalEventParam> entityKeys;
  
  private List<ExternalEventParam> params;
  
  @XmlElement(name = "eventId", namespace = "com.plsseb.event.notification")
  public String getInternalId() {
    return internalId;
  }
  
  public void setInternalId(String internalId) {
    this.internalId = internalId;
  }

  /**
   * @return the entity
   */
  @XmlElement(name = "entity", namespace = "com.plsseb.event.notification")
  public String getEntity() {
    return entity;
  }

  /**
   * @param entity
   *          the entity to set
   */
  public void setEntity(String entity) {
    this.entity = entity;
  }

  /**
   * @return the type
   */
  @XmlElement(name = "type", namespace = "com.plsseb.event.notification")
  public String getType() {
    return type;
  }

  /**
   * @param type
   *          the type to set
   */
  public void setType(String type) {
    this.type = type;
  }
  
  /**
   * @return the effectiveStartDate
   */
  @XmlElement(name = "effectiveStartDate", namespace = "com.plsseb.event.notification")
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
   * @return the publishedAt
   */
  @XmlElement(name = "publishedAt", namespace = "com.plsseb.event.notification")
  public Long getPublishedAt() {
    return publishedAt;
  }

  /**
   * @param publishedAt
   *          the publishedAt to set
   */
  public void setPublishedAt(Long publishedAt) {
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
   * @return the processId
   */
  @XmlElement(name = "processId", namespace = "com.plsseb.event.notification")
  public String getProcessId() {
    return processId;
  }
  
  /**
   * @param processId
   *          the processId to set
   */
  public void setProcessId(String processId) {
    this.processId = processId;
  }

  /**
   * @return the entityKeys
   */
  @XmlElementWrapper(name="entityKeys", namespace = "com.plsseb.event.notification")
  @XmlElement(name = "entityKey", namespace = "com.plsseb.event.notification")
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
  @XmlElementWrapper(name="params", namespace = "com.plsseb.event.notification")
  @XmlElement(name = "param", namespace = "com.plsseb.event.notification")
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
  @XmlElement(name = "postFromTransaction", namespace = "com.plsseb.event.notification")
  public Boolean isPostFromTransaction() {
    return postFromTransaction;
  }
  
  /**
   * @param postFromTransaction
   *          the postFromTransaction to set
   */
  public void setPostFromTransaction(Boolean postFromTransaction) {
    this.postFromTransaction = postFromTransaction;
  }
}