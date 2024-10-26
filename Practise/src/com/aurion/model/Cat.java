package com.aurion.model;

public class Cat {

	private String name;


	public static void main(String[] args) {
		Cat a=new Cat();
		a.name="bob";
		Cat cat=makeCatUpperCase(a);
		System.out.println(cat.name);
		System.out.println(a.name);
		
		

	}
	
	
	public static Cat makeCatUpperCase(Cat cat) {
		cat.name=cat.name.toUpperCase();
		return cat;
		
	}

}
