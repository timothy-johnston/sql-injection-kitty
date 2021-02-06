package com.tj.gitbranchingdemo.model;

public class LogEntry {
	
	String name;
	String message;
	
	//Constructor
	public LogEntry(String name, String message) {
		this.name = name;
		this.message = message;
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

}
