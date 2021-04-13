package com.plsseb.alert.bean.integration.rcm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class RCMAssessmentAlertRequestPayload implements IRCMAssessmentAlertRequestPayload {

  private String entityName = "AssessmentOrder";

  private Long entityId;
  
  /**
   * Default constructor
   */
  public RCMAssessmentAlertRequestPayload() {
    
  }

  /**
   * Sets the entityName
   * 
   * @param entityName
   *          the entityName to set
   */
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  /**
   * Gets the entityName
   * 
   * @return the entityName
   */
  @XmlElement(name = "entityName", namespace = "com.plsseb.alert")
  public String getEntityName() {
    return entityName;
  }

  /**
   * Sets the entityId
   * 
   * @param entityId
   *          the entityId to set
   */
  public void setEntityId(Long entityId) {
    this.entityId = entityId;
  }

  /**
   * Gets the entityId
   * 
   * @return the entityId
   */
  @XmlElement(name = "entityId", namespace = "com.plsseb.alert")
  public Long getEntityId() {
    return entityId;
  }

}
