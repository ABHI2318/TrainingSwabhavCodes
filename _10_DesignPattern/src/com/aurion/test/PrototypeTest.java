package com.aurion.test;

import com.aurion.model.Prototype;

public class PrototypeTest {

	public static void main(String[] args) {
		Prototype prototype=new Prototype("abhishek");
		Prototype cloned=(Prototype) prototype.clone();
		
		System.out.println("original name"+prototype.getName());
		System.out.println("cloned name"+cloned.getName());

	}

}
