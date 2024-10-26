 package ATM_assignment;

import java.util.Scanner;

public class ATMMACHINE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance=0.00;
		Scanner scanner=new Scanner(System.in);
		boolean exit=false;
		
		while(!exit) {
			System.out.println("ATM MENU: ");
			System.out.println("1.Check Balance ");
			System.out.println("2.Deposit Money");
			System.out.println("3.WithDraw Money");
			System.out.println("4.Exit");
			System.out.println("Please choose an option: ");
		
		
		
		int option=scanner.nextInt();
		switch(option) {
		case 1:
			System.out.println("your balance is "+balance);
			break;
		case 2:
			System.out.println("Deposit the money");
			double depositmoney=scanner.nextDouble();
			if(depositmoney>0) {
			balance=balance+depositmoney;
			System.out.println("You have deposited INR "+depositmoney+"your new balace is "+balance);
			}
			else {
				System.out.println("Enter correct deposit money");
			}
			break;
		case 3:
			System.out.println("Enter the money to withdraw");
			double withdrawal=scanner.nextDouble();
			if(withdrawal>0 && withdrawal<=balance) {
				balance-=withdrawal;
				System.out.println("you have withdrawan INR "+withdrawal+"your new balance is "+balance);
			}
			else if(withdrawal>balance) {
				System.out.println("does not have sufficient balance");
			}
			else {
				System.out.println("Enter valid balance");
			}
			break;
		case 4:
			System.out.println("Thank you for using the ATM. Goodbye!");
			exit=true;
			break;
		default:
			System.out.println("Enter correct choice");
		}
		

	}

}}
