package com.aurionpro.Assign_29sept;

import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number=(int)(100*Math.random())+1;
		int trails=5;
		
		System.out.println("A number to be chosen from 1 to 100 in 5 trails");
		int i;
		for( i=0;i<trails;i++) {
			System.out.println("Guess the number in : "+(trails-i)+" trails");
			int guess=scanner.nextInt();
			
			if(number==guess) {
				System.out.println("Congratulations you have guessed it correctly");
			break;
			}
			else if(number>guess && i!=trails-1) {
				System.out.println("Sorry , Too low ");
			}
			else if(number<guess && i!=trails-1) {
				System.out.println("Sorry, Too high ");
			}
			
		}
		
		if(i==trails) {
	    System.out.println("you have exhausted your trails:");
		}
		System.out.println("The number was "+number);
		}

	}


