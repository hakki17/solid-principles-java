package com.example.solid.lsp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testGasCarDrive() {
        Car car = new GasCar();
        // No debe lanzar excepción
        assertDoesNotThrow(() -> car.drive());
    }
    
    @Test
    public void testElectricCarDrive() {
        Car car = new ElectricCar();
        // No debe lanzar excepción
        assertDoesNotThrow(() -> car.drive());
    }
    
    @Test
    public void testGasCarRefuel() {
        GasCar gasCar = new GasCar();
        assertDoesNotThrow(() -> gasCar.refuel());
    }
    
    @Test
    public void testElectricCarRecharge() {
        ElectricCar electricCar = new ElectricCar();
        assertDoesNotThrow(() -> electricCar.recharge());
    }
    
    @Test
    public void testLSP() {
        Car car1 = new GasCar();
        Car car2 = new ElectricCar();
        
        car1.drive();
        car2.drive();
    }

}
