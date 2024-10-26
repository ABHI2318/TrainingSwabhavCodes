package com.aurion.srp.violation.test;

import java.util.Scanner;

import com.aurion.srp.violation.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
	
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter invoice id");
		int id =scanner.nextInt();
		System.out.println("Enter the name: ");
		String name=scanner.next();
		System.out.println("enter the amount ");
		double amount=scanner.nextDouble();
		System.out.println("enter the percenatage of tax: ");
		double taxpercentage=scanner.nextDouble();
		Invoice invoice=new Invoice(id,name,amount,taxpercentage);
		invoice.calculateTax();
		System.out.println(invoice);

	}

}
