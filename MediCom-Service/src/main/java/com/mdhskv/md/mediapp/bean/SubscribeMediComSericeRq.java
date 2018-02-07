package com.mdhskv.md.mediapp.bean;

import com.mdhskv.md.mediapp.mediapp.activate.bean.Patient;
import com.mdhskv.md.mediapp.model.MobileSubscription;
import com.mdhskv.md.mediapp.registry.vo.MobileClientVo;

public class SubscribeMediComSericeRq {
	private Patient patient;
	private MobileClientVo mobileClient;

	private MobileSubscription mobileSubscription;
	private String walletId;

	private String language;

	private String token;

	private String sdkVersionId;

	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

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

	public String getWalletId() {
		return walletId;
	}

	public void setWalletId(String walletId) {
		this.walletId = walletId;
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

}
