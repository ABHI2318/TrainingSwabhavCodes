package com.aurion.srp.solution.model;
import com.aurion.srp.solution.model.Invoice;

public class TaxCalculator {
  public  double calculateTax(Invoice invoice) {
		return invoice.getAmount()*(invoice.getTaxPercentage()/100);
    	
    }
}
