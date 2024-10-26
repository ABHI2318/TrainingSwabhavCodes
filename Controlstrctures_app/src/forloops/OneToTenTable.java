package forloops;

import java.util.Scanner;

public class OneToTenTable {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number between 1 to 10 : ");
		  int num = scanner.nextInt();
               if (num >= 1 && num <= 10) {
	            System.out.println("Multiplication Table of " + num);
	            for (int i = 1; i <= 10; i++) {
	                System.out.println(num + " x " + i + " = " + (num * i));
	            }
	        } else {
	            System.out.println(" strictly from 1 to 10.");
	        }
	}

}
