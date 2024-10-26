package com.aurion.isp.violation.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("robot is statring to work");
	}

	@Override
	public void stopWork() {
		System.out.println("robot is stopped the work");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chargfe() {
		System.out.println("robot is charging");
		
	}


	

}
