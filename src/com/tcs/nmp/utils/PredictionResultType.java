package com.tcs.nmp.utils;

public enum PredictionResultType {
	ACTION_TYPE("A"),

	CONFIRMATION_TYPE("C");

	private String value;

	private PredictionResultType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}