/*
 * $Id: SFCodeTemplate31.xml 67218 2009-03-18 19:07:17Z svn $
 */
package com.plsseb.alert.bean.integration.rcm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Java class representing the XML structure of the RCM assessment
 * alert response, this class is binding to Alert Type 'rcm_assessment_alert'
 * 
 * @author axu
 * Success Factors
 */
@XmlType
@XmlRootElement(name = "createRcmAssessmentRequestResponse", namespace = "http://www.boomi.com/connector/wss")
public class RCMAssessmentAlertResponse implements IRCMAssessmentAlertResponse<RCMAssessmentAlertResponsePayload> {
  
  
  private RCMAssessmentAlertResponsePayload rcmAssessmentResponse;
  
  /**
   * Default constructor
   */
  public RCMAssessmentAlertResponse() {
    
  }

  /**
   * Sets the rcmAssessmentResponse
   *
   * @param rcmAssessmentResponse the rcmAssessmentResponse to set
   */
  public void setRcmAssessmentResponse(RCMAssessmentAlertResponsePayload rcmAssessmentResponse) {
    this.rcmAssessmentResponse = rcmAssessmentResponse;
  }

  /**
   * Gets the rcmAssessmentResponse
   *
   * @return the rcmAssessmentResponse
   */
  @XmlElement (name="rcmAssessmentResponse", namespace = "com.plsseb.alert")
  public RCMAssessmentAlertResponsePayload getRcmAssessmentResponse() {
    return rcmAssessmentResponse;
  }

}
