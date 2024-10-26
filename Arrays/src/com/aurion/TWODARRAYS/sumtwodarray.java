package com.aurion.TWODARRAYS;

import java.util.Scanner;

public class sumtwodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter the row of array");
		  int n = scanner.nextInt();
		  System.out.println("Enter the column of array");
		  int m= scanner.nextInt();
		  int array1[][] = new int[n][m];
		  int array2[][] =new int [n][m];
		  System.out.println("Enter the element of rows and column for array1 ");
		  for(int i= 0;i<n;i++) {
		   for(int j=0;j<m;j++) {
		    array1[i][j] = scanner.nextInt();
		   }
		  }
		  System.out.println("Enter the element of rows and column array2 ");
		  for(int i= 0;i<n;i++) {
		   for(int j=0;j<m;j++) {
		    array2[i][j] = scanner.nextInt();
		   }
		  }
		  for(int i=0;i<n;i++) {
		   for(int j=0;j<m;j++) {
		    System.out.print(array1[i][j] +array2[i][j]);
		   }
		   System.out.println("");
		  }
	}

}
