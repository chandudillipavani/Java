package com.wipro.java.oops.abstraction;

// RollsRoyce class extending the abstract Car class
public class RollsRoyce extends Car {
    @Override
    public void fuelType() {
        System.out.println("Rolls Royce runs on premium petrol.");
    }

    @Override
    public void carType() {
        System.out.println("Rolls Royce is an ultra-luxury car.");
    }

    public static void main(String[] args) {
        Car myCar = new RollsRoyce();
        myCar.startEngine();
        myCar.carType();
        myCar.fuelType();
        myCar.stopEngine();
    }
}
