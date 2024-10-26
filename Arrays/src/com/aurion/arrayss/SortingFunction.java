package com.aurion.arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class SortingFunction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		int[] arrays = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the number for index " + i + ": ");
			arrays[i] = scanner.nextInt();
		}
		
		Arrays.sort(arrays);
		arrays = square(arrays); 
		
		for (int j = 0; j < size; j++) {
			System.out.println(arrays[j] + " ");
		}
	}

	public static int[] square(int[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = arrays[i] * arrays[i]; 
		}
		return arrays;
	}
}
