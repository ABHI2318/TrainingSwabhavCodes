package com.aurionpro.ifelse;

import java.util.Scanner;

public class PositiveNegativeChecker {

	public static void main(String[] args) {
		// number is positive or negvtive
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number ");
		int number=scanner.nextInt();
		if(number<0) {
			System.out.println("negative number");
		}
		else {
			System.out.println("positive number ");
		}
		

	}

}
