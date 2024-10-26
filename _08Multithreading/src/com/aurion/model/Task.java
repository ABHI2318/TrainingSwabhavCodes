package com.aurion.model;

public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("excecuted by"+Thread.currentThread().getName());
		
	}

}
