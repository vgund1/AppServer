package com.mdhskv.md.mediapp.common.enumtype;

import com.mdhskv.md.mediapp.code.LabeledEnum;

public enum HandsetManufacturer implements LabeledEnum {
	RIM("RIM"), 
	SonyEricss("SonyEricsson"), 
	Dopod("Dopod"), 
	ZTE("ZTE"), 
	SmartQ("SmartQ"), 
	Acer("Acer"), 
	HP("HP"), 
	T_Mobile("T-Mobile"), 
	Pantech("Pantech"), 
	SSE("Samsung Electronics"), 
	Motorola("Motorola"), 
	LGE("LGE"), 
	HTC("HTC"), 
	Apple("Apple"), 
	Palm("Palm"), 
	Huawei("Huawei");
	
	private final String label;

    private HandsetManufacturer(String label) {
	    this.label = label;
	}
	  
	@Override
	public String getLabel() {
		return label;
	}

}