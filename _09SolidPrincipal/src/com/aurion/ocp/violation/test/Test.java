package com.aurion.ocp.violation.test;

import java.util.Scanner;

import com.aurion.ocp.violation.model.FixedDeposit;

public class Test {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter account number: ");
	int accountnumber=scanner.nextInt();
	
	System.out.println("enter name:  ");
	String name=scanner.next();
	scanner.nextLine();
	System.out.println("enter principla amount ");
	double principalamount=scanner.nextDouble();
	System.out.println(" enter the festival offer: ");
	System.out.println(" 1.Diwali 2.Holi 3.Christmas 4.Newyear");
	String offer=scanner.next();
	scanner.nextLine();
	System.out.println("enter the duration ");
	int duration=scanner.nextInt();
	FixedDeposit fixeddeposit=new FixedDeposit(accountnumber,name,principalamount,duration, offer);
	fixeddeposit.calculateInterest();
	System.out.println( fixeddeposit);
	
	}

}
