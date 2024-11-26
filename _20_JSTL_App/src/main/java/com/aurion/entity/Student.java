package com.aurion.entity;

public class Student {
	private int rollnumber;
	private String name;
	private double percentage;
	public Student(int rollnumber, String name, double percentage) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.percentage = percentage;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
