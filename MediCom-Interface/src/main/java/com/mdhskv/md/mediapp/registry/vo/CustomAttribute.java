package com.mdhskv.md.mediapp.registry.vo;

import java.io.Serializable;

public class CustomAttribute implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private Object value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getValue() {
		return value;
	}
	public void Object(String value) {
		this.value = value;
	}
	
	public CustomAttribute() {
	}
	
	public CustomAttribute(String name, Object value) {
		this.name = name;
		this.value = value;
	}
}
