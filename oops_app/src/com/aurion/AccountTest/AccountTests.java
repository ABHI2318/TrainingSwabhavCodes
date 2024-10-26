package com.aurion.AccountTest;

import java.util.Scanner;
import com.aurion.Account.AccountClass;
public class AccountTests {

	
		// TODO Auto-generated method stub
		 public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        AccountClass account = null;

		        while (true) {
		            System.out.println("Menu:");
		            System.out.println("1. Create Account");
		            System.out.println("2. Deposit Amount");
		            System.out.println("3. Withdraw Amount");
		            System.out.println("4. Show Balance");
		            System.out.println("5. Exit");
		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter account number: ");
		                    int accountNumber = scanner.nextInt();
		                    System.out.print("Enter name: ");
		                    String name = scanner.next();
		                    System.out.print("Enter initial balance: ");
		                    double balance = scanner.nextDouble();
		                    account = new AccountClass(accountNumber,name,balance);
		                    System.out.println("Account created successfully.");
		                    break;
		                case 2:
		                    if (account != null) {
		                        System.out.print("Enter amount to deposit: ");
		                        double depositAmount = scanner.nextDouble();
		                        account.deposit(depositAmount);
		                    } else {
		                        System.out.println("No account found.");
		                    }
		                    break;
		                case 3:
		                    if (account != null) {
		                        System.out.print("Enter amount to withdraw: ");
		                        double withdrawAmount = scanner.nextDouble();
		                        account.withdrawal(withdrawAmount);
		                    } else {
		                        System.out.println("No account found");
		                    }
		                    break;
		                case 4:
		                    if (account != null) {
		                        account.showBalance();
		                    } else {
		                        System.out.println("No account found");
		                    }
		                    break;
		                case 5:
		                    System.out.println("Exiting...");
		                    scanner.close();
		                    return;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        }
		    }
		}