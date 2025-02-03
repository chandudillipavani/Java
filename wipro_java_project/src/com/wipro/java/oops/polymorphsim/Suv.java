package com.wipro.java.oops.polymorphsim;

import com.wipro.java.oops.inheritance.Car;

// Child class SUV extending Car
public class Suv extends Car {
	
    public String toString() {
        return "SUV [Type=Off-road, Fuel=Diesel, Color=Matte Black]";
    }

    public static void main(String[] args) {
        Car myCar = new Suv(); // Polymorphism
        myCar.color();
        myCar.startEngine();
        myCar.fuelType();
        myCar.stopEngine();

        // Display toString()
        System.out.println(myCar.toString());
    }
}
