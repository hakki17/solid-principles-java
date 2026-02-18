package com.example.solid.isp;

public class OfficeWorker implements Workable, Eatable{
    @Override
    public void eat() {
        System.out.println("Comiendo...");
    }

    @Override
    public void work() {
        System.out.println("Escribiendo código...");
    }
}
