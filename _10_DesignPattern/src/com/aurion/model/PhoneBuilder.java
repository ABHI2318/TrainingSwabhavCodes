package com.aurion.model;

public class PhoneBuilder {
	private String os;
	private String processor;
	private int camera;
	private double screensize;
	private int battery;
	public PhoneBuilder(String os, String processor, int camera, double screensize, int battery) {
		super();
		this.os = os;
		this.processor = processor;
		this.camera = camera;
		this.screensize = screensize;
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "PhoneBuilder [os=" + os + ", processor=" + processor + ", camera=" + camera + ", screensize="
				+ screensize + ", battery=" + battery + "]";
	}
	

}
