package com.aurion.model;

public class ProducerQ implements Runnable {
	 Q q;
	 public ProducerQ(Q q) {
	 this.q = q;
	 new Thread(this, "Producer").start();
	 }
	 public void run() {
	 int i = 0;
	 while(true) {
	 q.put(i++);
	 }
	 }
	}
