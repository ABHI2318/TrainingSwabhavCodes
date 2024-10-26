package com.aurion.Exceptions;

public class MinimumAmountException extends RuntimeException{
    public String getMessage() {
    	return "there should be minimum Amount of 500";
    }
    
}
