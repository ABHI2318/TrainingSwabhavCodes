package com.aurion.adapter.model;

public class Chocolate implements IItem{
	private String name;
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
	public Chocolate(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	private double price;

}
