package com.aurion.di.violation.test;

import com.aurion.di.violation.model.DBLocker;
import com.aurion.di.violation.model.TaxCalculator;

public class Test {

	public static void main(String[] args) {
		DBLocker dblooger=new DBLocker();
		TaxCalculator taxcal=new TaxCalculator(dblooger);
		taxcal.calculateTax(23, 2);
		System.out.println(taxcal);
		
		
	}

}
