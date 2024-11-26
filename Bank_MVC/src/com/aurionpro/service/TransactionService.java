package com.aurionpro.service;

import java.util.Date;

import com.aurionpro.entiites.RandomNumberGenerator;
import com.aurionpro.entiites.Transaction;

public class TransactionService 
{
	public Transaction transfer(int transactionId, Date date, String transactionType, double amount, int senderAccountNumber, int receiverAccountNumber)
	{
		Transaction transaction = new Transaction(RandomNumberGenerator.generateRandomNumber(), date, transactionType, amount, senderAccountNumber, receiverAccountNumber);
		return transaction;
	}

}
