package com.mdhskv.md.mediapp.activate.bean;

public class ResendOTPRs extends GenerateOTPRs{
	
	private int retryCount;

	public int getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(int retryCount) {
		this.retryCount = retryCount;
	}

	
}

