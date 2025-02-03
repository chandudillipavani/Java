package com.wipro.java.oops.abstraction;

// Abstract class Car
public abstract class Car {
    // Abstract methods 
    public abstract void fuelType();
    public abstract void carType();

    //  (common behavior)
    public void startEngine() {
        System.out.println("Engine is starting...");
    }

    public void stopEngine() {
        System.out.println("Engine is stopping...");
    }
}
