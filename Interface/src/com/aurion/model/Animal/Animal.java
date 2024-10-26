package com.aurion.model.Animal;

public interface Animal {
    int Max_age=76;
	void sleep();
	public abstract void eat();
	public static void info() {
		System.out.println("info about animal");
	}
	
	default void run() {
		System.out.println("animal is running");
	}
}