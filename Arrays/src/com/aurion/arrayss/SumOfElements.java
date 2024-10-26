package com.aurion.arrayss;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum of number
		
	      Scanner scanner=new Scanner(System.in);
	      System.out.println("enter the size arrays");
	      int size=scanner.nextInt();
	     int [] arrays=new int[size];
	     int sum=0;
	     for(int i=0;i<size;i++) {
	    	 System.out.println("Enter the element: "+(i+1)+" ");
	    	 int element=scanner.nextInt();
	    	 arrays[i]=element;
	    	 sum=+arrays[i];
	    	 }
	     for(int i=0;i<size;i++) {
	    	 System.out.println(arrays[i]+" ");
	     }
           System.out.println("the sum is "+sum);
	     
	      }

	}

