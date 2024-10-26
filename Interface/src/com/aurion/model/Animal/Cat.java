package com.aurion.model.Animal;

public class Cat implements  Animal {

	@Override
	public void sleep() {
		System.out.println("cat is sleeping");
		
	}

	@Override
	public void eat() {
		System.out.println("cat is eating");
		
	}

}
