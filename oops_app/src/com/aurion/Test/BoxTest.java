package com.aurion.Test;

import com.aurion.model.Box;

public class BoxTest {
	
	 public static void main(String[]args) {
		 
	Box box1=new Box();
	System.out.println("Box1 ");
	box1.setWidth(10);
	System.out.println("width is "+box1.getWidth());
	
	Box box2=new Box();
	System.out.println("Box2 ");
	box2.setHeight(20);
	System.out.println("height is "+box2.getHeight());
	
	
	Box box3=new Box();
	System.out.println("Box3 ");
	box3.setDepth(-5);
	System.out.println("the deth is "+box3.getDepth());
	}
	}

   

