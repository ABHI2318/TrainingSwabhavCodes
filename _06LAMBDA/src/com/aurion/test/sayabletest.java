package com.aurion.test;

import com.aurion.model.Isayable;



public class sayabletest {

	public static void main(String[] args) {
		Isayable sayable=new Isayable() {
			@Override
			public void isay() {
				System.out.println("hi anonymous function");
			}
			};
			
			Isayable sayable2=()->System.out.println("hi lamda function");
			sayable.isay();
			sayable2.isay();
		

	}

}
