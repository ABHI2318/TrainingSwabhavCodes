package com.aurion.model;

import java.lang.Comparable;

public class studentTreeSetModel implements Comparable<studentTreeSetModel> {
	private String name;
	private int rollnumber;
	private double percentage;

	public studentTreeSetModel(String name, int rollnumber, double percentage) {
		super();
		this.name = name;
		this.rollnumber = rollnumber;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "studentTreeSetModel [name=" + name + ", rollnumber=" + rollnumber + ", percentage=" + percentage + "]";
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

	public void displaydetails() {
		System.out.println("the name of student is " + name);
		System.out.println("the roll no is " + rollnumber);
		System.out.println("the percentage is " + percentage);

	}

	@Override
	public int hashCode() {
		return Integer.hashCode(rollnumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		studentTreeSetModel student = (studentTreeSetModel) obj;
		return rollnumber == student.rollnumber;
	}

	@Override
	public int compareTo(studentTreeSetModel other) {
		return Integer.compare(this.rollnumber, other.rollnumber);
	}
}
