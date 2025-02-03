package com.wipro.java.oops.inheritance;

// parent class
public class Car 
{
	    public void startEngine() {
	        System.out.println("Car engine is starting...");
	    }

	    public void stopEngine() {
	        System.out.println("Car engine is stopping...");
	    }

	    public void fuelType() {
	        System.out.println("Car uses fuel.");
	    }
	    public void color() {
	        System.out.println("Car color is generic.");
	    }
	    public String toString() {
	        return "Car [Type=Generic, Fuel=Unknown]";
	    }
	
	
}
