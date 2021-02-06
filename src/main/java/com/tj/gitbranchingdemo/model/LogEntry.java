package com.tj.gitbranchingdemo.model;

public class LogEntry {
	
	String name;
	String message;
	enum SubmitType {prepared, injection};
	SubmitType submitType;
	
	//Constructor
	public LogEntry(String name, String message, SubmitType submitType) {
		this.name = name;
		this.message = message;
		this.submitType = submitType;
	}
	
	

	//Getters & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public SubmitType getSubmitType() {
		return submitType;
	}
	public void setSubmitType(SubmitType submitType) {
		this.submitType = submitType;
	}

}
