package com.plsseb.alert.bean.integration.rcm;

import java.util.Date;

public interface IRCMAssessmentAlertResponsePayload {

  Long getEntityId();

  Integer getStatus();

  String getStatusDetails();

  Date getStatusDate();

  String getAssessmentUrl();

  String getReceiptId();

  String getErrorCode();

  String getErrorMessage();

}