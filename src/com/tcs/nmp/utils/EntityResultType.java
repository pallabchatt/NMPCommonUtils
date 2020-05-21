package com.tcs.nmp.utils;

public enum EntityResultType {
	TYPE_LOCATION("LOCATION"),

	TYPE_OTHER("OTHER");

	private String value;

	private EntityResultType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}