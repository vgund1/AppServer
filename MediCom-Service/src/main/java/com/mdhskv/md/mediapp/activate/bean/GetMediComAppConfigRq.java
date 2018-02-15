package com.mdhskv.md.mediapp.activate.bean;

import org.hibernate.validator.constraints.NotBlank;

public class GetMediComAppConfigRq {

	@NotBlank
	private String appId;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

}
