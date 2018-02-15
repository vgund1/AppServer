package com.mdhskv.md.mediapp.activate.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotBlank;

public class CheckMediComAppUpdateRq {

	@NotBlank
	private String appId;

	@NotBlank
	private String version;

	@NotBlank
	private String osName;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CheckMediComAppUpdateRq [version=");
		builder.append(version);
		builder.append(", osName=");
		builder.append(osName);
		builder.append(", appId=");
		builder.append(appId);
		builder.append("]");
		return builder.toString();
	}

}
