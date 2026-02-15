package com.example.solid.srp;

public class InvoicePrinter{

    private InvoiceCalculator calculator = new InvoiceCalculator();

    public void print(Invoice invoice){
        System.out.println("Factura para: " + invoice.getCustomer());
        System.out.println("Total: " + calculator.calculate(invoice.getAmount()));
    }
}