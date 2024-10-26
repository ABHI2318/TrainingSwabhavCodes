package com.aurion.model;

public class runnablethread implements Runnable {
	
	private Thread threads;
	
	public runnablethread(String string) {
		super();
		this.threads=new Thread(this);
		threads.start();
	}

	
	@Override
	public void run() {
		System.out.println("inside thread " +threads.getName());
		
	}
	
	public Thread getThread() {
		return threads;
	}

}
