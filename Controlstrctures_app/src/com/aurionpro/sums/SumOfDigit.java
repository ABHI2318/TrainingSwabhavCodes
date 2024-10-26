package com.aurionpro.sums;

public class SumOfDigit {
    public static void main(String[] args) {
        // sum of digits
        int number = 123;
        int sum = 0;

        while (number != 0) {
            sum =sum+ number % 10;
            number =number/ 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
