package com.aurion.TWODARRAYS;

import java.util.Scanner;

public class matrixMultiplyTwoD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows of the first matrix:");
        int firstMatrixRows = scanner.nextInt();
        System.out.println("Enter the number of columns of the first matrix:");
        int firstMatrixColumns = scanner.nextInt();
        System.out.println("Enter the number of rows of the second matrix:");
        int secondMatrixRows = scanner.nextInt();
        System.out.println("Enter the number of columns of the second matrix:");
        int secondMatrixColumns = scanner.nextInt();

        if (firstMatrixColumns != secondMatrixRows) {
            System.out.println("Invalid Input: Columns of the first matrix must equal rows of the second.");
            return;
        }

        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixColumns];
        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixColumns];
        int[][] resultMatrix = new int[firstMatrixRows][secondMatrixColumns];

     
    }
}