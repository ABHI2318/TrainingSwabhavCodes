package com.aurion.test;

import com.aurion.model.Circle;
import com.aurion.model.Rectangle;
import com.aurion.model.Triangle;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1=new Circle(9);
		circle1.area();
		Rectangle rect=new Rectangle(4,5);
		rect.area();
		Triangle tri=new Triangle(7,8);

	}

}
