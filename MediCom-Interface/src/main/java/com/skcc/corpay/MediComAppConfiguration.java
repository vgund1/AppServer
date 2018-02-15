package com.skcc.corpay;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;

public class MediComAppConfiguration {
	private static final int DEFAULT_RETRY_COUNT = 5;
	private static final int DEFAULT_OTP_TIMEOUT = 300; // seconds
	private static final int DEFAULT_CLIENT_TIMEOUT = 1800; // seconds
	private static final int DEFAULT_DATA_SYNC_INTERVAL = 3; // days
	private static final int DEFAULT_ADVERTISE_COUNT = 5;
	private static final int DEFAULT_EMAIL_CHECK_INTERVAL = 0; // days
	private static final int DEFAULT_INBOX_MESSAGE_EXPIRE_DAYS = 90; // days

	private int passwordRetryCount = DEFAULT_RETRY_COUNT;
	private int pinRetryCount = DEFAULT_RETRY_COUNT;
	private int secAnswerRetryCount = DEFAULT_RETRY_COUNT;

	private int pukRetryCount = DEFAULT_RETRY_COUNT;

	private boolean pinEncrypted;

	private boolean answerEncrypted;
	private int otpTimeout = DEFAULT_OTP_TIMEOUT;

	private int otpTimeoutForQuick = DEFAULT_OTP_TIMEOUT;

	private int clientBackgroundTimeout = DEFAULT_CLIENT_TIMEOUT;
	private int advertiseListCount = DEFAULT_ADVERTISE_COUNT;
	private int dataSyncInterval = DEFAULT_DATA_SYNC_INTERVAL;
	private int emailCheckInterval = DEFAULT_EMAIL_CHECK_INTERVAL;
	private int inboxMessageExpireDays = DEFAULT_INBOX_MESSAGE_EXPIRE_DAYS;
	private String customerCarePhoneNumber = "Not defined yet";
	private String customerCareEmail = "Not defined yet";

	private Map<String, String> parameterMap = new HashMap<String, String>();

	public enum MediComAppParameterKey {
		PIN_TRY_LIMIT, SEC_TRY_LIMIT, OTP_EXPIRY_NORMAL, OTP_EXPIRY_QUICK, CLIENT_BG_TIMEOUT, ADV_DISPLAY_LIMIT, EMAIL_CHECK_INTERVAL, INBOX_MESSAGE_EXPIRE_DAYS, DATA_SYNC_INTERVAL, CUSTOMER_CARE_PHONE_NUMBER, CUSTOMER_CARE_EMAIL;

		public static MediComAppParameterKey getMediComAppParameterKeyByName(String name) {
			MediComAppParameterKey key = null;
			try {
				key = MediComAppParameterKey.valueOf(name);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}

			return key;
		}
	}

	public void setParameter(MediComAppParameterKey parameterKey, String parameterValue) {
		parameterMap.put(parameterKey.name(), parameterValue);
	}

	public String getParameter(MediComAppParameterKey parameter) {
		return (String) parameterMap.get(parameter.name());
	}

	/**
	 * @return the passwordRetryCount
	 */
	public int getPasswordRetryCount() {
		return passwordRetryCount;
	}

	/**
	 * @param passwordRetryCount
	 *            the passwordRetryCount to set
	 */
	public void setPasswordRetryCount(int passwordRetryCount) {
		this.passwordRetryCount = passwordRetryCount;
	}

	/**
	 * @return the pinRetryCount
	 */
	public int getPinRetryCount() {
		return pinRetryCount;
	}

	/**
	 * @param pinRetryCount
	 *            the pinRetryCount to set
	 */
	public void setPinRetryCount(int pinRetryCount) {
		this.pinRetryCount = pinRetryCount;
	}

	/**
	 * @return the secAnswerRetryCount
	 */
	public int getSecAnswerRetryCount() {
		return secAnswerRetryCount;
	}

	/**
	 * @return the emailCheckInterval
	 */
	public int getEmailCheckInterval() {
		return emailCheckInterval;
	}

	/**
	 * @param emailCheckInterval
	 *            the emailCheckInterval to set
	 */
	public void setEmailCheckInterval(int emailCheckInterval) {
		this.emailCheckInterval = emailCheckInterval;
	}

	/**
	 * @param secAnswerRetryCount
	 *            the secAnswerRetryCount to set
	 */
	public void setSecAnswerRetryCount(int secAnswerRetryCount) {
		this.secAnswerRetryCount = secAnswerRetryCount;
	}

	/**
	 * @return the pukRetryCount
	 */
	public int getPukRetryCount() {
		return pukRetryCount;
	}

	/**
	 * @param pukRetryCount
	 *            the pukRetryCount to set
	 */
	public void setPukRetryCount(int pukRetryCount) {
		this.pukRetryCount = pukRetryCount;
	}

	/**
	 * @return the pinEncrypted
	 */
	public boolean isPinEncrypted() {
		return pinEncrypted;
	}

	/**
	 * @param pinEncrypted
	 *            the pinEncrypted to set
	 */
	public void setPinEncrypted(boolean pinEncrypted) {
		this.pinEncrypted = pinEncrypted;
	}

