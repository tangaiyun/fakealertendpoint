package com.plsseb.alert.bean.integration;



/**
 * A common interface for Assessment type alerts. Used for RCM alerts at the moment
 * but can extended for any other.
 */
public interface AssessmentAlertRequest<T> {

  /**
   * Sets the rcmAssessmentRequest
   *
   * @param rcmAssessmentRequest the rcmAssessmentRequest to set
   */
  void setRcmAssessmentRequest(T rcmAssessmentRequest);

  /**
   * Gets the rcmAssessmentRequest
   *
   * @return the rcmAssessmentRequest
   */
  T getRcmAssessmentRequest();

  /**
   * identifies the alert type associated with this request
   * @return alert type
   */
  String alertTypeId();
  


}