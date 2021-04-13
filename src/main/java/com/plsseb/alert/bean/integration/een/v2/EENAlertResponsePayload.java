package com.plsseb.alert.bean.integration.een.v2;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class EENAlertResponsePayload {
  
  private String entityId;

  private Integer status;
  
  private String statusDetails;
  
  private Date statusDate;
 
  private String errorCode;
  
  private String errorMessage;
  
  @XmlElement (name="entityId", namespace = "http://notification.event.successfactors.com")
  public String getEntityId() {
    return entityId;
  }
  
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }
  
  @XmlElement (name="status", namespace = "http://notification.event.successfactors.com")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  @XmlElement (name="statusDetails", namespace = "http://notification.event.successfactors.com")
  public String getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
  }

  @XmlElement (name="statusDate", namespace = "http://notification.event.successfactors.com")
  public Date getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(Date statusDate) {
    this.statusDate = statusDate;
  }

  @XmlElement (name="errorCode", namespace = "http://notification.event.successfactors.com")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }
  
  @XmlElement (name="errorMessage", namespace = "http://notification.event.successfactors.com")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

}
