package com.aurion.TWODARRAYS;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

       int a[][];int b[][];int result[][];
       a=new int [2][2];
       b=new int [2][2];
       result=new int [2][2];
       
       Scanner scanner=new Scanner(System.in);
       System.out.println("enter the first matrix");
       for(int i=0;i<2;i++) {
    	   for(int j=0;j<2;j++)
    		   a[i][j]=scanner.nextInt();
       }
       System.out.println("enter the second  matrix");
       for(int i=0;i<2;i++) {
    	   for(int j=0;j<2;j++)
    		   b[i][j]=scanner.nextInt();
       
       }
       
       for(int i=0;i<2;i++) {
    	   for(int j=0;j<2;j++) {
    		   result[i][j]=0;
    		   for(int k=0;k<2;k++)
    		   {
    			   result [i][j]=result[i][j]+a[i][k]*b[k][j];
    		   }
    	   }
       }
    		   System.out.println("multiplication result ");
    		   
    		   for(int i=0;i<2;i++) {
    			   for(int j=0;j<2;j++) {
    				   System.out.print(result[i][j]+"\t");
    			   }
    			   System.out.println();
    		
    	   }
    	   
       
	}

}
