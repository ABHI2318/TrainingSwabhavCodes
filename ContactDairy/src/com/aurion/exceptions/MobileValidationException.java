package com.aurion.exceptions;

public class MobileValidationException extends RuntimeException{
	public String getMessage() {
		return "Enter Valid Mobile No!";
	}

}
