package com.aurion.banktest;

import java.util.Scanner;

import com.aurion.accounts.CurrentAccount;
import com.aurion.accounts.SavingAccount;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		SavingAccount saving1 = null;
		CurrentAccount current1 = null;
		boolean exit = false;
		int accounttype = 0;
		while (!exit) {
			System.out.println("Bank App Simulator");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
			System.out.println("4. Show Balance");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				if (saving1 == null || current1 == null) {
					System.out.println(
							"Choose Account Type: Press '1' for Saving Account or Press '2' for Current Account");
					accounttype = scanner.nextInt();
					if (accounttype == 1) {
						System.out.print("Enter account number: ");
						int accountNumber = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Enter name: ");
						String name = scanner.nextLine();
						System.out.print("Enter Balance Rs:  ");
						double balance = scanner.nextDouble();
						System.out.println("Enter InterestRate: ");
						double interestRate = scanner.nextDouble();
						saving1 = new SavingAccount(name, accountNumber, balance, interestRate);
						System.out.println("Account created successfully.");
					} else if (accounttype == 2) {
						System.out.print("Enter account number: ");
						int accountNumber = scanner.nextInt();
						scanner.nextLine();
						System.out.print("Enter name: ");
						String name = scanner.nextLine();
						System.out.print("Enter Balance Rs:  ");
						double balance = scanner.nextDouble();
						System.out.println("Enter Overdraft Amount: ");
						int overdraftAmount = scanner.nextInt();
						saving1 = new SavingAccount(name, accountNumber, balance, overdraftAmount);
						System.out.println("Account created successfully.");
					}
				} else {
					System.out.println("Account already exists.");
				}
				break;
			case 2:
				if (accounttype == 1 && saving1 != null) {
					System.out.print("Enter amount to deposit: ");
					double deposit = scanner.nextDouble();
					saving1.deposit(deposit);
					System.out.println(saving1.getBalance());
				} else if (accounttype == 2 && current1 != null) {
					System.out.print("Enter amount to deposit: ");
					double deposit = scanner.nextDouble();
					current1.deposit(deposit);
					System.out.println(current1.getBalance());
				} else {
					System.out.println("No account found. Please create an account.");
				}
				break;
			case 3:
				if (accounttype == 1 && saving1 != null) {
					System.out.print("Enter amount to withdraw: ");
					double withdraw = scanner.nextDouble();
					saving1.withdrawal(withdraw);
					System.out.println(saving1.getBalance());
				} else if (accounttype == 2 && current1 != null) {
					System.out.print("Enter amount to withdraw: ");
					double withdraw = scanner.nextDouble();
					current1.withdrawal(withdraw);
					System.out.println(current1.getBalance());
				} else {
					System.out.println("No account found. Please create an account.");
				}
				break;
			case 4:
				if (accounttype == 1 && saving1 != null) {
					System.out.println("The balance is: " + saving1.getBalance());
				} else if (accounttype == 2 && current1 != null) {
					System.out.println("The balance is: " + current1.getBalance());
				} else {
					System.out.println("No account found. Please create an account.");
				}
				break;
			case 5:
				exit = true;
				System.out.println("Thankyou for using the App.");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
		scanner.close();

	}

}
