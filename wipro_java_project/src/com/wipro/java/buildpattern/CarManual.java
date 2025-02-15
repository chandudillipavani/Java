package com.wipro.java.buildpattern;

//CarManual.java
public class CarManual {
 private final CarType type;
 private final int seats;
 private final Engine engine;
 private final Transmission transmission;
 private final boolean hasTripComputer;
 private final boolean hasGPS;

 public CarManual(CarType type, int seats, Engine engine, Transmission transmission, boolean hasTripComputer, boolean hasGPS) {
     this.type = type;
     this.seats = seats;
     this.engine = engine;
     this.transmission = transmission;
     this.hasTripComputer = hasTripComputer;
     this.hasGPS = hasGPS;
 }

 public void printManual() {
     System.out.println("\nCar manual built:");
     System.out.println("Type of car: " + type);
     System.out.println("Count of seats: " + seats);
     System.out.println("Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage());
     System.out.println("Transmission: " + transmission);
     System.out.println("Trip Computer: " + (hasTripComputer ? "Functional" : "Not available"));
     System.out.println("GPS Navigator: " + (hasGPS ? "Functional" : "Not available"));
 }
}
