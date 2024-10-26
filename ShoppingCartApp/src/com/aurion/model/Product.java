package com.aurion.model;

import com.aurion.Exceptions.InvalidUnitPriceException;

public class Product {
    private int productId;
    private String productName;
    private double unitPrice;

   
    public Product(int productId, String productName, double unitPrice) throws InvalidUnitPriceException {
        if (unitPrice < 0) {
            throw new InvalidUnitPriceException("Unit price cannot be negative.");
        }
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) throws InvalidUnitPriceException {
        if (unitPrice < 0) {
            throw new InvalidUnitPriceException("Unit price cannot be negative.");
        }
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Price: INR " + unitPrice;
    }
}
