package com.mdhskv.md.mediapp.activate.bean;

import org.hibernate.validator.constraints.NotBlank;

import com.mdhskv.md.mediapp.bean.GenerateOTPforQuickRq;

public class GenerateOTPRq extends GenerateOTPforQuickRq{

	@NotBlank
	private String appId;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}
	
	
}
