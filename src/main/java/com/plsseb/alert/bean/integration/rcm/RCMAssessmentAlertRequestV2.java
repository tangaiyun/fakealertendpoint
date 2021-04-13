/*
 * $Id: SFCodeTemplate31.xml 67218 2009-03-18 19:07:17Z svn $
 */
package com.plsseb.alert.bean.integration.rcm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.plsseb.alert.app.AlertsEnum;
import com.plsseb.alert.bean.integration.AssessmentAlertRequest;
//import com.plsseb.alert.bean.integration.AssessmentAlertRequest;

/**
 * The Java class representing the XML structure of the RCM assessment
 * alert request, this class is binding to Alert Type 'rcm_assessment_alert_v2'
 * 
 * @author axu
 * Success Factors
 */
@XmlType
@XmlRootElement(name = "createRcmAssessmentRequest",namespace = "http://alert.successfactors.com")
public class RCMAssessmentAlertRequestV2 implements AssessmentAlertRequest<RCMAssessmentAlertRequestPayloadV2> {
  
  /**
   * The rcmAssessmentRequest payload that expected by the Boomi process
   */
  private RCMAssessmentAlertRequestPayloadV2 rcmAssessmentRequest;
  
  /**
   * Default constructor
   */
  public RCMAssessmentAlertRequestV2() {
    
  }

  /**
   * Sets the rcmAssessmentRequest
   *
   * @param rcmAssessmentRequest the rcmAssessmentRequest to set
   */
  public void setRcmAssessmentRequest(RCMAssessmentAlertRequestPayloadV2 rcmAssessmentRequest) {
    this.rcmAssessmentRequest = rcmAssessmentRequest;
  }

  /**
   * Gets the rcmAssessmentRequest
   *
   * @return the rcmAssessmentRequest
   */
  @XmlElement (name="rcmAssessmentRequest", namespace = "http://alert.successfactors.com")
  public RCMAssessmentAlertRequestPayloadV2 getRcmAssessmentRequest() {
    return rcmAssessmentRequest;
  }

  public String alertTypeId() {
    return AlertsEnum.RCM_ASSESSMENT_ALERT_V2.getId();
  }
  

}
