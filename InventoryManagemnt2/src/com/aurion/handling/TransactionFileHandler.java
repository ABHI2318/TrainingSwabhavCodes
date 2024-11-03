package com.aurion.handling;

import com.aurion.model.Transaction;
import com.aurion.exceptions.FileProcessingException;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class TransactionFileHandler implements IFileHandler<Transaction> {
    private static final String TRANSACTIONS_FILE = "D:\\SWABHAV_TRAINING\\SWABHAV_TRAINING\\COREJAVA\\InventoryManagemnt2\\src\\transactions.txt";

    @Override
    public void save(List<Transaction> transactions) throws FileProcessingException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TRANSACTIONS_FILE,true))) {
            for (Transaction transaction : transactions) {
                writer.write(transaction.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new FileProcessingException("Error saving transactions: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Transaction> load() throws FileProcessingException {
        List<Transaction> transactions = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(TRANSACTIONS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                transactions.add(Transaction.parseTransaction(line));
            }
        } catch (IOException | ParseException e) {
            throw new FileProcessingException("Error loading transactions: " + e.getMessage(), e);
        }
        return transactions;
    }
}