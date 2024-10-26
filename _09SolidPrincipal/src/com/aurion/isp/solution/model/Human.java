package com.aurion.isp.solution.model;

public class Human implements IWorker,IRobot {

	@Override
	public void startwork() {
		System.out.println("human is starting work");
		
	}

	@Override
	public void stopwork() {
		
		System.out.println("human is stopping work");
	}

	@Override
	public void eat() {
		System.out.println("human is eating");
		
	}

	@Override
	public void drink() {
		System.out.println("human is eating");
		
	}

}
