package com.aurion.test;


import java.util.Scanner;

import com.aurion.model.BankAccount;
import com.aurion.model.Current;
import com.aurion.model.Saving;

public class BankApp {

	public static void main(String[] args) {
		
     Scanner scanner =new Scanner(System.in);
   //    System.out.println("enter the balance : ");
     //  int balance=scanner.nextInt();
   //    System.out.println("enter account number: ");
  //     int accountno=scanner.nextInt();
    //   System.out.print("Enter the name: ");
      // String name = scanner.next();
      BankAccount bankaccount =new Saving("abhi",23,456);
		System.out.print("Enter the deposit amount: ");
		int deposit = scanner.nextInt();
		bankaccount.deposit(deposit);
		
		
		System.out.print("Enter the withdraw amount: ");
		int withdraw = scanner.nextInt();
		 bankaccount.withdraw(withdraw);
		 BankAccount currentAccount = new Saving("de",24,456 );
       
	}

}
