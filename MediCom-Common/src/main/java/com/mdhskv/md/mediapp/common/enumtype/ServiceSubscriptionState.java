package com.mdhskv.md.mediapp.common.enumtype;

import com.mdhskv.md.mediapp.code.ValuedEnum;

public enum ServiceSubscriptionState implements ValuedEnum{
  DefaultAppInstallRequired("1"), 
  InstallRequested("2"), 
  Installed("3"), 
  UninstallRequested("4"), 
  Uninstalled("5"), 
  LockInProgress("6"), 
  Locked("7"), 
  UnlockInProgress("8");

  private final String value;

  ServiceSubscriptionState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
  
  public static ServiceSubscriptionState getFromValue(String value) {
    for (ServiceSubscriptionState thisCode : ServiceSubscriptionState.values()) {
      if (thisCode.value != null && thisCode.value.equals(value)) {
        return thisCode;
      }
    }
    return null;
  }
  

}
