package com.wipro.java.buildpattern;

//CarManualBuilder.java
public class CarManualBuilder implements Builder {
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

 public CarManual getResult() {
     return new CarManual(type, seats, engine, transmission, hasTripComputer, hasGPS);
 }
}
