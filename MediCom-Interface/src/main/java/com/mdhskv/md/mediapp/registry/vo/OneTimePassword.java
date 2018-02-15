package  com.mdhskv.md.mediapp.registry.vo;

import java.util.Date;

import com.mdhskv.md.mediapp.common.enumtype.OTPUsageType;

public class OneTimePassword {
	private String transactionId;
	private String appId;
	private String mobileId;
	private String nationalCode;
	private String msisdn;
	private String msisdnSequenceNumber;
	private OTPUsageType useType = OTPUsageType.NORMAL;
	private String otp;
	private int retryCount;
	private String authenticationToken;
	private Date createdDate;
	private Date updatedDate;

	private int expiryTime;

	
	public String getMobileId() {
		return mobileId;
	}

	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}

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

	public OTPUsageType getUseType() {
		return useType;
	}

	public void setUseType(OTPUsageType useType) {
		this.useType = useType;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public int getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(int retryCount) {
		this.retryCount = retryCount;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getMsisdnSequenceNumber() {
		return msisdnSequenceNumber;
	}

	public void setMsisdnSequenceNumber(String msisdnSequenceNumber) {
		this.msisdnSequenceNumber = msisdnSequenceNumber;
	}

	public int getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(int expiryTime) {
		this.expiryTime = expiryTime;
	}

	public String getAuthenticationToken() {
		return authenticationToken;
	}

	public void setAuthenticationToken(String authenticationToken) {
		this.authenticationToken = authenticationToken;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OneTimePassword [transactionId=");
		builder.append(transactionId);
		builder.append(", appId=");
		builder.append(appId);
		builder.append(", mobileId=");
		builder.append(mobileId);
		builder.append(", nationalCode=");
		builder.append(nationalCode);
		builder.append(", msisdn=");
		builder.append(msisdn);
		builder.append(", msisdnSequenceNumber=");
		builder.append(msisdnSequenceNumber);
		builder.append(", useType=");
		builder.append(useType);
		builder.append(", otp=");
		builder.append(otp);
		builder.append(", retryCount=");
		builder.append(retryCount);
		builder.append(", authenticationToken=");
		builder.append(authenticationToken);
		builder.append(", createdDate=");
		builder.append(createdDate);
		builder.append(", updatedDate=");
		builder.append(updatedDate);
		builder.append(", expiryTime=");
		builder.append(expiryTime);
		builder.append("]");
		return builder.toString();
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

}
