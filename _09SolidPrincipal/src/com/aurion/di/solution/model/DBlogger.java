package com.aurion.di.solution.model;

public class DBlogger implements IDBlogger {
	  public void blogger(String error) {
	  System.out.println("logged to DBlogger" +error); }
	}
