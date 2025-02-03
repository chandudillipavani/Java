package com.wipro.java.oops.abstraction;

// RollsRoyce class extending abstract Car class
public class RollsRoyce extends Car {
    public RollsRoyce(int year) {
        super("Rolls Royce", year);
    }

    @Override
    public void fuelType() {
        System.out.println("Rolls Royce runs on premium petrol.");
    }

    @Override
    public void carType() {
        System.out.println("Rolls Royce is an ultra-luxury car.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Type=Ultra Luxury, Fuel=Premium Petrol";
    }

    public static void main(String[] args) {
        Car myCar = new RollsRoyce(2022);
        myCar.startEngine();
        myCar.carType();
        myCar.fuelType();
        myCar.stopEngine();

        // Display toString()
        System.out.println(myCar.toString());
    }
}
