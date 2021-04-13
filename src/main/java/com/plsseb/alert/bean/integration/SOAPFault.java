/*
 * $Id: SFCodeTemplate31.xml 67218 2009-03-18 19:07:17Z svn $
 */
package com.plsseb.alert.bean.integration;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author axu Success Factors
 */
@XmlType
@XmlRootElement(name = "Fault", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
public class SOAPFault {

  private String faultcode;

  private String faultstring;

  private String faultactor;

  private String detail;
  
  /**
   * Default constructor
   */
  public SOAPFault() {
    
  }

  /**
   * Gets the faultcode
   *
   * @return the faultcode
   */
  @XmlElement (name="faultcode")
  public String getFaultcode() {
    return faultcode;
  }

  /**
   * Sets the faultcode
   *
   * @param faultcode the faultcode to set
   */
  public void setFaultcode(String faultcode) {
    this.faultcode = faultcode;
  }

  /**
   * Gets the faultstring
   *
   * @return the faultstring
   */
  @XmlElement (name="faultstring")
  public String getFaultstring() {
    return faultstring;
  }

  /**
   * Sets the faultstring
   *
   * @param faultstring the faultstring to set
   */
  public void setFaultstring(String faultstring) {
    this.faultstring = faultstring;
  }

  /**
   * Gets the faultactor
   *
   * @return the faultactor
   */
  @XmlElement (name="faultactor")
  public String getFaultactor() {
    return faultactor;
  }

  /**
   * Sets the faultactor
   *
   * @param faultactor the faultactor to set
   */
  public void setFaultactor(String faultactor) {
    this.faultactor = faultactor;
  }

  /**
   * Gets the detail
   *
   * @return the detail
   */
  @XmlElement (name="detail")
  public String getDetail() {
    return detail;
  }

  /**
   * Sets the detail
   *
   * @param detail the detail to set
   */
  public void setDetail(String detail) {
    this.detail = detail;
  }

}
