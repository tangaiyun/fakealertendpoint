package com.plsseb.alert.app;

import com.plsseb.alert.bean.integration.een.EENAlertRequest;
import com.plsseb.alert.bean.integration.een.EENAlertResponse;
import com.plsseb.alert.bean.integration.rcm.RCMAssessmentAlertRequest;
import com.plsseb.alert.bean.integration.rcm.RCMAssessmentAlertRequestV2;
import com.plsseb.alert.bean.integration.rcm.RCMAssessmentAlertResponse;
import com.plsseb.alert.bean.integration.rcm.RCMAssessmentAlertResponseV2;

/**
 * This enum lists all alerts supported in the system.
 * @author adevarajan
 *
 */
public enum AlertsEnum {
  
  RCM_ASSESSMENT_ALERT("rcm_assessment_alert", RCMAssessmentAlertRequest.class, RCMAssessmentAlertResponse.class),
  
  RCM_ASSESSMENT_ALERT_V2("rcm_assessment_alert_v2", RCMAssessmentAlertRequestV2.class, RCMAssessmentAlertResponseV2.class),
  
  EEN_ASSESSMENT_ALERT("een_assessment_alert", EENAlertRequest.class, EENAlertResponse.class),
  
  EEN_ASSESSMENT_ALERT_V2("een_assessment_alert_v2",
      com.plsseb.alert.bean.integration.een.v2.EENAlertRequest.class,
      com.plsseb.alert.bean.integration.een.v2.EENAlertResponse.class);
 
  String id;
  
  Class request;
  
  Class response;
  
  AlertsEnum(String id, Class requestClass, Class responseClass) {
    this.id = id;
    
    this.request = requestClass;
    
    this.response = responseClass;
  }
  
  public String getId() {
    return this.id;
  }
  public Class getRequestClass() {
    return this.request;
  }
  
  public Class getResponseClass() {
    return this.response;
  }

}
