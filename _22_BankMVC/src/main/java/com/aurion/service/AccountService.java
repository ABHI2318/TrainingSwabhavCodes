package com.aurion.service;

import com.aurion.entity.Account;

public class AccountService {

	public Account createAccount(int accountNumber) {
		Account account = new Account(accountNumber);
		return account;
	}
	public void credit(Account account,double amount) {
		account.setAccountbalance(account.getAccountbalance()+amount);
	}
	
	public void debit(Account account,double amount) {
		account.setAccountbalance(account.getAccountbalance()-amount);
	}
}
