package com.aurion.transactions.test;

import com.aurion.transactions.model.transactionDB;

public class TransactionTest {
    public static void main(String[] args) {
        
        transactionDB transactionDB = new transactionDB();

       
        transactionDB.connect();

      
        transactionDB.performTransaction();

       
       
    }
}
