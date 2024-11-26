package com.aurion.entity;

import java.sql.Date;


public class Transaction {
    private int transactionId;
    private Date transactionDate;
    private String transactionType;
    private double amount;
    private int senderAccountNUmber;
    private int receiverAccountNumber;

    public Transaction(int transactionId, Date transactionDate, String transactionType, double amount, int senderAccountNUmber, int receiverAccountNumber) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.amount = amount;
        this.senderAccountNUmber = senderAccountNUmber;
        this.receiverAccountNumber = receiverAccountNumber;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Date getDate() {
        return transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public int getSenderAccountNUmber() {
        return senderAccountNUmber;
    }

    public int getReceiverAccountNumber() {
        return receiverAccountNumber;
    }
}
