package com.aurion.model;

public class ConsumerQ implements Runnable {
	 Q q;
	 public ConsumerQ(Q q) {
	 this.q = q;
	 new Thread(this, "Consumer").start();
	 }
	 public void run() {
	 while(true) {
	 q.get();
	 }
	 }
	}