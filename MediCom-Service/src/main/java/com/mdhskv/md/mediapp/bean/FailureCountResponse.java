package com.mdhskv.md.mediapp.bean;

public  class FailureCountResponse {
	private Integer failureCount;
	private Integer pinTryLimit;
	private Integer pinTryCount;
	private Integer securityAnswerTryLimit;
	private Integer securityAnswerTryCount;
	public Integer getFailureCount() {
		return failureCount;
	}
	public void setFailureCount(Integer failureCount) {
		this.failureCount = failureCount;
	}
	public Integer getPinTryLimit() {
		return pinTryLimit;
	}
	public void setPinTryLimit(Integer pinTryLimit) {
		this.pinTryLimit = pinTryLimit;
	}
	public Integer getPinTryCount() {
		return pinTryCount;
	}
	public void setPinTryCount(Integer pinTryCount) {
		this.pinTryCount = pinTryCount;
	}
	public Integer getSecurityAnswerTryLimit() {
		return securityAnswerTryLimit;
	}
	public void setSecurityAnswerTryLimit(Integer securityAnswerTryLimit) {
		this.securityAnswerTryLimit = securityAnswerTryLimit;
	}
	public Integer getSecurityAnswerTryCount() {
		return securityAnswerTryCount;
	}
	public void setSecurityAnswerTryCount(Integer securityAnswerTryCount) {
		this.securityAnswerTryCount = securityAnswerTryCount;
	}
	
	
}
