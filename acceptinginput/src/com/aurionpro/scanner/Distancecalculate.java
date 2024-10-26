package com.aurionpro.scanner;

import java.util.Scanner;

public class Distancecalculate {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		System.out.println("enter x1: ");
		int x1=scanner.nextInt();
		System.out.println("enter x2: ");
		int x2=scanner.nextInt();
		System.out.println("enter y1: ");
		int y1=scanner.nextInt();
		System.out.println("enter y2: ");
		int y2=scanner.nextInt();
	 double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		 
		 System.out.println(" the distance is " +distance);
		
		}

}
