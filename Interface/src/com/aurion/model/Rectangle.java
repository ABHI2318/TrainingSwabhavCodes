package com.aurion.model;

public class Rectangle implements shape {
	private int length;
	private int breadth;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public void area() {
		// TODO Auto-generated method stub
   System.out.println("the area of circle is "+(length*breadth));
	}


}
