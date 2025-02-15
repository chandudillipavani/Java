package com.wipro.java.buildpattern;
//CarBuilder.java
public class CarBuilder implements Builder {
 private CarType type;
 private int seats;
 private Engine engine;
 private Transmission transmission;
 private boolean hasTripComputer;
 private boolean hasGPS;

 @Override
 public void setCarType(CarType type) {
     this.type = type;
 }

 @Override
 public void setSeats(int seats) {
     this.seats = seats;
 }

 @Override
 public void setEngine(Engine engine) {
     this.engine = engine;
 }

 @Override
 public void setTransmission(Transmission transmission) {
     this.transmission = transmission;
 }

 @Override
 public void setTripComputer(boolean hasTripComputer) {
     this.hasTripComputer = hasTripComputer;
 }

 @Override
 public void setGPSNavigator(boolean hasGPS) {
     this.hasGPS = hasGPS;
 }

 public Car getResult() {
     return new Car(type, seats, engine, transmission, hasTripComputer, hasGPS);
 }
}

