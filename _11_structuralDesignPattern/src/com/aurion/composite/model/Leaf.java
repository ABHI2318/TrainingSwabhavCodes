package com.aurion.composite.model;

public class Leaf implements IComponent {

	
	 int price;
	 String name;
	@Override
	public void showPrice() {
		System.out.println(name+" "+price);
		
	}
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

}
