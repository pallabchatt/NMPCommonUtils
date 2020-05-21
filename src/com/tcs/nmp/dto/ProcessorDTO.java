package com.tcs.nmp.dto;

public class ProcessorDTO {
	
	private String inputMsg;
	
	private String convId;
	
	private String labelIndication;
	
	private String labelName;
	
	private String name;
	
	private ProcessorDTO previousData;
	
	

	public ProcessorDTO getPreviousData() {
		return previousData;
	}

	public void setPreviousData(ProcessorDTO previousData) {
		this.previousData = previousData;
	}

	public String getInputMsg() {
		return inputMsg;
	}

	public void setInputMsg(String inputMsg) {
		this.inputMsg = inputMsg;
	}

	public String getConvId() {
		return convId;
	}

	public void setConvId(String convId) {
		this.convId = convId;
	}

	public String getLabelIndication() {
		return labelIndication;
	}

	public void setLabelIndication(String labelIndication) {
		this.labelIndication = labelIndication;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
