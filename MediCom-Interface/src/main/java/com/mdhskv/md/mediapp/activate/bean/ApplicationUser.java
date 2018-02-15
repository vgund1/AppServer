package com.mdhskv.md.mediapp.activate.bean;

import java.util.List;

import org.hibernate.validator.constraints.Email;

import com.mdhskv.md.mediapp.common.enumtype.UserType;
import com.mdhskv.md.mediapp.common.enumtype.YesOrNo;
import com.mdhskv.md.mediapp.model.QuestionAnswer;
import com.mdhskv.md.mediapp.registry.vo.CustomAttribute;
import com.mdhskv.md.mediapp.registry.vo.TargetingAttribute;

public class ApplicationUser {

	@Email
	private String email;
	private String pwd;
	private String applicationPin;
	private String nickName;
	private String nationalCode;
	private String msisdn;
	private String customerId;
	private String tncVersion;
	private String gender;
	private String age;
	private YesOrNo inboxOptOutYn;
	private String birthMonth;
	private String birthDay;
	private String birthYear;
	private String phoneNumber;
	@Email
	private String contactEmail;
	private String loyaltyId;
	private String userId;
	private String alternativeId;
	private List<TargetingAttribute> userPrefList;
	private List<CustomAttribute> customAttributeList;
	private List<QuestionAnswer> securityQuestionAnswerList;
	private UserType userType;
	public String getEmail() {
		return email != null ? email.toLowerCase() : null;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getApplicationPin() {
		return applicationPin;
	}

	public void setApplicationPin(String applicationPin) {
		this.applicationPin = applicationPin;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
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

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getTncVersion() {
		return tncVersion;
	}

	public void setTncVersion(String tncVersion) {
		this.tncVersion = tncVersion;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public YesOrNo getInboxOptOutYn() {
		return inboxOptOutYn;
	}

	public void setInboxOptOutYn(YesOrNo inboxOptOutYn) {
		this.inboxOptOutYn = inboxOptOutYn;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getLoyaltyId() {
		return loyaltyId;
	}

	public void setLoyaltyId(String loyaltyId) {
		this.loyaltyId = loyaltyId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAlternativeId() {
		return alternativeId;
	}

	public void setAlternativeId(String alternativeId) {
		this.alternativeId = alternativeId;
	}

	public List<TargetingAttribute> getUserPrefList() {
		return userPrefList;
	}

	public void setUserPrefList(List<TargetingAttribute> userPrefList) {
		this.userPrefList = userPrefList;
	}

	public List<CustomAttribute> getCustomAttributeList() {
		return customAttributeList;
	}

	public void setCustomAttributeList(List<CustomAttribute> customAttributeList) {
		this.customAttributeList = customAttributeList;
	}

	public List<QuestionAnswer> getSecurityQuestionAnswerList() {
		return securityQuestionAnswerList;
	}

	public void setSecurityQuestionAnswerList(List<QuestionAnswer> securityQuestionAnswerList) {
		this.securityQuestionAnswerList = securityQuestionAnswerList;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

}
