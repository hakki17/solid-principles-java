package com.example.solid.srp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {

    @Test
    public void testInvoiceCalculator(){
        InvoiceCalculator calc = new InvoiceCalculator();
        assertEquals(121, calc.calculate(100));
    }

    @Test
    public void testCustomer() {
        Customer c = new Customer("Test");
        assertEquals("Test", c.getName());
    }
}