package com.example.solid.ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.example.solid.ocp.DiscountCalculator;
import com.example.solid.ocp.RegularDiscount;
import com.example.solid.ocp.VIPDiscount;

public class DiscountTest {
    
    @Test
    public void testRegularDiscount() {
        DiscountCalculator calc = new DiscountCalculator(new RegularDiscount());
        assertEquals(100.0, calc.calculateDiscount(1000.0), 0.01);
    }
    
    @Test
    public void testVIPDiscount() {
        DiscountCalculator calc = new DiscountCalculator(new VIPDiscount());
        assertEquals(300.0, calc.calculateDiscount(1000.0), 0.01);
    }
    
    @Test
    public void testDifferentAmounts() {
        DiscountCalculator regularCalc = new DiscountCalculator(new RegularDiscount());
        assertEquals(50.0, regularCalc.calculateDiscount(500.0), 0.01);
        
        DiscountCalculator vipCalc = new DiscountCalculator(new VIPDiscount());
        assertEquals(150.0, vipCalc.calculateDiscount(500.0), 0.01);
    }
}
