package com.aurion.TWODARRAYS;
import java.util.Scanner;
public class TwoDArrayPrint {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter the row of array");
  int n = scanner.nextInt();
  System.out.println("Enter the column of array");
  int m= scanner.nextInt();
  int array[][] = new int[n][m];
  
  System.out.println("Enter the element of rows and column  ");
  for(int i= 0;i<n;i++) {
   for(int j=0;j<m;j++) {
    array[i][j] = scanner.nextInt();
   }
  }
  for(int i=0;i<n;i++) {
   for(int j=0;j<m;j++) {
    System.out.print(array[i][j] +" ");
   }
   System.out.println("");
  }
  
   
 }

}
