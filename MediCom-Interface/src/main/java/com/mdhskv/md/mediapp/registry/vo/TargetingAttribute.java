package com.mdhskv.md.mediapp.registry.vo;

import java.io.Serializable;

import com.mdhskv.md.mediapp.common.enumtype.TargetAttributeState;
import com.mdhskv.md.mediapp.common.enumtype.YesOrNo;

public class TargetingAttribute implements Serializable {
	
	private static final long serialVersionUID = -8367220959707282350L;

	private String walletId;
	private String tgtAttrId;
	private String tgtAttrName;
	private String tgtAttrGroupId;
	private YesOrNo selectedYn;
	private TargetAttributeState state;

	public String getWalletId() {
		return walletId;
	}

	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

	public String getTgtAttrId() {
		return tgtAttrId;
	}

	public void setTgtAttrId(String tgtAttrId) {
		this.tgtAttrId = tgtAttrId;
	}

	public String getTgtAttrName() {
		return tgtAttrName;
	}

	public void setTgtAttrName(String tgtAttrName) {
		this.tgtAttrName = tgtAttrName;
	}

	public String getTgtAttrGroupId() {
		return tgtAttrGroupId;
	}

	public void setTgtAttrGroupId(String tgtAttrGroupId) {
		this.tgtAttrGroupId = tgtAttrGroupId;
	}

	public YesOrNo getSelectedYn() {
		return selectedYn;
	}

	public void setSelectedYn(YesOrNo selectedYn) {
		this.selectedYn = selectedYn;
	}

	public TargetAttributeState getState() {
		return state;
	}

	public void setState(TargetAttributeState state) {
		this.state = state;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
