package com.mdhskv.md.mediapp.activate.bean;

import com.mdhskv.md.mediapp.model.MobileSubscription;
import com.mdhskv.md.mediapp.registry.vo.MobileClientVo;

public class SubscribeMediComSericeRq {
	private MobileClientVo mobileClient;

	private MobileSubscription mobileSubscription;
	private ApplicationUser applicationUser;
	private String applicationId;
	private String language;
	private String token;
	private String sdkVersionId;

	public MobileClientVo getMobileClient() {
		return mobileClient;
	}

	public void setMobileClient(MobileClientVo mobileClient) {
		this.mobileClient = mobileClient;
	}

	public MobileSubscription getMobileSubscription() {
		return mobileSubscription;
	}

	public void setMobileSubscription(MobileSubscription mobileSubscription) {
		this.mobileSubscription = mobileSubscription;
	}


	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getSdkVersionId() {
		return sdkVersionId;
	}

	public void setSdkVersionId(String sdkVersionId) {
		this.sdkVersionId = sdkVersionId;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public ApplicationUser getApplicationUser() {
		return applicationUser;
	}

	public void setApplicationUser(ApplicationUser applicationUser) {
		this.applicationUser = applicationUser;
	}

}
