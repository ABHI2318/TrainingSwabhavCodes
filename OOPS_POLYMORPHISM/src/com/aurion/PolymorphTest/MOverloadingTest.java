package com.aurion.PolymorphTest;

import com.aurion.polymorphismModel.MOverloading;

public class MOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MOverloading obj=new MOverloading();
		int c1=obj.sum(4,50);
		System.out.println(c1);
		
		MOverloading obj1=new MOverloading();
		int c2=obj1.sum(4,5,6);
		System.out.println(c2);

	}

}
