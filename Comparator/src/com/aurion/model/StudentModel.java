package com.aurion.model;

public class StudentModel {
	
	private String name;
	private int rollnumber;
	private double percentage;
	public StudentModel(String name, int rollnumber, double percentage) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "StudentModel [name=" + name + ", rollnumber=" + rollnumber + ", percentage=" + percentage + "]";
	}

}
