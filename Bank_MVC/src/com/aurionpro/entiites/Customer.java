package com.aurionpro.entiites;

import java.util.ArrayList;
import java.util.List;

public class Customer 
{
	private int customerId;
	private String firstName;
	private String lastName;
	private String  email;
	private String password;
	
	
	public Customer(int customerId, String firstName, String lastName, String email, String password) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private List<Account> accounts = new ArrayList<>();


	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Account account) {
		 accounts.add(account);
	}

}