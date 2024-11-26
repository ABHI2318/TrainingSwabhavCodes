package com.aurion.service;


import java.sql.Date;

import com.aurion.entities.Transaction;

public class TransactionService {

	public Transaction transfer(int transaction_id, Date date, String transactionType, double amount, int senderAccountNumber, int receiverAccountNumber) {
		Transaction transaction = new Transaction(transaction_id, date, transactionType, amount, senderAccountNumber, receiverAccountNumber);
		return transaction;
	}
}
