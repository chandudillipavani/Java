package com.wipro.java.oops.polymorphsim;

import com.wipro.java.oops.inheritance.Car;

// Child class Sedan extending Car
public class Sedan extends Car 
{
	
    public String toString() {
        return "Sedan [Type=Luxury, Fuel=Petrol, Color=Metallic Blue]";
    }

    public static void main(String[] args) {
        Car myCar = new Sedan(); // Polymorphism
        myCar.color();
        myCar.startEngine();
        myCar.fuelType();
        myCar.stopEngine();

        // Display toString()
        System.out.println(myCar.toString());
    }
}
