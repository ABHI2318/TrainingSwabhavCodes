package com.aurion.model;

import com.aurion.exceptions.AgeNotValidException;

public class Voter {
	private String name;
	private int age;
	public Voter(String name, int age) {
		super();
		this.name = name;
		
		if(age<18)
			throw new AgeNotValidException(age);
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + "]";
	}
	

	

}
