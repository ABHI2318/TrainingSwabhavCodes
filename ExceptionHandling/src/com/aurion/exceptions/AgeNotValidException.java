package com.aurion.exceptions;

public class AgeNotValidException extends RuntimeException {
	
	private int age;
	
	public AgeNotValidException(int age) {
		super();
		this.age=age;
	}
	
	public String getmessage(){
		return "your entered age is less than 18 ";
	}

}
