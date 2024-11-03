package com.aurion.model;

public class Product {
 //product ID, name, description, quantity, and price
	private int Product_id;
	private String name;
	private String description;
	private int quantity;
	private double price;
	public Product(int product_id, String name, String description,int quantity, double price) {
		super();
		Product_id = product_id;
		this.name = name;
		this.description = description;
		this.quantity=quantity;
		this.price = price;
	}
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	@Override
	public String toString() {
		return "Product [Product_id=" + Product_id + ", name=" + name + ", description=" + description + ", quantity="
				+ quantity + ", price=" + price + "]";
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
	public void setPrice(double price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
		
	}
	 public int getQuantity() {
		 return quantity;
    }
	 public static Product parseProduct(String line) {
		    String[] parts = line.split(",");
		    if (parts.length != 5) {
		        throw new IllegalArgumentException("Invalid product data: " + line);
		    }
		    int id = Integer.parseInt(parts[0]); // Ensure parts[0] is a valid integer string
		    String name = parts[1];
		    String description = parts[2];
		    int quantity = Integer.parseInt(parts[3]);
		    double price = Double.parseDouble(parts[4]);
		    return new Product(id, name, description, quantity, price);
		}

	
}