	/**
	 * @return the otpTimeout
	 */
	public int getOtpTimeout() {
		return otpTimeout;
	}

	/**
	 * @param otpTimeout
	 *            the otpTimeout to set
	 */
	public void setOtpTimeout(int optTimeout) {
		this.otpTimeout = optTimeout;
	}

	/**
	 * @return the otpTimeoutForQuick
	 */
	public int getOtpTimeoutForQuick() {
		return otpTimeoutForQuick;
	}

	/**
	 * @param otpTimeoutForQuick
	 *            the otpTimeoutForQuick to set
	 */
	public void setOtpTimeoutForQuick(int optTimeoutForQuick) {
		this.otpTimeoutForQuick = optTimeoutForQuick;
	}

	/**
	 * @return the clientBackgroundTimeout
	 */
	public int getClientBackgroundTimeout() {
		return clientBackgroundTimeout;
	}

	/**
	 * @param clientBackgroundTimeout
	 *            the clientBackgroundTimeout to set
	 */
	public void setClientBackgroundTimeout(int clientBackgroundTimeout) {
		this.clientBackgroundTimeout = clientBackgroundTimeout;
	}

	/**
	 * @return the advertiseListCount
	 */
	public int getAdvertiseListCount() {
		return advertiseListCount;
	}

	/**
	 * @param advertiseListCount
	 *            the advertiseListCount to set
	 */
	public void setAdvertiseListCount(int advertiseListCount) {
		this.advertiseListCount = advertiseListCount;
	}

	/**
	 * @return the dataSyncInterval
	 */
	public int getDataSyncInterval() {
		return dataSyncInterval;
	}

	/**
	 * @param dataSyncInterval
	 *            the dataSyncInterval to set
	 */
	public void setDataSyncInterval(int dataSyncInterval) {
		this.dataSyncInterval = dataSyncInterval;
	}

	/**
	 * @return the parameterMap
	 */
	public Map<String, String> getParameterMap() {
		return parameterMap;
	}

	/**
	 * @param parameterMap
	 *            the parameterMap to set
	 */
	public void setParameterMap(Map<String, String> parameterMap) {
		this.parameterMap = parameterMap;
	}

	/**
	 * @return the inboxExpireDays
	 */
	public int getInboxMessageExpireDays() {
		return inboxMessageExpireDays;
	}

	/**
	 * @param inboxExpireMessageDays
	 *            the inboxExpireDays to set
	 */
	public void setInboxMessageExpireDays(int inboxExpireMessageDays) {
		this.inboxMessageExpireDays = inboxExpireMessageDays;
	}

	/**
	 * @return the answerEncrypted
	 */
	public boolean isAnswerEncrypted() {
		return answerEncrypted;
	}

	/**
	 * @param answerEncrypted
	 *            the answerEncrypted to set
	 */
	public void setAnswerEncrypted(boolean answerEncrypted) {
		this.answerEncrypted = answerEncrypted;
	}

	/**
	 * @return the customerCarePhoneNumber
	 */
	public String getCustomerCarePhoneNumber() {
		return customerCarePhoneNumber;
	}

	/**
	 * @param customerCarePhoneNumber
	 *            the customerCarePhoneNumber to set
	 */
	public void setCustomerCarePhoneNumber(String customerCarePhoneNumber) {
		this.customerCarePhoneNumber = customerCarePhoneNumber;
	}

	/**
	 * @return the customerCareEmail
	 */
	public String getCustomerCareEmail() {
		return customerCareEmail;
	}

	/**
	 * @param customerCareEmail
	 *            the customerCareEmail to set
	 */
	public void setCustomerCareEmail(String customerCareEmail) {
		this.customerCareEmail = customerCareEmail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MediComAppConfiguration [passwordRetryCount=");
		builder.append(passwordRetryCount);
		builder.append(", pinRetryCount=");
		builder.append(pinRetryCount);
		builder.append(", secAnswerRetryCount=");
		builder.append(secAnswerRetryCount);
		builder.append(", pukRetryCount=");
		builder.append(pukRetryCount);
		builder.append(", pinEncrypted=");
		builder.append(pinEncrypted);
		builder.append(", answerEncrypted=");
		builder.append(answerEncrypted);

		builder.append(", otpTimeout=");
		builder.append(otpTimeout);
		builder.append(", otpTimeoutForQuick=");
		builder.append(otpTimeoutForQuick);
		builder.append(", clientBackgroundTimeout=");
		builder.append(clientBackgroundTimeout);
		builder.append(", advertiseListCount=");
		builder.append(advertiseListCount);
		builder.append(", dataSyncInterval=");
		builder.append(dataSyncInterval);
		builder.append(", emailCheckInterval=");
		builder.append(emailCheckInterval);
		builder.append(", inboxMessageExpireDays=");
		builder.append(inboxMessageExpireDays);
		builder.append(", customerCarePhoneNumber=");
		builder.append(customerCarePhoneNumber);
		builder.append(", customerCareEmail=");
		builder.append(customerCareEmail);
		builder.append(", parameterMap=");
		builder.append(parameterMap);
		builder.append("]");
		return builder.toString();
	}

}
