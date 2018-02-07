package com.mdhskv.md.mediapp.common.enumtype;

import com.mdhskv.md.mediapp.code.ValuedEnum;

public enum YesOrNo implements ValuedEnum{
  Y("Yes"),
  N("No");
  
  private YesOrNo(String value) {
    this.value = value;
  }
  private String value;

  public String getValue() {
    return value;
  }
  
  public boolean toBoolean() {
	  if( this.equals(Y) ) {
		  return true;
	  } else {
		  return false;
	  }
  }
  
}
