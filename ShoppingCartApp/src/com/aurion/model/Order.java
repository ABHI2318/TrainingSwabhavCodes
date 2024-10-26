package com.aurion.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderId;
    private List<LineItem> lineItems;
    private double totalOrder;
    private Date dateOfOrder;

    public Order(int orderId) {
        this.orderId = orderId;
        this.lineItems = new ArrayList<>();
        this.dateOfOrder = new Date(); 
    }

    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
        calculateTotalOrder();
    }

    public void removeLineItem(LineItem lineItem) {
        lineItems.remove(lineItem);
        calculateTotalOrder();
    }

    public void calculateTotalOrder() {
        totalOrder = 0;
        for (LineItem item : lineItems) {
            totalOrder += item.calculateLineItemTotal();
        }
    }

    public double getTotalOrder() {
        return totalOrder;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Total Order: " + totalOrder + ", Date: " + dateOfOrder;
    }
}
