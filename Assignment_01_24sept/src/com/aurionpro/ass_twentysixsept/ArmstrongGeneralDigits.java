package com.aurionpro.ass_twentysixsept;

import java.util.Scanner;

public class ArmstrongGeneralDigits {

	public static void main(String[] args) {
		// Finding armstrong for the general digits
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scanner.nextInt();

		
		int n=number;
		//int digitcount=String.valueOf(number).length();
	 int digitcount=0;
	 while(number>0) {
		 number=number/10;
		 digitcount++;
		 
	 }
		number=n;
		int remainder=0,sum=0;
		while(n>0) {
			remainder=n%10;
			n=n/10;
			sum=sum+(int)Math.pow(remainder,digitcount);
		
		}
		if(sum==number) {
			System.out.println("Its an amrstrong number");
		}
		else {
			System.out.println("its not an armstrong number");
		}
	}}


