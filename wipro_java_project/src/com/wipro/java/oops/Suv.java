package com.wipro.java.oops;

public class Suv extends Car
{
	public static void main(String[] args) 
	{
        Car myCar = new Suv(); // Polymorphism
        myCar.color();
        myCar.startEngine();
        myCar.fuelType(); // Calls overridden method in SUV
        myCar.stopEngine();
}
}
