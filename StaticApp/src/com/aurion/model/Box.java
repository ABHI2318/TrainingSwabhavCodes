package com.aurion.model;

public class Box {

	private int width;
static	private int depth;
	private int height;
	
	public void increment() {
		width++;
		depth++;
		height++;
	}
	
	public void display() {
		System.out.println("widht "+width);
		System.out.println("height "+height);
		System.out.println("depth "+depth);
	}
	
	 {
		System.out.println("inside non static");
	}
	
}
