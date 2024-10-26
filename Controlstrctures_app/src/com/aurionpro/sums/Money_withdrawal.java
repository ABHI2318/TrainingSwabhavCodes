package com.aurionpro.sums;

import java.util.Scanner;

public class Money_withdrawal {

	public static void main(String[] args) {
		// WAP to accept amount as input. Input amount should not exceed 50000.
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int amount=scanner.nextInt();
		if(amount>50000) {
			System.out.println("The amount exceeds the limit");
			
		}
		else if (amount % 100 != 0) {
            System.out.println("Enter the value in multiples of 100.");
        } else {
            // Calculate the number of notes required for each denomination
            int twoThousand = amount / 2000;
            amount = amount % 2000;

            int fiveHundred = amount / 500;
            amount = amount % 500;

            int twoHundred = amount / 200;
            amount = amount % 200;

            int hundred = amount / 100;
            amount = amount % 100;

            // Print the number of notes for each denomination if it is greater than zero
            if (twoThousand > 0) {
                System.out.println("Two Thousand: " + twoThousand);
            }
            if (fiveHundred > 0) {
                System.out.println("Five Hundred: " + fiveHundred);
            }
            if (twoHundred > 0) {
                System.out.println("Two Hundred: " + twoHundred);
            }
            if (hundred > 0) {
                System.out.println("Hundred: " + hundred);
            }
        }

		

	}

}
