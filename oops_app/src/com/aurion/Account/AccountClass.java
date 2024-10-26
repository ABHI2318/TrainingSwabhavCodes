package com.aurion.Account;

public class AccountClass {

	   private int accountnumber;
	   private String name;
	   private double balance;
	   private static final double minbalance=500.0;
	   
	   
	   public  AccountClass(int accountnumber,String name,double balance) {
		   
	   }
	   public void setAccountNumber(int accountnumber) {
		   this.accountnumber=accountnumber;
	   }
	   
	   public int getAccountNumber() {
		   return accountnumber;
	   }
	    public void setName(String name) {
	    	this.name=name;
	    }
	    
	    public String getName() {
	    	return name;  
	    }
	    
	    public void setBalance(double balance) {
	    	this.balance=balance;
	    }
	    
	    public double getBalance() {
	    	return balance;
	    }
	   
	    public void deposit(double amount) {
	    	if(amount>0) {
	    		balance+=amount;
	    	System.out.println("amount deposit sucess");
	    	}
	    	else {
	    		System.out.println("enter valid amount");
	    	}
	    }
	    
	    public void withdrawal(double amount) {
	    	if(amount>0 && (balance-amount)>=minbalance) {
	    		balance-=amount;
	    		System.out.println("Amount withdraw successful");
	    	}
	    	else {
	    		System.out.println("invalid withdraw or limit exceeds");
	    	}
	    }
	    
	    public void showBalance(){
	    	System.out.println("Current balance is "+balance);
	    }
	   
	   
			
		}
	
