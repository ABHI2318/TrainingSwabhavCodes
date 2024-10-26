package com.aurion.TWODARRAYS;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter the rows and columns of the matrix");
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		
		int matrix[][]=new int[row][column];
		int transpose[][]=new int[column][row];
		
		System.out.println("enter the matrix: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++)
				matrix[i][j]=scanner.nextInt();
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				transpose[j][i]=matrix[i][j];
			}
		}
		
		System.out.println("the original matrix is: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		 
		System.out.println("the transposed matrix is :");
		for(int i=0;i<column;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}

	}

}
