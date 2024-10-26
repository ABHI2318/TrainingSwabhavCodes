package com.aurion.exceptions;

public class NotValidEmailException extends  RuntimeException {
     public String getMessage() {
    	 return "enter valid email id";
     }
}
