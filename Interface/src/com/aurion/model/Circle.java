package com.aurion.model;

public class Circle implements shape{
	private int radius;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void area() {
		// TODO Auto-generated method stub
   System.out.println("the area of circle is "+(3.14*radius*radius));
	}

}
