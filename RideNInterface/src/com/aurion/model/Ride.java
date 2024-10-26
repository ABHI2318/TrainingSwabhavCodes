package com.aurion.model;

public  abstract class Ride implements IFair{
	private int distance;
	private int price;
	
	public Ride(int distance) {
		super();
		this.distance = distance;
	}
	
	
	
	
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

