package com.aurion.srp.solution.test;

import java.util.Scanner;

import com.aurion.srp.solution.model.Invoice;
import com.aurion.srp.solution.model.InvoicePrinter;


public class TestTAX {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter Invoice ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.print("Enter Customer Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Amount: ");
	        double amount = scanner.nextDouble();

	        System.out.print("Enter Tax Percentage: ");
	        double taxPercentage = scanner.nextDouble();
	        
	        Invoice invoice=new Invoice(id, name, amount, taxPercentage);
	        InvoicePrinter print=new InvoicePrinter();
	        print.printInvoice(invoice);


	}

}
