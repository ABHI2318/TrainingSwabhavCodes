package com.aurion.model;

public class CarDemoModel {
	
public	String model;
public	String brand;
public	String color;
public	int year;
public    int speed;
	
	public void accelrate(int increment) {
		speed+=increment;
	}
	
	public void brake(int decrement) {
		speed-=decrement;
		if(speed<0) {
			speed=0;
		}
	}

}
