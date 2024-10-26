package com.aurionpro.assign_2;

import java.util.Scanner;

public class ValidEmailChecker {

	public static void main(String[] args) {
		// 
          Scanner scanner=new Scanner(System.in);
          System.out.println("Enter the mail id: ");
          String email=scanner.next();
          	String mailing="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
          	boolean validation=email.matches(mailing);
          	if(validation) {
          		System.out.println("Given mail is valid");
          		
          	}
          	else {
          		System.out.println("Mail is not valid");
          	}

	}

}
