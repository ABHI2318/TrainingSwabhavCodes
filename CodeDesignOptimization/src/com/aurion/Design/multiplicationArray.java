package com.aurion.Design;

import java.util.Scanner;

public class multiplicationArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows of the first matrix:");
        int rowMatrix1 = scanner.nextInt();
        System.out.println("Enter the number of columns of the first matrix:");
        int colMatrix1 = scanner.nextInt();
        
        System.out.println("Enter the number of rows of the second matrix:");
        int rowMatrix2 = scanner.nextInt();
        System.out.println("Enter the number of columns of the second matrix:");
        int colMatrix2 = scanner.nextInt();
        
        if (colMatrix1 != rowMatrix2) {
            System.out.println("Invalid Input... Columns of the first matrix must equal rows of the second.");
            return;
        }

        int[][] matrix1 = new int[rowMatrix1][colMatrix1];
        int[][] matrix2 = new int[rowMatrix2][colMatrix2];
        int[][] resultMatrix = new int[rowMatrix1][colMatrix2];
        
        System.out.println("Enter the elements of the first matrix:");
        for (int row1 = 0; row1 < rowMatrix1; row1++) {
            for (int col1 = 0; col1 < colMatrix1; col1++) {
                matrix1[row1][col1] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter the elements of the second matrix:");
        for (int row2 = 0; row2 < rowMatrix2; row2++) {
            for (int col2 = 0; col2 < colMatrix2; col2++) {
                matrix2[row2][col2] = scanner.nextInt();
            }
        }

        for (int row1 = 0; row1 < rowMatrix1; row1++) {
            for (int col2 = 0; col2 < colMatrix2; col2++) {
                for (int commonDim = 0; commonDim < colMatrix1; commonDim++) {
                    resultMatrix[row1][col2] += matrix1[row1][commonDim] * matrix2[commonDim][col2];
                }
            }
        }

        System.out.println("The resultant matrix after multiplication is:");
        for (int row1 = 0; row1 < rowMatrix1; row1++) {
            for (int col2 = 0; col2 < colMatrix2; col2++) {
                System.out.print(resultMatrix[row1][col2] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
