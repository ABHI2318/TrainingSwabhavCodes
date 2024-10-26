package com.aurionpro.first;

public class swapWithoutThirdVariable {

	public static void main(String[] args) {
		int num1=5;
		int num2=10;
		
		System.out.println("Before swap"+" "+"first number"+" "+num1+" "+"second number " +" "+num2);
		
		 num1=num1+num2;
	     num2=num1-num2;
		 num1=num1-num2;
		
		System.out.println("After swap"+" "+"first number"+" "+num1+" "+"second number " +" "+num2);
		
	}

}
