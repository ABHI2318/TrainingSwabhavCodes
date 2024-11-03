package com.aurion.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.aurion.exceptions.DuplicateProductException;
import com.aurion.exceptions.DuplicateSupplierException;
import com.aurion.exceptions.InsufficientStocksException;
import com.aurion.exceptions.InvalidProductIdException;
import com.aurion.exceptions.InvalidSupplierIdException;
import com.aurion.handling.FileHandling;

public class Inventory {
    private Map<String, Product> products;
    private Map<String, Supplier> suppliers;
    private List<Transaction> transactions;
    private Random random;

    public Inventory() {
        products = new HashMap<>();
        suppliers = new HashMap<>();
        transactions = new ArrayList<>();
        random = new Random();
    }

    // Product Management
    public void addProduct(Product product) throws DuplicateProductException {
        if (products.containsKey(String.valueOf(product.getProduct_id()))) {
            throw new DuplicateProductException("Product ID " + product.getProduct_id() + " already exists.");
        }
        products.put(String.valueOf(product.getProduct_id()), product);
    }

    public void updateProduct(int product_id, Product updateProduct) throws InvalidProductIdException {
        if (!products.containsKey(String.valueOf(product_id))) {
            throw new InvalidProductIdException("Product ID " + product_id + " does not exist.");
        }
        products.put(String.valueOf(product_id), updateProduct);
    }

    public void deleteProduct(int product_id) throws InvalidProductIdException {
        if (!products.containsKey(String.valueOf(product_id))) {
            throw new InvalidProductIdException("Product ID " + product_id + " does not exist.");
        }
        products.remove(String.valueOf(product_id));
    }

    public Product viewProduct(int product_id) throws InvalidProductIdException {
        Product product = products.get(String.valueOf(product_id));
        if (product == null) {
            throw new InvalidProductIdException("Product ID " + product_id + " does not exist.");
        }
        return product;
    }

    public List<Product> viewAllProducts() {
        return new ArrayList<>(products.values());
    }

    // Supplier Management
    public void addSupplier(Supplier supplier) throws DuplicateSupplierException {
        if (suppliers.containsKey(String.valueOf(supplier.getSupplier_id()))) {
            throw new DuplicateSupplierException("Supplier ID " + supplier.getSupplier_id() + " already exists.");
        }
        suppliers.put(String.valueOf(supplier.getSupplier_id()), supplier);
    }

    public void updateSupplier(int supplier_id, Supplier updateSupplier) throws InvalidSupplierIdException {
        if (!suppliers.containsKey(String.valueOf(supplier_id))) {
            throw new InvalidSupplierIdException("Supplier ID " + supplier_id + " does not exist.");
        }
        suppliers.put(String.valueOf(supplier_id), updateSupplier);
    }

    public void deleteSupplier(int supplier_id) throws InvalidSupplierIdException {
        if (!suppliers.containsKey(String.valueOf(supplier_id))) {
            throw new InvalidSupplierIdException("Supplier ID " + supplier_id + " does not exist.");
        }
        suppliers.remove(String.valueOf(supplier_id));
    }

    public Supplier viewSupplierDetails(int supplier_id) throws InvalidSupplierIdException {
        Supplier supplier = suppliers.get(String.valueOf(supplier_id));
        if (supplier == null) {
            throw new InvalidSupplierIdException("Supplier ID " + supplier_id + " does not exist.");
        }
        return supplier;
    }

    public List<Supplier> viewAllSuppliers() {
        return new ArrayList<>(suppliers.values());
    }

    // Transaction Management
    public void processTransaction(int product_id, ITransactionType transactionType, int quantity)
            throws InsufficientStocksException, InvalidProductIdException {
        Product product = products.get(String.valueOf(product_id));
        if (product == null) {
            throw new InvalidProductIdException("Product ID " + product_id + " does not exist.");
        }

        // Apply transaction type logic
        transactionType.applytranscation(product, quantity);

        // Record transaction
        int transaction_id = generateUniqueTransactionId();
        Transaction transaction = new Transaction(transaction_id, product_id, transactionType, quantity, new Date());
        transactions.add(transaction);
    }

    // Generate unique transaction IDs with random generator
    private int generateUniqueTransactionId() {
        int id;
        do {
            id = random.nextInt(10000); // Generates a random ID in the range 0-9999
        } while (isTransactionIdUsed(id)); // Check uniqueness
        return id;
    }

    // Check if transaction ID is already used
    private boolean isTransactionIdUsed(int id) {
        return transactions.stream().anyMatch(t -> t.getTransaction_id() == id);
    }
    
    //Add this method in the Inventory class to view all transactions related to a specific product by product_id.
    public List<Transaction> viewTransactionHistory(int product_id) throws InvalidProductIdException {
        if (!products.containsKey(String.valueOf(product_id))) {
            throw new InvalidProductIdException("Product ID " + product_id + " does not exist.");
        }
        
        List<Transaction> productTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getProduct_id() == product_id) {
                productTransactions.add(transaction);
            }
        }
        
        return productTransactions;
    }
    
    public void saveData() {
    	FileHandling.saveData(products, suppliers, transactions);
    }
    
    public void loadData() {
    	FileHandling.loadData(products, suppliers, transactions);
    }
    
    // Accessor methods for FileHandling
    public Map<String, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    public Map<String, Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Map<String, Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}
