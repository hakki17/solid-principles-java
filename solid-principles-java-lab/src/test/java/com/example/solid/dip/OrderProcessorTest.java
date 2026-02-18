package com.example.solid.dip;

import org.junit.jupiter.api.Test;

public class OrderProcessorTest {
    @Test
    public void testWithMySQL() {
        Database db = new MySQLDatabase();
        OrderProcessor processor = new OrderProcessor(db);
        processor.processOrder();
    }
    
    @Test
    public void testWithPostgreSQL() {
        Database db = new PostgreSQLDatabase();
        OrderProcessor processor = new OrderProcessor(db);
        processor.processOrder();
    }
}
