/*
 * $Id: SFCodeTemplate31.xml 67218 2009-03-18 19:07:17Z svn $
 */
package com.plsseb.alert.bean.integration.rcm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.plsseb.alert.app.AlertsEnum;
import com.plsseb.alert.bean.integration.AssessmentAlertRequest;

/**
 * The Java class representing the XML structure of the RCM assessment
 * alert request, this class is binding to Alert Type 'rcm_assessment_alert'
 * 
 * @author axu
 * Success Factors
 */
@XmlType
@XmlRootElement(name = "createRcmAssessmentRequest", namespace = "http://www.boomi.com/connector/wss")
public class RCMAssessmentAlertRequest implements AssessmentAlertRequest<RCMAssessmentAlertRequestPayload> {
  
  /**
   * The rcmAssessmentRequest payload that expected by the Boomi process
   */
  private RCMAssessmentAlertRequestPayload rcmAssessmentRequest;
  
  /**
   * Default constructor
   */
  public RCMAssessmentAlertRequest() {
    
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.plsseb.alert.bean.integration.rcm.AssessmentAlertRequest#
   * setRcmAssessmentRequest
   * (com.plsseb.alert.bean.integration.rcm.RCMAssessmentAlertRequestPayload
   * )
   */
  @Override
  public void setRcmAssessmentRequest(RCMAssessmentAlertRequestPayload rcmAssessmentRequest) {
    this.rcmAssessmentRequest = rcmAssessmentRequest;
  }

  /* (non-Javadoc)
   * @see com.plsseb.alert.bean.integration.rcm.AssessmentAlertRequest#getRcmAssessmentRequest()
   */
  @Override
  @XmlElement (name="rcmAssessmentRequest", namespace = "com.plsseb.alert")
  public RCMAssessmentAlertRequestPayload getRcmAssessmentRequest() {
    return rcmAssessmentRequest;
  }

  @Override
  public String alertTypeId() {
    return AlertsEnum.RCM_ASSESSMENT_ALERT.getId();
  }
  
  
  

}
