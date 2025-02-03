package com.wipro.java.oops.abstraction;

// BMW class extending abstract Car class
public class Bnw extends Car {
    public Bnw(int year) {
        super("BMW", year);
    }

    @Override
    public void fuelType() {
        System.out.println("BMW runs on petrol.");
    }

    @Override
    public void carType() {
        System.out.println("BMW is a luxury sports car.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Type=Luxury Sports, Fuel=Petrol";
    }

    public static void main(String[] args) {
        Car myCar = new Bnw(2023);
        myCar.startEngine();
        myCar.carType();
        myCar.fuelType();
        myCar.stopEngine();

        // Display toString()
        System.out.println(myCar.toString());
    }
}
