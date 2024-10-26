package com.aurion.exceptions;

public class EmailValidationException extends RuntimeException  {
	public String getMessage() {
		return "Enter Valid Email!";
	}

}
