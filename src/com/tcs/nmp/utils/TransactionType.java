package com.tcs.nmp.utils;

public enum TransactionType {
		TYPE_ADDRESS("Address"),
		TYPE_EMAIL("Email"),
		TYPE_PHONE("Phone");
		
		private String value;
		

		private TransactionType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
		
		
}
