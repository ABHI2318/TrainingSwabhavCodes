package com.aurion.di.solution.model;

public class Filelogger implements IDBlogger {
	  public void blogger(String error) {
	  System.out.println("Logged to FileBlogger"+error);  
	 }
	}