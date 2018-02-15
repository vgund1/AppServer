package com.mdhskv.md.mediapp.activate.bean;

import com.mdhskv.md.mediapp.common.bean.ResultBean;
import com.mdhskv.md.mediapp.common.enumtype.YesOrNo;

public class CheckMediComAppUpdateRs extends ResultBean {

	private YesOrNo existUpdateVersion;

	private YesOrNo mandatoryYn;

	private String updateVersion;

	private String downloadUrl;

	public YesOrNo getExistUpdateVersion() {
		return existUpdateVersion;
	}

	public void setExistUpdateVersion(YesOrNo existUpdateVersion) {
		this.existUpdateVersion = existUpdateVersion;
	}

	public YesOrNo getMandatoryYn() {
		return mandatoryYn;
	}

	public void setMandatoryYn(YesOrNo mandatoryYn) {
		this.mandatoryYn = mandatoryYn;
	}

	public String getUpdateVersion() {
		return updateVersion;
	}

	public void setUpdateVersion(String updateVersion) {
		this.updateVersion = updateVersion;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CheckMediComUpdateRs [existUpdateVersion=");
		builder.append(existUpdateVersion);
		builder.append(", mandatoryYn=");
		builder.append(mandatoryYn);
		builder.append(", updateVersion=");
		builder.append(updateVersion);
		builder.append(", downloadUrl=");
		builder.append(downloadUrl);
		builder.append("]");
		return builder.toString();
	}
}
