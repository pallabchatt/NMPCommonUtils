package com.tcs.nmp.dto;

public class RequestResponseDTO {
	
	private String communicationID;
	
	private String customerName;
	
	private String instructionLabel;
	
	private String inputMessage;
	
	private String outputMessage;
	
	private String otherModuleProcessingIND;
	
	private boolean otherModuleProcessingFlag;
	
	private String predictionResultLabel;
	
	private boolean favourableIndicator;
	
	
	

	public String getCommunicationID() {
		return communicationID;
	}

	public void setCommunicationID(String communicationID) {
		this.communicationID = communicationID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getInstructionLabel() {
		return instructionLabel;
	}

	public void setInstructionLabel(String instructionLabel) {
		this.instructionLabel = instructionLabel;
	}

	public String getInputMessage() {
		return inputMessage;
	}

	public void setInputMessage(String inputMessage) {
		this.inputMessage = inputMessage;
	}

	public String getOutputMessage() {
		return outputMessage;
	}

	public void setOutputMessage(String outputMessage) {
		this.outputMessage = outputMessage;
	}

	public String getOtherModuleProcessingIND() {
		return otherModuleProcessingIND;
	}

	public void setOtherModuleProcessingIND(String otherModuleProcessingIND) {
		this.otherModuleProcessingIND = otherModuleProcessingIND;
	}

	public boolean isOtherModuleProcessingFlag() {
		return otherModuleProcessingFlag;
	}

	public void setOtherModuleProcessingFlag(boolean otherModuleProcessingFlag) {
		this.otherModuleProcessingFlag = otherModuleProcessingFlag;
	}

	public String getPredictionResultLabel() {
		return predictionResultLabel;
	}

	public void setPredictionResultLabel(String predictionResultLabel) {
		this.predictionResultLabel = predictionResultLabel;
	}

	public boolean isFavourableIndicator() {
		return favourableIndicator;
	}

	public void setFavourableIndicator(boolean favourableIndicator) {
		this.favourableIndicator = favourableIndicator;
	}


}
