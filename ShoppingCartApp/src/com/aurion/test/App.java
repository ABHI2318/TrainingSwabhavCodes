package com.aurion.test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.aurion.model.Customer;
import com.aurion.model.LineItem;
import com.aurion.model.Order;
import com.aurion.model.Product;
import com.aurion.Exceptions.InvalidMobileNumberException;
import com.aurion.Exceptions.InvalidUnitPriceException;
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productCart = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();

        int customerIdCounter = 1;
        int productIdCounter = 1;
        int orderIdCounter = 1;
        int lineItemIdCounter = 1;

        while (true) {
            System.out.println("\n==== Shopping Cart Application ====");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. Add Customer");
            System.out.println("3. Place an Order");
            System.out.println("4. View Order Summary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Product Name: ");
                        String productName = scanner.nextLine();
                        System.out.print("Enter Unit Price: ");
                        double unitPrice = scanner.nextDouble();
                        scanner.nextLine(); 
                        
                       
                        Product product = new Product(productIdCounter++, productName, unitPrice);
                        productCart.add(product);
                        System.out.println("Product added to cart: " + product);
                        
                    } catch (InvalidUnitPriceException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a valid number for the unit price.");
                        scanner.nextLine(); 
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Enter Customer Name: ");
                        String customerName = scanner.nextLine();
                        System.out.print("Enter Mobile Number: ");
                        String mobileNumber = scanner.nextLine();
                        
                        Customer customer = new Customer(customerIdCounter++, customerName, mobileNumber);
                        customers.add(customer);
                        System.out.println("Customer added: " + customer);
                    } catch (InvalidMobileNumberException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    if (customers.isEmpty()) {
                        System.out.println("No customers available. Add a customer first.");
                        break;
                    }

                    System.out.println("Select a customer by ID:");
                    for (Customer cust : customers) {
                        System.out.println(cust.getCustomerId() + ". " + cust.getCustomerName());
                    }
                    System.out.print("Enter Customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine();

                    Customer selectedCustomer = customers.stream()
                            .filter(c -> c.getCustomerId() == customerId)
                            .findFirst()
                            .orElse(null);

                    if (selectedCustomer == null) {
                        System.out.println("Invalid Customer ID.");
                        break;
                    }

                    Order order = new Order(orderIdCounter++);
                    while (true) {
                        System.out.println("\nSelect a product from the cart by ID:");
                        for (Product prod : productCart) {
                            System.out.println(prod.getProductId() + ". " + prod.getProductName() + " - INR " + prod.getUnitPrice());
                        }
                        System.out.print("Enter Product ID (or -1 to finish): ");
                        int productId = scanner.nextInt();
                        scanner.nextLine(); 

                        if (productId == -1) {
                            break;
                        }

						Product selectedProduct = productCart.stream()
                                .filter(p -> p.getProductId() == productId)
                                .findFirst()
                                .orElse(null);

                        if (selectedProduct == null) {
                            System.out.println("Invalid Product ID.");
                            continue;
                        }

                        System.out.print("Enter Quantity: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();

                        LineItem lineItem = new LineItem(lineItemIdCounter++, quantity, selectedProduct);
                        order.addLineItem(lineItem);
                        System.out.println("Added to order: " + lineItem);
                    }

                    selectedCustomer.addOrder(order);
                    System.out.println("Order placed successfully for " + selectedCustomer.getCustomerName() + ". Total: INR" + order.getTotalOrder());
                    break;

                case 4:
                    System.out.println("Customer Orders:");
                    for (Customer cust : customers) {
                        System.out.println(cust);
                        for (Order ord : cust.getOrders()) {
                            System.out.println("\t" + ord);
                            for (LineItem item : ord.getLineItems()) {
                                System.out.println("\t\t" + item);
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting application.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
