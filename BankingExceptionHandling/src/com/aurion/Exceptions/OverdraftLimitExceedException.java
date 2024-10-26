package com.aurion.Exceptions;

public class OverdraftLimitExceedException extends RuntimeException {
	public String getMethod() {
		return "Your overdraft limit exceeded";
	}

}
