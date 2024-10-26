package com.aurionpro.assign_2;

import java.util.Scanner;

public class PrimeNumberchecker {
	
	public static boolean isprime(int num) {
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=scanner.nextInt();
		
		if(isprime(num)) {
			System.out.println(num + " the number is prime");
		}
		else {
			System.out.println(num + " is not prime");
		}
	}

}
