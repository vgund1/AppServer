package com.mdhskv.md.mediapp.activate.bean;

import com.mdhskv.md.mediapp.bean.FailureCountResponse;
import com.mdhskv.md.mediapp.model.DeviceEligibility;

public class SubscribeMediComSericeRs extends FailureCountResponse {
	protected String mobileId;
	protected String sdkId;
	protected String sdkActivationCode;
	protected DeviceEligibility deviceEligibility;
	protected String token;
	public String getMobileId() {
		return mobileId;
	}
	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}
	public String getSdkId() {
		return sdkId;
	}
	public void setSdkId(String sdkId) {
		this.sdkId = sdkId;
	}
	public String getSdkActivationCode() {
		return sdkActivationCode;
	}
	public void setSdkActivationCode(String sdkActivationCode) {
		this.sdkActivationCode = sdkActivationCode;
	}
	public DeviceEligibility getDeviceEligibility() {
		return deviceEligibility;
	}
	public void setDeviceEligibility(DeviceEligibility deviceEligibility) {
		this.deviceEligibility = deviceEligibility;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	

}
