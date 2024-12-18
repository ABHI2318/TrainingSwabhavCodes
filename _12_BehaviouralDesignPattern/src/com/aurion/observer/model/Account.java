package com.aurion.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account  {
	private int accountno;
	private String name;
	private double balance;
    private double amount;
	private String message;
	
	private List<INotifier> notifier;
	public Account(int accountno, String name, double balance) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.balance = balance;
	
		this.notifier=new ArrayList<>();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
  public void credit(double amount) {
	  this.amount=amount;
	  setBalance(getBalance()+amount);
	 
	  setMessage("money is credited:  ");
  }
  
  public void debit(double amount) {
	  this.amount=amount;
	 if(getBalance()>amount) {
		 setBalance(getBalance()-amount);
		 setMessage("money is debited: ");
		 return;
	 }
	 setMessage("Insufficient balance cannot debit " );
	 
	 
  }
  public void display() {
	  for(INotifier notify: notifier) {
		  notify.getNotification(this, amount, message);
	  }
  }
  public void addNotifier(INotifier notify) {
	  notifier.add(notify);
  }
}
