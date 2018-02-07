package com.mdhskv.md.mediapp.common.enumtype;

import com.mdhskv.md.mediapp.code.ValuedEnum;

public enum ApplicationState implements ValuedEnum {
	Initial("0"),
	Active("1"),
	Inactive("2"),
	Terminated("3");

	private final String value;

	ApplicationState(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	  
	public static ApplicationState getFromValue(String value) {
		for (ApplicationState thisCode : ApplicationState.values()) {
			if (thisCode.value != null && thisCode.value.equals(value)) {
				return thisCode;
			}
		}
		return null;
	}
}
