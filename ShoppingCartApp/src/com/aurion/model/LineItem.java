package com.aurion.model;

public class LineItem {
    private int lineitemId;
    private int quantity;
    private Product product;

    public LineItem(int lineId, int quantity, Product product) {
        this.lineitemId = lineId;
        this.quantity = quantity;
        this.product = product;
    }

    public int getLineId() {
        return lineitemId;
    }

    public void setLineId(int lineId) {
        this.lineitemId = lineId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double calculateLineItemTotal() {
        return product.getUnitPrice() * quantity;
    }

    @Override
    public String toString() {
        return "LineItem ID: " + lineitemId + ", Quantity: " + quantity + ", Product: " + product.getProductName() + ", Total: " + calculateLineItemTotal();
    }
}
