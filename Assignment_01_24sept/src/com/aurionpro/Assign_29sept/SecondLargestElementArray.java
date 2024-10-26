package com.aurionpro.Assign_29sept;

import java.util.Scanner;

public class SecondLargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int number=scanner.nextInt();
         int arr[];
		arr=new int[number];
		System.out.println("Enter the number in the array: ");
		for(int i=0;i<number;i++) {
			arr[i]=scanner.nextInt();
		}
		
		int largest=arr[0];
		for(int i=0;i<number;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		int secondlargest=Integer.MIN_VALUE;
		for(int i=0;i<number;i++) {
			if(arr[i]>secondlargest && arr[i]!=largest){
				secondlargest=arr[i];
			}
			
		}
		System.out.println("the second largest element is "+secondlargest);
	}
}
