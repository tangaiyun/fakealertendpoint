/*
 * $Id: SFCodeTemplate31.xml 67218 2009-03-18 19:07:17Z svn $
 */
package com.plsseb.alert.bean.integration.rcm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Java class representing the XML structure of the RCM assessment
 * alert response, this class is binding to Alert Type 'rcm_assessment_alert_v2'
 * @author axu
 * Success Factors
 */
@XmlType
@XmlRootElement(name = "createRcmAssessmentRequestResponse",namespace = "http://alert.successfactors.com")
public class RCMAssessmentAlertResponseV2 implements IRCMAssessmentAlertResponse<RCMAssessmentAlertResponsePayloadV2>{
  
  
  private RCMAssessmentAlertResponsePayloadV2 rcmAssessmentResponse;
  
  /**
   * Default constructor
   */
  public RCMAssessmentAlertResponseV2() {
    
  }

  /**
   * Sets the rcmAssessmentResponse
   *
   * @param rcmAssessmentResponse the rcmAssessmentResponse to set
   */
  public void setRcmAssessmentResponse(RCMAssessmentAlertResponsePayloadV2 rcmAssessmentResponse) {
    this.rcmAssessmentResponse = rcmAssessmentResponse;
  }

  /**
   * Gets the rcmAssessmentResponse
   *
   * @return the rcmAssessmentResponse
   */
  @XmlElement (name="rcmAssessmentResponse", namespace = "http://alert.successfactors.com")
  public RCMAssessmentAlertResponsePayloadV2 getRcmAssessmentResponse() {
    return rcmAssessmentResponse;
  }

}
