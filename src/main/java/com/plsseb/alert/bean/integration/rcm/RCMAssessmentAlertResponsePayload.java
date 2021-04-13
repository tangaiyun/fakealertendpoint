package com.plsseb.alert.bean.integration.rcm;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class RCMAssessmentAlertResponsePayload implements IRCMAssessmentAlertResponsePayload {
  
  private Long entityId;

  private Integer status;
  
  private String statusDetails;
  
  private Date statusDate;
  
  private String assessmentUrl;
  
  private String receiptId;
  
  private String errorCode;
  
  private String errorMessage;
  
  /**
   * Default constructor
   */
  public RCMAssessmentAlertResponsePayload() {
    
  }
  
  @XmlElement (name="entityId", namespace = "com.plsseb.alert")
  public Long getEntityId() {
    return entityId;
  }
  
  public void setEntityId(Long entityId) {
    this.entityId = entityId;
  }
  
  @XmlElement (name="status", namespace = "com.plsseb.alert")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  @XmlElement (name="statusDetails", namespace = "com.plsseb.alert")
  public String getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
  }

  @XmlElement (name="statusDate", namespace = "com.plsseb.alert")
  public Date getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(Date statusDate) {
    this.statusDate = statusDate;
  }
  
  @XmlElement (name="assessmentUrl", namespace = "com.plsseb.alert")
  public String getAssessmentUrl() {
    return assessmentUrl;
  }

  public void setAssessmentUrl(String assessmentUrl) {
    this.assessmentUrl = assessmentUrl;
  }

  @XmlElement (name="receiptId", namespace = "com.plsseb.alert")
  public String getReceiptId() {
    return receiptId;
  }

  public void setReceiptId(String receiptId) {
    this.receiptId = receiptId;
  }
  
  @XmlElement (name="errorCode", namespace = "com.plsseb.alert")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }
  
  @XmlElement (name="errorMessage", namespace = "com.plsseb.alert")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

}
