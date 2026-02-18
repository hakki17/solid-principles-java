package com.example.solid.ocp;

public class DiscountCalculator {
    private DiscountStrategy discount;
    
    public DiscountCalculator(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    public double calculateDiscount(double amount) {
        return discount.calculate(amount);
    }
}