package com.aurion.exceptions;

public class NotValidPasswordException extends  RuntimeException{
    public String getMessage() {
    	return "enter valid password";
    }
}
