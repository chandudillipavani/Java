package com.wipro.java.oops.abstraction;

// Abstract class Car
public abstract class Car {
    private String brand;
    private int year;

    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Abstract methods 
    public abstract void fuelType();
    public abstract void carType();

    //(common behavior)
    public void startEngine() {
        System.out.println(brand + " engine is starting...");
    }

    public void stopEngine() {
        System.out.println(brand + " engine is stopping...");
    }

    @Override
    public String toString() {
        return "Car [Brand=" + brand + ", Year=" + year + "]";
    }
}
