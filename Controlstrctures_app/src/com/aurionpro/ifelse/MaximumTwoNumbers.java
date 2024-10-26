package com.aurionpro.ifelse;

import java.util.Scanner;

public class MaximumTwoNumbers {

	public static void main(String[] args) {

     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the first number : ");
     int num1=scanner.nextInt();
     System.out.print("Enter the second number: ");
     int num2 = scanner.nextInt();
     
     if(num1>num2) {
    	 System.out.println("number 1 is greater");
     }
     else {
    	 System.out.println("number 2 is greater");
     }

	}

}
