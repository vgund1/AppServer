package com.mdhskv.md.mediapp.model;

import java.io.Serializable;

import com.mdhskv.md.mediapp.common.enumtype.MobileOSType;

public class MobileDevice implements Serializable {
	private static final long serialVersionUID = 1L;

	private String manufacturer;

	private String model;

	private MobileOSType osType;
	private String osVersion;
	private String buildNumber;

	private String firmwareVersion;
	private String imei;
	private int dpi;
	private String brandName;

	private boolean nfcSupport;
	private String deviceName;

	private boolean rootingFlag;

	private String walletId;
	private String mobileId;

	public MobileDevice() {
	}

	public MobileDevice(String manufacturer, String model, MobileOSType osType, String osVersion, String buildNumber) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.osType = osType;
		this.osVersion = osVersion;
		this.buildNumber = buildNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public MobileOSType getOsType() {
		return osType;
	}

	public void setOsType(MobileOSType osType) {
		this.osType = osType;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(String buildNumber) {
		this.buildNumber = buildNumber;
	}

	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getDpi() {
		return dpi;
	}

	public void setDpi(int dpi) {
		this.dpi = dpi;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public boolean isNfcSupport() {
		return nfcSupport;
	}

	public void setNfcSupport(boolean nfcSupport) {
		this.nfcSupport = nfcSupport;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public boolean isRootingFlag() {
		return rootingFlag;
	}

	public void setRootingFlag(boolean rootingFlag) {
		this.rootingFlag = rootingFlag;
	}

	public String getWalletId() {
		return walletId;
	}

	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

	public String getMobileId() {
		return mobileId;
	}

	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
