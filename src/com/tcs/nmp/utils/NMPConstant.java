package com.tcs.nmp.utils;

public class NMPConstant {
	
	public static final String METH_START = "Method Start: {}";
	public static final String METH_END = "Method End: {}";
	public static final String SUCCESS_RESPONSE = "OK";
	public static final String EMAIL_IDENT_STRING = "@";
	
	//Identifiers
	public static final String CUST_INDENTIFIER = "<CUST_NAME>";
	public static final String SALUTE_INDENTIFIER = "<HELLO>";
	public static final String GREETINGS_INDENTIFIER = "<GREET>";
	public static final String ADDRESS_INDENTIFIER = "<ADDR>";
	public static final String LOCATION_INDENTIFIER = "<LOCATION>";
	public static final String EMAIL_INDENTIFIER = "<EMAIL>";
	public static final String NEXT_TRANS_TYPE_INDT = "<TRANS_NEXT>";
	public static final String CURR_TRANS_TYPE_INDT = "<TRANS_CURR>";
	public static final String LABEL_NAME = "<LABEL_NAME>";
	public static final String CONFIRMATION_NO ="No";
	
	//Formatted Message
	public static final String SUCCESS_ADDR_TRANS_CONF_MSG = "Thank you for using Natural Message Processor. Your Address has been updated successfully.\r\n<GREET> <CUST_NAME>!";
	public static final String SUCCESS_EMAIL_TRANS_CONF_MSG = "Thank you for using Natural Message Processor. Your Email address has been updated successfully.\r\n<GREET> <CUST_NAME>!";
	public static final String SUCCESS_PHONE_TRANS_CONF_MSG = "Thank you for using Natural Message Processor. Your Phone number has been updated successfully.\r\n<GREET> <CUST_NAME>!";
	public static final String ORPHAN_CONF_MSG = "Hello <CUST_NAME>, \r\nI don't have any pending action to be performed. Not understood your confirmational input. Please give little more details.";
	public static final String INVALID_INPUT_MSG = "I didn't understand your input. Could you please provide more details ?";
	public static final String MULTIPLE_ADDR_CONF_MSG = "Hello <CUST_NAME>,  \r\nMultiple Address lines exist for the given details. Plesae provide your exact address.\r\nAddress Lines are :";
	public static final String SNGL_ADDR_CONF_MSG = "<HELLO> <CUST_NAME>,  \r\nThank you for using Natural Message Processor. Do you want to change your address as:\r\n\n<ADDR>. \r\n\nRequest you to please confirm. Thank you.";
	public static final String INVALID_ADDR_CONF_MSG = "Hello <CUST_NAME>,  \r\nI understand you want to change address, but didn't get a valid address to update. Please provide your address. Thank you";
	public static final String LOCATION_ENTITY_MSG = "Hello <CUST_NAME>,  \r\nIt seems you want to update you address. I got your location as <LOCATION>. But I don't have your full address. \r\n\nPlease provide your address. Thank you.";
	public static final String NO_EMAIL_MSG = "Hello <CUST_NAME>,  \r\nI think you requested to update your email. But I didn't receive any valid email Address. Please provide your email ID. Thank you.";
	public static final String MULTIPLE_EMAIL_MSG = "Hello <CUST_NAME>,  \r\nI think you requested to update your email. But I got more than one email addresses in your request. Please provide one email address at a time. Entered email addresses are :";
	public static final String SNGL_EMAIL_CONF_MSG = "<HELLO> <CUST_NAME>,  \r\nThank you for using Natural Message Processor. Do you want to change your Email ID as:\r\n\n<EMAIL>. \r\n\nRequest you to please confirm. Thank you.";
	public static final String NO_INSTRUCTION_MSG = "<HELLO> <CUST_NAME>,  \r\nI didn't understand your instruction. Please give some more details. \r\nThank you for using Natural Message Processor.";
	public static final String SUCCESSFULL_TRANS_PEND_CONF_MSG = "Thank you for your confirmation. Your <TRANS_CURR> has been updated successfully. \r\nI have one more pending transaction related to <TRANS_NEXT>, for your confirmation. Please confirm if you would like to update your <TRANS_NEXT>.";
	public static final String NEED_MORE_INFO = "<HELLO> <CUST_NAME>,  \r\nWe understand that you have reqested for <LABEL_NAME>. Please give us specific details so that we can update your details. \r\nThank you for using Natural Message Processor.";
	public static final String NO_ADDR_TRANS_CONF_MSG = "Thank you for using Natural Message Processor. I did not update your address.Please contact us if you would need any other service. \r\n<GREET> <CUST_NAME>!";
	public static final String NO_EMAIL_TRANS_CONF_MSG = "Thank you for using Natural Message Processor. I did not update your email address.Please contact us if you would need any other service.\r\n<GREET> <CUST_NAME>!";
	public static final String NO_PHONE_TRANS_CONF_MSG = "Thank you for using Natural Message Processor. I did not update your phone number.Please contact us if you would need any other service.\r\n<GREET> <CUST_NAME>!";
	public static final String NO_TRANS_PEND_CONF_MSG = "Thank you for your confirmation. I did not update your <TRANS_CURR>. \r\nI have one more pending transaction related to <TRANS_NEXT>, for your confirmation. Please confirm if you would like to update your <TRANS_NEXT>.";
	
}
