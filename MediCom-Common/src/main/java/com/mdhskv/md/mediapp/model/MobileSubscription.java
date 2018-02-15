package com.mdhskv.md.mediapp.model;

public class MobileSubscription {
	protected String msisdn;
	protected String imei;
	protected String mno;
	protected String iccid;
	protected String imsi;

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	@Override
	public String toString() {
		return "MobileSubscription [msisdn=" + msisdn + ", imei=" + imei + ", mno=" + mno + ", iccid=" + iccid
				+ ", imsi=" + imsi + "]";
	}

}
