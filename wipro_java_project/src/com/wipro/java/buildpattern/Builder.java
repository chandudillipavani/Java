package com.wipro.java.buildpattern;

//Builder.java
public interface Builder {
 void setCarType(CarType type);
 void setSeats(int seats);
 void setEngine(Engine engine);
 void setTransmission(Transmission transmission);
 void setTripComputer(boolean hasTripComputer);
 void setGPSNavigator(boolean hasGPS);
}

