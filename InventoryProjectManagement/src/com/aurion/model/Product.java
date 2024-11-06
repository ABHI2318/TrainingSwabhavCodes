package com.aurion.model;

public class Product {

    private int Product_id;
    private String name;
    private String description;
    private int quantity;
    private double price;         
    private double pricePerUnit;  

    public Product(int product_id, String name, String description, int quantity, double pricePerUnit) {
        this.Product_id = product_id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.price = quantity * pricePerUnit;
    }

    public int getProduct_id() {
        return Product_id;
    }

    public void setProduct_id(int product_id) {
        Product_id = product_id;
    }

    @Override
    public String toString() {
        return "Product [Product_id=" + Product_id + ", name=" + name + ", description=" + description 
                + ", quantity=" + quantity + ", price=" + price + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

  
    public void updateTotalPrice() {
        this.price = this.quantity * this.pricePerUnit;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
        updateTotalPrice();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        updateTotalPrice(); 
    }

    public static Product parseProduct(String line) {
        String[] parts = line.split(",");
        if (parts.length != 5) {
            throw new IllegalArgumentException("Invalid product data: " + line);
        }
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        String description = parts[2];
        int quantity = Integer.parseInt(parts[3]);
        double pricePerUnit = Double.parseDouble(parts[4]);
        return new Product(id, name, description, quantity, pricePerUnit);
    }
}
