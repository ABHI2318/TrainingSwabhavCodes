package com.aurion.TWODARRAYS;

import java.util.Scanner;

public class MultiplicationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of rows of the first matrix:");
	        int n1 = scanner.nextInt();
	        System.out.println("Enter the number of columns of the first matrix:");
	        int m1 = scanner.nextInt();
	        
	        
	        System.out.println("Enter the number of rows of the second matrix:");
	        int n2 = scanner.nextInt();
	        System.out.println("Enter the number of columns of the second matrix:");
	        int m2 = scanner.nextInt();
	        
	        
	        int[][] matrix1 = new int[n1][m1];
	        int[][] matrix2 = new int[n2][m2];
	        int[][] result = new int[n1][m2]; 
	        
	       
	        if (m1 != n2) {
	            System.out.println("Invalid Input...Reason Columns of the first matrix must equal rows of the second.");
	            return;
	        }
	     
	        System.out.println("Enter the elements of the first matrix:");
	        for (int i = 0; i < n1; i++) {
	            for (int j = 0; j < m1; j++) {
	                matrix1[i][j] = scanner.nextInt();
	            }
	        }
	        
	      
	        System.out.println("Enter the elements of the second matrix:");
	        for (int i = 0; i < n2; i++) {
	            for (int j = 0; j < m2; j++) {
	                matrix2[i][j] = scanner.nextInt();
	            }
	        }
	        
	       
	        for (int i = 0; i < n1; i++) {
	            for (int j = 0; j < m2; j++) {
	                for (int k = 0; k < m1; k++) { 
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }
	        
	       
	        System.out.println("The resultant matrix after multiplication is:");
	        for (int i = 0; i < n1; i++) {
	            for (int j = 0; j < m2; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        scanner.close();
	    }
	}
