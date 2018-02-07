package com.mdhskv.md.mediapp.common.enumtype;
import com.mdhskv.md.mediapp.code.ValuedEnum;

public enum UpOrDown implements ValuedEnum{
  U("Up"),
  D("Down");
  
  private UpOrDown(String value) {
    this.value = value;
  }
  private String value;

  public String getValue() {
    return value;
  }
}
