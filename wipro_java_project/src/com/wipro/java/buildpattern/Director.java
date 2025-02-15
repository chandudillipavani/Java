package com.wipro.java.buildpattern;

//Director.java
public class Director {
 public void constructSportsCar(Builder builder) {
     builder.setCarType(CarType.SPORTS_CAR);
     builder.setSeats(2);
     builder.setEngine(new Engine(3.0, 0.0));
     builder.setTransmission(Transmission.SEMI_AUTOMATIC);
     builder.setTripComputer(true);
     builder.setGPSNavigator(true);
 }
}

