package com.aurion.adapter.model;

public class Biscuit implements IItem{
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Biscuit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

}
