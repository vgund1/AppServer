package com.mdhskv.md.mediapp.registry.vo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mdhskv.md.mediapp.common.enumtype.DeviceIdType;
import com.mdhskv.md.mediapp.common.enumtype.DisplayDensity;
import com.mdhskv.md.mediapp.common.enumtype.MobileState;
import com.mdhskv.md.mediapp.common.enumtype.YesOrNo;
import com.mdhskv.md.mediapp.model.MobileDevice;

public class MobileClientVo implements Serializable {
	private static final long serialVersionUID = 5612275023429105796L;
	private static transient final Logger logger = LoggerFactory.getLogger(MobileClientVo.class);

	private String walletId;
	private String mobileId;
	private String customerId;
	private int seqNum;
	private Date cretDtim;
	private Date updateDtim;
	private String mobileUid;
	private DeviceIdType mobileUidType;
	private String langCode;
	private MobileState mobileState;
	private YesOrNo seAppInstallYn;
	private YesOrNo deviceAppBindingYn;
	private String pin;
	private boolean pinConfigured;
	private String walletAppVersionId;

	private PushClientId pushCid;

	private String deviceInfo;
	private String mcsaVersion;
	private String walletVersion;

	private MobileDevice mobileDevice;
	private boolean securityVerified = false;

	private Calendar timeout;

	private DisplayDensity desity = DisplayDensity.xhdpi;

	private String mobileSubscriptionId;

	private MobileSessionKeyVo sessionKey;

	private String sdkInstanceId;

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

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(int seqNum) {
		this.seqNum = seqNum;
	}

	public Date getCretDtim() {
		return cretDtim;
	}

	public void setCretDtim(Date cretDtim) {
		this.cretDtim = cretDtim;
	}

	public Date getUpdateDtim() {
		return updateDtim;
	}

	public void setUpdateDtim(Date updateDtim) {
		this.updateDtim = updateDtim;
	}

	public String getMobileUid() {
		return mobileUid;
	}

	public void setMobileUid(String mobileUid) {
		this.mobileUid = mobileUid;
	}

	public DeviceIdType getMobileUidType() {
		return mobileUidType;
	}

	public void setMobileUidType(DeviceIdType mobileUidType) {
		this.mobileUidType = mobileUidType;
	}

	public String getLangCode() {
		return langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public MobileState getMobileState() {
		return mobileState;
	}

	public void setMobileState(MobileState mobileState) {
		this.mobileState = mobileState;
	}

	public YesOrNo getSeAppInstallYn() {
		return seAppInstallYn;
	}

	public void setSeAppInstallYn(YesOrNo seAppInstallYn) {
		this.seAppInstallYn = seAppInstallYn;
	}

	public YesOrNo getDeviceAppBindingYn() {
		return deviceAppBindingYn;
	}

	public void setDeviceAppBindingYn(YesOrNo deviceAppBindingYn) {
		this.deviceAppBindingYn = deviceAppBindingYn;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public boolean isPinConfigured() {
		return pinConfigured;
	}

	public void setPinConfigured(boolean pinConfigured) {
		this.pinConfigured = pinConfigured;
	}

	public String getWalletAppVersionId() {
		return walletAppVersionId;
	}

	public void setWalletAppVersionId(String walletAppVersionId) {
		this.walletAppVersionId = walletAppVersionId;
	}

	public PushClientId getPushCid() {
		return pushCid;
	}

	public void setPushCid(PushClientId pushCid) {
		this.pushCid = pushCid;
	}

	public String getMcsaVersion() {
		return mcsaVersion;
	}

	public void setMcsaVersion(String mcsaVersion) {
		this.mcsaVersion = mcsaVersion;
	}

	public String getWalletVersion() {
		return walletVersion;
	}

	public void setWalletVersion(String walletVersion) {
		this.walletVersion = walletVersion;
	}

	public MobileDevice getMobileDevice() {
		return mobileDevice;
	}

	public void setMobileDevice(MobileDevice mobileDevice) {
		this.mobileDevice = mobileDevice;
	}

	public boolean isSecurityVerified() {
		return securityVerified;
	}

	public void setSecurityVerified(boolean securityVerified) {
		this.securityVerified = securityVerified;
	}

	public Calendar getTimeout() {
		return timeout;
	}

	public void setTimeout(Calendar timeout) {
		this.timeout = timeout;
	}

	public DisplayDensity getDesity() {
		return desity;
	}

	public void setDesity(DisplayDensity desity) {
		this.desity = desity;
	}

	public String getMobileSubscriptionId() {
		return mobileSubscriptionId;
	}

	public void setMobileSubscriptionId(String mobileSubscriptionId) {
		this.mobileSubscriptionId = mobileSubscriptionId;
	}

	public MobileSessionKeyVo getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(MobileSessionKeyVo sessionKey) {
		this.sessionKey = sessionKey;
	}

	public String getSdkInstanceId() {
		return sdkInstanceId;
	}

	public void setSdkInstanceId(String sdkInstanceId) {
		this.sdkInstanceId = sdkInstanceId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static Logger getLogger() {
		return logger;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
		if (deviceInfo == null || !deviceInfo.contains("Dpi=")) {
			this.desity = DisplayDensity.xhdpi;
		} else {
			try {
				String s = deviceInfo.substring(deviceInfo.indexOf("Dpi=") + 4).split(";")[0];
				int dpi = Integer.parseInt(s);

				if (dpi <= 160) {
					this.desity = DisplayDensity.mdpi;
				} else if (dpi <= 240) {
					this.desity = DisplayDensity.hdpi;
				} else if (dpi <= 320) {
					this.desity = DisplayDensity.xhdpi;
				} else {
					this.desity = DisplayDensity.xxhdpi;
				}
			} catch (NumberFormatException e) {
				logger.warn("Issue to parse device info. DeviceInfo: " + deviceInfo);
				this.desity = DisplayDensity.xhdpi;
			}
		}

	}

}
