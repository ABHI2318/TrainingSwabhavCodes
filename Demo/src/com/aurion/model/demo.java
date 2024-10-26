package com.aurion.model;

public class demo {
	private double width;
	private double height;
	private double depth;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	@Override
	public String toString() {
		return "demo [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
}
