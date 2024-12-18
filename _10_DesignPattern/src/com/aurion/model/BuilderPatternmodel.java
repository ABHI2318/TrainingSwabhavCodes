package com.aurion.model;

public class BuilderPatternmodel {

	private String os;
	private String processor;
	private int camera;
	private double screensize;
	private int battery;
	
	public BuilderPatternmodel  setOs(String os) {
		this.os = os;
		return this;
	}
	public BuilderPatternmodel  setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public BuilderPatternmodel  setCamera(int camera) {
		this.camera = camera;
		return this;
	}
	public BuilderPatternmodel  setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}
	public BuilderPatternmodel  setBattery(int battery) {
		this.battery = battery;
		return this;
	}
     public PhoneBuilder getPhone() {
    	 return new PhoneBuilder(os, processor, camera, screensize, battery);
     }
}
