package com.mdhskv.md.mediapp.common.enumtype;

import com.mdhskv.md.mediapp.code.ValuedEnum;

public enum TransactionState implements ValuedEnum{
	Inprogress("23001"),   
	Success("23006"),
	Fail("23007");

	private String value;
	
	private TransactionState(String value) {
	  this.value = value;
	}
	  
	@Override
	public String getValue() {
		return value;
	}
  public static TransactionState getFromValue(String value) {
    for (TransactionState thisCode : TransactionState.values()) {
      if (thisCode.value != null && thisCode.value.equals(value)) {
        return thisCode;
      }
    }
    return null;
  }
}
