package com.mdhskv.md.mediapp.model;

public class SecurityAnswerDataInfo {
	private int minLength;
	private int maxLength;
	private AnswerDataType type;
	private String format; 
	private AnswerDefaultValueType defaultValueType = AnswerDefaultValueType.NONE;

	public static enum AnswerDefaultValueType {
		NONE, MSISDN, EMAIL
	}

	public static enum AnswerDataType {
		NUMERIC, ALPHABET, ALPHA_NUMERIC, DATE, NORMAL;
	}

	public int getMinLength() {
		return minLength;
	}

	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}

	public int getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}

	public AnswerDataType getType() {
		return type;
	}

	public void setType(AnswerDataType type) {
		this.type = type;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public AnswerDefaultValueType getDefaultValueType() {
		return defaultValueType;
	}

	public void setDefaultValueType(AnswerDefaultValueType defaultValueType) {
		this.defaultValueType = defaultValueType;
	}
}
