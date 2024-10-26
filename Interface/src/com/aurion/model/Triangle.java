package com.aurion.model;

public class Triangle implements shape {
   private int height;
   private int base;
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getBase() {
	return base;
}
public Triangle(int height, int base) {
	super();
	this.height = height;
	this.base = base;
}
public void setBase(int base) {
	this.base = base;
}

public void area() {
	System.out.println("the area of traingle is "+(0.5*(height*base)));
}
}
