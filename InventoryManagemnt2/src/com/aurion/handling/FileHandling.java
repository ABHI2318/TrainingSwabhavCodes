package com.aurion.handling;

import com.aurion.model.Product;
import com.aurion.model.Supplier;
import com.aurion.model.Transaction;
import com.aurion.exceptions.FileProcessingException;

import java.util.List;
import java.util.Map;

public class FileHandling {
    private ProductFileHandler productFileHandler = new ProductFileHandler();
    private SupplierFileHandler supplierFileHandler = new SupplierFileHandler();
    private TransactionFileHandler transactionFileHandler = new TransactionFileHandler();

    public void saveData(List<Product> products, List<Supplier> suppliers, List<Transaction> transactions) {
        try {
            productFileHandler.save(products);
            supplierFileHandler.save(suppliers);
            transactionFileHandler.save(transactions);
            System.out.println("Data saved successfully.");
        } catch (FileProcessingException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public void loadData(List<Product> products, List<Supplier> suppliers, List<Transaction> transactions) {
        try {
            products.clear();
            suppliers.clear();
            transactions.clear();

            products.addAll(productFileHandler.load());
            suppliers.addAll(supplierFileHandler.load());
            transactions.addAll(transactionFileHandler.load());

            System.out.println("Data loaded successfully.");
        } catch (FileProcessingException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

	public Map<String, Product> loadProducts() {
		// TODO Auto-generated method stub
		return null;
	}
}