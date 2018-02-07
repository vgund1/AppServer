package com.mdhskv.md.mediapp.common.enumtype;


public enum PushTo {
	APLICATION_ID(1),SERVICE_ID(2), MSISDN(3), MOBILE_ID(3), OS(4), SIR(5);

	private int val;

	private PushTo(int val) {
		this.val = val;
	}

	public static PushTo getTypeByValue(int val) {
		for (PushTo puchTo : PushTo.values()) {
			if (puchTo.val == val)
				return puchTo;
		}
		throw new IllegalArgumentException("PushTo enum not found!");
	}
	
	public static PushTo getTypeByName(String name) {
		PushTo puchTo = PushTo.valueOf(name);
		return puchTo;
	}
}
