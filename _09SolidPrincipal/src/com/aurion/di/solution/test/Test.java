package com.aurion.di.solution.test;
import com.aurion.di.solution.model.Filelogger;
import com.aurion.di.solution.model.DBlogger;
import com.aurion.di.solution.model.TaxCalculator;

public class Test {
	 public static void main(String[] args) {
	    DBlogger logger = new DBlogger();
	  TaxCalculator calculate = new TaxCalculator(1000,0,logger);  
	    Filelogger file=new Filelogger();
	    TaxCalculator calculate2 = new TaxCalculator(1000,0,file);  
	    calculate.taxcalculate();
	    calculate2.taxcalculate();
	    System.out.println(calculate);
	    System.out.println(calculate2 );
	 
	 }
	}