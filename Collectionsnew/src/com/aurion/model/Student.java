package com.aurion.model;

public class Student {
	private String name;
	private int rollnumber;
	public Student(String name, int rollnumber) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
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
	
   public void displaydetails() {
	   System.out.println("the name of student is "+name);
	   System.out.println("the roll no is "+rollnumber);
   }
@Override
public String toString() {
	return "Student [name=" + name + ", rollnumber=" + rollnumber + "]";
}
}
