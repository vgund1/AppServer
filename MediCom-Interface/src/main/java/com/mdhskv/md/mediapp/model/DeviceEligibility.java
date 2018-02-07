package com.mdhskv.md.mediapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class DeviceEligibility {
	private boolean eligible;
	private EligibilityReasons[] nonEligibilityReasons;
	private boolean rootingDevice;

	public boolean isEligible() {
		return eligible;
	}

	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}

	public EligibilityReasons[] getNonEligibilityReasons() {
		return nonEligibilityReasons;
	}

	public void setNonEligibilityReasons(EligibilityReasons[] nonEligibilityReasons) {
		this.nonEligibilityReasons = nonEligibilityReasons;
	}

	public boolean isRootingDevice() {
		return rootingDevice;
	}

	public void setRootingDevice(boolean rootingDevice) {
		this.rootingDevice = rootingDevice;
	}

	public enum EligibilityReasons {
		DEVICE_NOT_SUPPORTED
	}

}
