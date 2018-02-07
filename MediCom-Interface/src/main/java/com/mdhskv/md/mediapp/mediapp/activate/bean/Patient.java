package com.mdhskv.md.mediapp.mediapp.activate.bean;

import java.util.Date;
import java.util.List;

import com.mdhskv.md.mediapp.common.enumtype.Gender;
import com.mdhskv.md.mediapp.model.QuestionAnswer;
import com.mdhskv.md.mediapp.registry.vo.CustomAttribute;
import com.mdhskv.md.mediapp.registry.vo.TargetingAttribute;

public class Patient {

	private String email;
	private String mobileNumber;
	private String password;
	private String FirstName;
	private String LastName;
	private String customerId;
	private String tncVersion;
	private Gender gender;
	private String age;
	private Date birthDate;
	private String userId;
	private String alternativeId;
	private List<TargetingAttribute> userPrefList;
	private List<CustomAttribute> customAttributeList;
	private List<QuestionAnswer> securityQuestionAnswerList;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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

}
