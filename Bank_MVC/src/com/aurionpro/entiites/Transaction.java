package com.aurionpro.entiites;

import java.util.Date;

public class Transaction 
{
	private int transactionId;
	private Date date;
	private String transactionType;
	private double amount;
	private int senderAccountNUmber;
	private int receiverAccountNumber;
	
	public Transaction(int transactionId, Date date, String transactionType, double amount) {
		super();
		this.transactionId = transactionId;
		this.date = date;
		this.transactionType = transactionType;
		this.amount = amount;
	}
	public Transaction(int transactionId, Date date, String transactionType, double amount, int senderAccountNumber, int receiverAccountNumber) {
		super();
		this.transactionId = transactionId;
		this.date = date;
		this.transactionType = transactionType;
		this.amount = amount;
		this.senderAccountNUmber = senderAccountNumber;
		this .receiverAccountNumber= receiverAccountNumber;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getSenderAccountNUmber() {
		return senderAccountNUmber;
	}
	public void setSenderAccountNUmber(int senderAccountNUmber) {
		this.senderAccountNUmber = senderAccountNUmber;
	}
	public int getReceiverAccountNumber() {
		return receiverAccountNumber;
	}
	public void setReceiverAccountNumber(int receiverAccountNumber) {
		this.receiverAccountNumber = receiverAccountNumber;
	}

	
}
