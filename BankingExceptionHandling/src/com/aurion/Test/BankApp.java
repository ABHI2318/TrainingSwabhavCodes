package com.aurion.Test;

import java.util.Scanner;

import com.aurion.Exceptions.MinimumAmountException;
import com.aurion.Exceptions.NegativeAmountException;
import com.aurion.Exceptions.OverdraftLimitExceedException;
import com.aurion.model.CurrentAccount;
import com.aurion.model.SavingAccount;

public class BankApp {
		
		 public static void main(String[] args) {
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
		                    //if (saving1 == null && current1 == null) {
		                        System.out.println("Choose Account Type: Press '1' for Saving Account or '2' for Current Account");
		                        accounttype = scanner.nextInt();
		                        
		                        System.out.print("Enter account number: ");
		                        int accountNumber = scanner.nextInt();
		                        scanner.nextLine();  
		                        
		                        System.out.print("Enter name: ");
		                        String name = scanner.nextLine();
		                        
		                        System.out.print("Enter Balance Rs: ");
		                        double balance = scanner.nextDouble();
		                        
		                        if (accounttype == 1) {
		                        	try {
			                            System.out.print("Enter Interest Rate: ");
			                            double interestRate = scanner.nextDouble();
			                            saving1 = new SavingAccount(name, accountNumber, balance, interestRate);
			                           
			                            System.out.println("Saving Account created successfully.");
			                            saving1.displaySavingAccountCount();
		                        	}catch(NegativeAmountException exception) {
			                    		System.out.println(exception.getMessage());
			                    	}
		                        } else if (accounttype == 2) {
		                        	try {
			                            System.out.print("Enter Overdraft Amount: ");
			                            int overdraftAmount = scanner.nextInt();
			                            
			                            current1 = new CurrentAccount(name, accountNumber, balance, overdraftAmount);
			                            current1.displayCuurentAccountCount();
			                            System.out.println("Current Account created successfully.");
		                        	}catch(NegativeAmountException exception) {
			                    		System.out.println(exception.getMessage());
			                    	}
		                        }
//		                    	}else {
//		                        System.out.println("Account already exists.");
//		                    }
		                    break;
		                    
		                case 2:
		                    System.out.print("Enter amount to deposit: ");
		                    double deposit = scanner.nextDouble();
		                    
		                    if (accounttype == 1 && saving1 != null) {
		                    	try {
		                        saving1.deposit(deposit);
		                        System.out.println("balance deposited is " + deposit);
		                        System.out.println("New balance: Rs " + saving1.getBalance());
		                    	}catch(NegativeAmountException exception) {
		                    		System.out.println(exception.getMessage());
		                    	}
		                        
		                    } else if (accounttype == 2 && current1 != null) {
		                    	try {
		                        current1.deposit(deposit);
		                        
		                        System.out.println("balance deposited is " + deposit);
		                        System.out.println("New balance: Rs " + current1.getBalance());
		                    	}catch(NegativeAmountException exception) {
		                    		System.out.println(exception.getMessage());
		                    	}
		                        
		                    } else {
		                        System.out.println("No account found. Please create an account.");
		                    }
		                    break;
		                    
		                case 3:
		                    System.out.print("Enter amount to withdraw: ");
		                    double withdraw = scanner.nextDouble();
		                    
		                    if (accounttype == 1 && saving1 != null) {
		                    	try {
		                        saving1.withdraw(withdraw);
		                        System.out.println("The withdraw amount  is " + withdraw);
		                        System.out.println("New balance: Rs " + saving1.getBalance());
		                    	}catch(NegativeAmountException exception) {
		                    		System.out.println(exception.getMessage());
		                    	}catch(MinimumAmountException exception) {
		                    		System.out.println(exception.getMessage());
		                    	}
		                        
		                    } else if (accounttype == 2 && current1 != null) {
		                    	try {
		                        current1.withdraw(withdraw);
		                        System.out.println("The withdraw amount  is " + withdraw);
		                        System.out.println("New balance: Rs " + current1.getBalance());
		                    	}catch(NegativeAmountException exception) {
		                    		System.out.println(exception.getMessage());
		                    	}catch(OverdraftLimitExceedException exception) {
		                    		System.out.println(exception.getMethod());
		                    	}
		                        
		                    } else {
		                        System.out.println("No account found. Please create an account.");
		                    }
		                    break;
		                    
		                case 4:
		                    if (accounttype == 1 && saving1 != null) {
		                        System.out.println("The balance is: Rs " + saving1.getBalance());
		                    } else if (accounttype == 2 && current1 != null) {
		                        System.out.println("The balance is: Rs " + current1.getBalance());
		                    } else {
		                        System.out.println("No account found. Please create an account.");
		                    }
		                    break;
		                    
		                case 5:
		                    exit = true;
		                    System.out.println("Thank you for using the App.");
		                    break;
		                    
		                default:
		                    System.out.println("Invalid option. Please try again.");
		            }
		        }
		        scanner.close();
		    }
		}