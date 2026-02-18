package com.example.solid.srp;

public class Invoice {
    private Customer customer;
    private double amount;

    public Invoice(Customer customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public String getCustomer() {
        return customer.getName();
    }

    public double getAmount() {
        return amount;
    }
}