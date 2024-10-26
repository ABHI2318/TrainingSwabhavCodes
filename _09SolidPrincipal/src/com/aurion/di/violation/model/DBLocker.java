package com.aurion.di.violation.model;

public class DBLocker {
    
	
	public void log(String message) {
		
		System.out.println(message);
	}
	
	@Override
    public String toString() {
        return "DBLocker instance";
    }
}
