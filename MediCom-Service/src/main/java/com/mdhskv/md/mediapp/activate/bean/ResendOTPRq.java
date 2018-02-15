package com.mdhskv.md.mediapp.activate.bean;

import javax.validation.constraints.NotNull;

public class ResendOTPRq {

	@NotNull
	private String transactionId;
	@NotNull
	private String appId;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	private String lang;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResendOTPRq [transactionId=");
		builder.append(transactionId);
		builder.append(", lang=");
		builder.append(lang);
		builder.append("]");
		return builder.toString();
	}
}
