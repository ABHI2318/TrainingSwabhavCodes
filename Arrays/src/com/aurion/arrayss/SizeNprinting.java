package com.aurion.arrayss;

import java.util.Scanner;

public class SizeNprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the size of arrasy ");
      int size=scanner.nextInt();
      int number[]=new int[size];//array of users size
      System.out.println("Enter the elements in the array: ");
      for(int i=0;i<size;i++) {
    	  number[i]=scanner.nextInt();	
      }
      for(int i=0;i<size;i++) {
    	  System.out.println("the numbers are "+number[i]);
      }
	}

}
