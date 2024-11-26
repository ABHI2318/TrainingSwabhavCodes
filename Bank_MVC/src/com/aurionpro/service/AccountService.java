package com.aurionpro.service;

import com.aurionpro.entiites.Account;

public class AccountService 
{
	
	public Account createAccount(int accountNumber) {
		Account account = new Account(accountNumber);
		return account;
		
	}
	
	public void credit(Account account, double amount)
	{
		
		account.setAccountBalance(account.getAccountBalance()+amount);
		
	}
	
	public void debit(Account account, double amount)
	{
		account.setAccountBalance(account.getAccountBalance()-amount);
	}
}
