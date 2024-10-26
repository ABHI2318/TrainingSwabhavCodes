package com.aurion.arrayss;

import java.util.Scanner;

public class Maxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner scanner=new Scanner(System.in);
	      System.out.println("enter the size arrays");
	      int size=scanner.nextInt();
	     int [] arrays=new int[size];
	     int max=arrays[1];
	     for(int i=0;i<size;i++) {
	    	 System.out.println("Enter the element: "+(i+1)+" ");
	    	 int element=scanner.nextInt();
	    	 arrays[i]=element;
	    	 if(arrays[i]>max)  {
	    		 max=arrays[i];
	         }
	      }
	     System.out.println("The max element is "+max);
	}
}
