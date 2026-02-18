package com.example.solid.dip;

public class PostgreSQLDatabase implements Database {
    @Override
    public void saveOrder() {
        System.out.println("Guardando pedido en PostgreSQL...");
    }
}
