package com.aurionpro.scanner;

import java.util.Scanner;

public class Adder {

	public static void main(String[] args) {
		// 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the dfirst number : ");
		int number1=scanner.nextInt();
		
		System.out.println("Enter the second  number : ");
		int number2=scanner.nextInt();
		
		int sum=number1+number2;
		
		System.out.println("the sum is "+sum);
		
		

	}

}
