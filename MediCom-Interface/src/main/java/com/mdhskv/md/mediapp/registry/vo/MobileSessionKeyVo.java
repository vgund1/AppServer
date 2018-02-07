package com.mdhskv.md.mediapp.registry.vo;

import java.io.Serializable;
import java.util.Arrays;

public class MobileSessionKeyVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private byte[] encKeyData;
	private byte[] macKeyData;

	public byte[] getEncKeyData() {
		return copyOf(encKeyData);
	}

	public void setEncKeyData(byte[] encKeyData) {
		this.encKeyData = copyOf(encKeyData);
	}

	public byte[] getMacKeyData() {
		return copyOf(macKeyData);
	}

	public void setMacKeyData(byte[] macKeyData) {
		this.macKeyData = copyOf(macKeyData);
	}

	private byte[] copyOf(byte[] value) {
		if (value == null) {
			return null;
		}
		return Arrays.copyOf(value, value.length);
	}

}
