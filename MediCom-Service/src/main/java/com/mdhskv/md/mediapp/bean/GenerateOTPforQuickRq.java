package com.mdhskv.md.mediapp.bean;

import org.hibernate.validator.constraints.NotBlank;


public class GenerateOTPforQuickRq {

	private String nationalCode;
	
	@NotBlank
	private String msisdn;
	
	private String lang;

	public String getNationalCode() {
		return nationalCode;
	}

	public void setNationalCode(String nationalCode) {
		this.nationalCode = nationalCode;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

}
