package com.plsseb.alert.een.subscriber.bean;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlType;

/**
 * external event parameters
 * @author Ryan Huang( R.H)
 *
 */
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(name="param", propOrder = { "name", "value" })
public class ExternalEventParam {
  
  private String name;
  
  private String value;

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the value
   */
  public String getValue() {
    return value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(String value) {
    this.value = value;
  }
  
}
