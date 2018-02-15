package com.mdhskv.md.mediapp.registry.vo;

import java.io.Serializable;

import com.mdhskv.md.mediapp.common.enumtype.YesOrNo;


public class TargetingAttributeCode implements Serializable{
	
	private static final long serialVersionUID = 2102818372032450654L;
	private String applicationId;
	private String tgtAttrId;
	private String tgtAttrValue;
	private YesOrNo selectedYn;
	
	public TargetingAttributeCode(){
	}
	
	public TargetingAttributeCode(String applicationId, String tgtAttrId, String tgtAttrValue) {
		this.setApplicationId(applicationId);
		this.tgtAttrId = tgtAttrId;
		this.tgtAttrValue = tgtAttrValue;
	}
	
	
	public String getTgtAttrId() {
		return tgtAttrId;
	}
	public void setTgtAttrId(String tgtAttrId) {
		this.tgtAttrId = tgtAttrId;
	}
	public String getTgtAttrValue() {
		return tgtAttrValue;
	}
	public void setTgtAttrValue(String tgtAttrValue) {
		this.tgtAttrValue = tgtAttrValue;
	}

	public YesOrNo getSelectedYn() {
		return selectedYn;
	}

	public void setSelectedYn(YesOrNo selectedYn) {
		this.selectedYn = selectedYn;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
}
