package com.example.solid.lsp;

class ElectricCar implements Car {
    @Override
    public void drive() {
        System.out.println("Conduciendo eléctrico...");
    }

    public void recharge() {
        System.out.println("Recargando batería...");
    }
}
