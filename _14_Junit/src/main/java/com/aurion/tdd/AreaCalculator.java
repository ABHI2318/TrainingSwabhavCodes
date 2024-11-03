package com.aurion.tdd;

public class AreaCalculator {

	double calculateAreaofCircle(int radius) {
		return 3.14*radius*radius;
	}

	 double calculateAreaofSquare(int  side) {
		
		return side*side;
	}

	double  calculateAreaofTriangle(int base, int height) {
		
		return 0.5*base*height;
	}
	
	
}
