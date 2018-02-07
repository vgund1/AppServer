package com.mdhskv.md.mediapp.registry.vo;

import java.io.Serializable;

import com.mdhskv.md.mediapp.common.enumtype.ClientPushType;

public class PushClientId implements Serializable {
	private static final long serialVersionUID = 1L;
	private String pushId;
	private ClientPushType pushType;

	public String getPushId() {
		return pushId;
	}

	public void setPushId(String pushId) {
		this.pushId = pushId;
	}

	public ClientPushType getPushType() {
		return pushType;
	}

	public void setPushType(ClientPushType pushType) {
		this.pushType = pushType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
