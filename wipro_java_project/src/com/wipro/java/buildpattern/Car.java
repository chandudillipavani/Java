package com.wipro.java.buildpattern;

//Car.java
public class Car {
 private final CarType type;
 private final int seats;
 private final Engine engine;
 private final Transmission transmission;
 private final boolean hasTripComputer;
 private final boolean hasGPS;

 public Car(CarType type, int seats, Engine engine, Transmission transmission, boolean hasTripComputer, boolean hasGPS) {
     this.type = type;
     this.seats = seats;
     this.engine = engine;
     this.transmission = transmission;
     this.hasTripComputer = hasTripComputer;
     this.hasGPS = hasGPS;
 }

 public void showDetails() {
     System.out.println("Car built:\n" + type);
 }
}
