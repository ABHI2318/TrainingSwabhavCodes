package com.aurion.model;

import com.aurion.model.*;
import com.aurion.exceptions.*;

import java.util.List;
import java.util.Scanner;

public class InventoryService {
    private Inventory inventory;

    public InventoryService() {
        this.inventory = new Inventory();
    }

   
    public void addProduct(Scanner scanner) {
        System.out.println("Choose an option: 1");
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter product name: ");
        String name = scanner.next();
        System.out.print("Enter product description: ");
        String description = scanner.next();
        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        try {
            Product product = new Product(id, name, description, quantity, price);
            inventory.addProduct(product);
            System.out.println("Product added successfully.");
        } catch (DuplicateProductException e) {
            System.out.println(e.getMessage());
        }
    }


    
    public void updateProduct(Scanner scanner) {
        System.out.print("Enter product ID to update: ");
        int id = scanner.nextInt();
        System.out.println("Enter Name to update product details :");
        String name = scanner.next();
        System.out.println("Enter new Product Description: ");
        String description = scanner.next();
        System.out.println("Enter the new Quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Enter updated price:  ");
        double price = scanner.nextDouble();
        
        Product updatedProduct = new Product(id, name, description, quantity, price);
        try {
            inventory.updateProduct(id, updatedProduct);
            System.out.println("Product updated successfully.");
        } catch (InvalidProductIdException e) {
            System.out.println(e.getMessage());
        }
    }

   
    public void deleteProduct(Scanner scanner) {
        System.out.print("Enter product ID to delete: ");
        int id = scanner.nextInt();
        
        try {
            inventory.deleteProduct(id);
            System.out.println("Product deleted successfully.");
        } catch (InvalidProductIdException e) {
            System.out.println(e.getMessage());
        }
    }

   
    public void viewProduct(Scanner scanner) {
        System.out.print("Enter product ID to view: ");
        int id = scanner.nextInt();
        
        try {
            Product product = inventory.viewProduct(id);
            System.out.println("Product Details: " + product);
        } catch (InvalidProductIdException e) {
            System.out.println(e.getMessage());
        }
    }

   
    public void viewAllProducts() {
        System.out.println("All Products:");
        for (Product product : inventory.viewAllProducts()) {
            System.out.println(product);
        }
    }

   
    public void addSupplier(Scanner scanner) {
        System.out.println("Enter supplier details: ");
        System.out.println("enter supplier ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter Supplier Name: ");
        String name = scanner.next();
        System.out.println("Enter Supplier Contact Info: ");
        String contact = scanner.next();
        
        try {
            Supplier supplier = new Supplier(id, name, contact);
            inventory.addSupplier(supplier);
            System.out.println("Supplier added successfully.");
        } catch (DuplicateSupplierException e) {
            System.out.println(e.getMessage());
        }
    }

  
    public void updateSupplier(Scanner scanner) {
        System.out.print("Enter supplier ID to update: ");
        int id = scanner.nextInt();
        System.out.println("Enter updated supplier details: ");
        System.out.println("Enter Supplier Name to Update: ");
        String name = scanner.next();
        System.out.println("Enter Supplier updated ContactInfo");
        String contact = scanner.next();
        
        Supplier updatedSupplier = new Supplier(id, name, contact);
        try {
            inventory.updateSupplier(id, updatedSupplier);
            System.out.println("Supplier updated successfully.");
        } catch (InvalidSupplierIdException e) {
            System.out.println(e.getMessage());
        }
    }

   
    public void deleteSupplier(Scanner scanner) {
        System.out.print("Enter supplier ID to delete: ");
        int id = scanner.nextInt();
        
        try {
            inventory.deleteSupplier(id);
            System.out.println("Supplier deleted successfully.");
        } catch (InvalidSupplierIdException e) {
            System.out.println(e.getMessage());
        }
    }

   
    public void viewSupplierDetails(Scanner scanner) {
        System.out.print("Enter supplier ID to view: ");
        int id = scanner.nextInt();
        
        try {
            Supplier supplier = inventory.viewSupplierDetails(id);
            System.out.println("Supplier Details: " + supplier);
        } catch (InvalidSupplierIdException e) {
            System.out.println(e.getMessage());
        }
    }

  
    public void viewAllSuppliers() {
        System.out.println("All Suppliers:");
        for (Supplier supplier : inventory.viewAllSuppliers()) {
            System.out.println(supplier);
        }
    }


    public void processTransaction(Scanner scanner) {
        System.out.print("Enter product ID for transaction: ");
        int productId = scanner.nextInt();
        System.out.print("Enter transaction type (1 for Add, 0 for Remove): ");
        int typeId = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        
        ITransactionType transactionType = TransactionTypeFactory.getTransactionType(typeId);
        try {
            inventory.processTransaction(productId, transactionType, quantity);
            System.out.println("Transaction processed successfully.");
        } catch (InsufficientStocksException | InvalidProductIdException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void viewTransactionHistory(Scanner scanner) {
        System.out.print("Enter product ID to view transaction history: ");
        int productId = scanner.nextInt();
        try {
            List<Transaction> transactions = inventory.viewTransactionHistory(productId);
            System.out.println("Transaction History for Product ID " + productId + ":");
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        } catch (InvalidProductIdException e) {
            System.out.println(e.getMessage());
        }
    }
    

    
    public void saveData() {
        inventory.saveData();
    }

    
    public void loadData() {
        inventory.loadData();
    }

   
    public void generateReport() {
    	  List<Product> products = inventory.viewAllProducts();
          System.out.println("\n--- Product Report ---");
          System.out.printf("%-10s %-20s %-30s %-10s %-10s%n", "ID", "Name", "Description", "Quantity", "Price");
          System.out.println("---------------------------------------------------------");
          for (Product product : products) {
              System.out.printf("%-10d %-20s %-30s %-10d %-10.2f%n", 
                                product.getProduct_id(), 
                                product.getName(), 
                                product.getDescription(), 
                                product.getQuantity(), 
                                product.getPrice());
        System.out.println("Report generated.");
    }}
}
