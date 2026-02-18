package com.example.solid.ocp;

public class VIPDiscount implements DiscountStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.3;
    }
}
