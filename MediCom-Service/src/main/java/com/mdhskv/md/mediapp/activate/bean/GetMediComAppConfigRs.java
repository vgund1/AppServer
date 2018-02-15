package com.mdhskv.md.mediapp.activate.bean;

import com.mdhskv.md.mediapp.common.bean.ResultBean;
import com.skcc.corpay.MediComAppConfiguration;

public class GetMediComAppConfigRs extends ResultBean {

	private MediComAppConfiguration mediComAppConfiguration;

	public MediComAppConfiguration getMediComAppConfiguration() {
		return mediComAppConfiguration;
	}

	public void setMediComAppConfiguration(MediComAppConfiguration mediComAppConfiguration) {
		this.mediComAppConfiguration = mediComAppConfiguration;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GetMediComAppConfigRs [mediComAppConfiguration=");
		builder.append(mediComAppConfiguration);
		builder.append("]");
		return builder.toString();
	}

}
