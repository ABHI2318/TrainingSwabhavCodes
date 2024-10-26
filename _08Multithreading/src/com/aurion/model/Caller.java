package com.aurion.model;

public class Caller implements Runnable {
	 String msg;
	 Callme target;
	 Thread t;
	 public Caller(Callme targ, String s) {
	 target = targ;
	 msg = s;
	 t = new Thread(this);
	 t.start();
	 }
	 public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Callme getTarget() {
		return target;
	}
	public void setTarget(Callme target) {
		this.target = target;
	}
	public Thread getT() {
		return t;
	}
	public void setT(Thread t) {
		this.t = t;
	}
	public void run() {
	 target.call(msg);
	 }
	}