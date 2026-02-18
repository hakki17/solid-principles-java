package com.example.solid.lsp;

public class GasCar implements Car{
    @Override
    public void drive() {
        System.out.println("Conduciendo auto de gasolina...");
    }
    
    public void refuel() {
        System.out.println("Repostando gasolina...");
    }
}
