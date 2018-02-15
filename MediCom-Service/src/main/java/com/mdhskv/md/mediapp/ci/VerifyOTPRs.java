package com.mdhskv.md.mediapp.ci;

import com.mdhskv.md.mediapp.common.bean.ResultBean;


public class VerifyOTPRs extends ResultBean {
	private String customerId;

	private String authenticationToken;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAuthenticationToken() {
		return authenticationToken;
	}

	public void setAuthenticationToken(String authenticationToken) {
		this.authenticationToken = authenticationToken;
	}

}
