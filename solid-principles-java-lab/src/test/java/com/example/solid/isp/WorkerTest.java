package com.example.solid.isp;

import org.junit.jupiter.api.Test;

public class WorkerTest {
    @Test
    public void testDeveloper() {
        Developer dev = new Developer();
        dev.work();
    }
    
    @Test
    public void testOfficeWorker() {
        OfficeWorker worker = new OfficeWorker();
        worker.work();
        worker.eat();
    }
}
