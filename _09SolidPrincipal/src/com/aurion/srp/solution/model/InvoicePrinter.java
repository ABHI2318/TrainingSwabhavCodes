package com.aurion.srp.solution.model;

public class InvoicePrinter {
 public void printInvoice(Invoice invoice) {
	 TaxCalculator taxCalculator=new TaxCalculator();
	 double taxamount=taxCalculator.calculateTax(invoice);
	 
	 System.out.println("id"+invoice.getId());
	 System.out.println("name"+invoice.getName());
	 System.out.println("Amount "+invoice.getAmount());
	 System.out.println("tax percenatge"+invoice.getTaxPercentage());
	 System.out.println("tax amount"+taxamount);
 }
}
