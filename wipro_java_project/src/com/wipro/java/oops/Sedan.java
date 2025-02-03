package com.wipro.java.oops;

public class Sedan  extends Car
{
	public static void main(String[] args) 
	{
		Car myCar= new Sedan();// Polymorphism
        myCar.color(); 
		myCar.startEngine();
        myCar.fuelType(); // Calls overridden method in Sedan
        myCar.stopEngine();
		
	}

}
