package com.mdhskv.md.mediapp.activate.bean;

import com.mdhskv.md.mediapp.common.bean.ResultBean;


public class GenerateOTPRs extends ResultBean {
	private String transactionId;
	
	private int expiryTime;
	
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public int getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(int expiryTime) {
		this.expiryTime = expiryTime;
	}

}
