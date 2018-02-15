package com.mdhskv.md.mediapp.registry.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.mdhskv.md.mediapp.common.enumtype.OwnerIdType;
import com.mdhskv.md.mediapp.common.enumtype.TargetAttributeState;
import com.mdhskv.md.mediapp.common.enumtype.YesOrNo;

public class TargetingAttribute implements Serializable {
	private static final long serialVersionUID = -8367220959707282350L;
	private String applicationId;
	private String tgtAttrId;
	private String tgtAttrName;
	private String tgtAttrGroupId;
	private OwnerIdType ownerIdType;
	private YesOrNo selectedYn;
	private TargetAttributeState state;
	private List<TargetingAttributeCode> tgtAttrValueList;

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

	public OwnerIdType getOwnerIdType() {
		return ownerIdType;
	}

	public void setOwnerIdType(OwnerIdType ownerIdType) {
		this.ownerIdType = ownerIdType;
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

	public List<TargetingAttributeCode> getTgtAttrValueList() {
		if (tgtAttrValueList == null)
			return new ArrayList<TargetingAttributeCode>();
		return tgtAttrValueList;
	}

	public void setTgtAttrValueList(List<TargetingAttributeCode> tgtAttrValueList) {
		this.tgtAttrValueList = tgtAttrValueList;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

}
