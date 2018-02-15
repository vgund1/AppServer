package com.mdhskv.md.mediapp.registry.vo;

import java.util.Date;

import com.mdhskv.md.mediapp.common.enumtype.MobileOSType;
import com.mdhskv.md.mediapp.common.enumtype.YesOrNo;

public class MediComAppVersion implements Comparable<MediComAppVersion> {

	private String appId;
	private MobileOSType osType;
	private String versionId;
	private YesOrNo minimumCompatible;
	private String downloadUrl;
	private String releaseNote;
	private Date releaseDate;
	private String mediComAppVersion;

	private boolean isMandatory;

	public MobileOSType getOsType() {
		return osType;
	}

	public void setOsType(MobileOSType osType) {
		this.osType = osType;
	}

	public String getVersionId() {
		return versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public YesOrNo getMinimumCompatible() {
		return minimumCompatible;
	}

	public void setMinimumCompatible(YesOrNo minimumCompatible) {
		this.minimumCompatible = minimumCompatible;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getReleaseNote() {
		return releaseNote;
	}

	public void setReleaseNote(String releaseNote) {
		this.releaseNote = releaseNote;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getMediComAppVersion() {
		return mediComAppVersion;
	}

	public void setMediComAppVersion(String mediComAppVersion) {
		this.mediComAppVersion = mediComAppVersion;
	}

	public boolean isMandatory() {
		return isMandatory;
	}

	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	@Override
	public int compareTo(MediComAppVersion comparable) {
		return this.getMediComAppVersion().compareTo(comparable.getMediComAppVersion());
	}

}
