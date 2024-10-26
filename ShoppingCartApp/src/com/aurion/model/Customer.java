package com.aurion.model;

import java.util.ArrayList;
import java.util.List;

import com.aurion.Exceptions.InvalidMobileNumberException; 

public class Customer {
    private int customerId;  
    private String customerName;
    private String mobileNumber;
    private List<Order> orders;

    public Customer(int customerId, String customerName, String mobileNumber) throws InvalidMobileNumberException {
        if (mobileNumber.length() != 10 || !mobileNumber.matches("\\d+")) {
            throw new InvalidMobileNumberException("Invalid mobile number");
        }
        this.customerId = customerId;  
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public int getCustomerId() {  
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + customerName + ", Mobile: " + mobileNumber;
    }
}
