package com.aurionpro.commandline;

public class Adder {

	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		int sum=num1+num2;
		System.out.println("addtion of the number is "+sum);
	}

}
