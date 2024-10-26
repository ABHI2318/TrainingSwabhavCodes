package forloops;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
		  System.out.println("Enter a number to find its factorial: ");
		  Scanner scanner=new Scanner(System.in);
	        int num = scanner.nextInt();

	        int factorial = 1; 
	        if (num < 0) {
	            System.out.println("Factorial not for negative numbers.");
	        } else {
	            for (int i = 1; i <= num; i++) {
	                factorial =factorial* i;
	            }

	            System.out.println("The factorial of " + num + " is: " + factorial);
	        }

	}

}
