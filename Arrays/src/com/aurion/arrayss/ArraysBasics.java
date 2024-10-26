package com.aurion.arrayss;
import java.util.Scanner;

public class ArraysBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
      
      System.out.println("enter the size of array: ");
      int size=scanner.nextInt();
      int marks[]=new int[size];
      System.out.println("enter marks of students: ");
      for(int i=0;i<size;i++) {
    	  marks[i]=scanner.nextInt();
    	  
      }
      
      for(int i=0;i<size;i++) {
    	
    	  System.out.println("the marks are "+marks[i]);
      }
      
	}

}
