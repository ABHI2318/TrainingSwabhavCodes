package com.aurion.model;

public class StudentsLinkedlistModel {
	private String name;
	private int rollnumber;
	private double percentage;
	@Override
	public String toString() {
		return "StudentsLinkedlistModel [name=" + name + ", rollnumber=" + rollnumber + ", percentage=" + percentage
				+ "]";
	}
	public StudentsLinkedlistModel(String name, int rollnumber, double percentage) {
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
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public void displaydetails() {
		   System.out.println("the name of student is "+name);
		   System.out.println("the roll no is "+rollnumber);
		   System.out.println("the percentage of student is "+percentage);
}
}
