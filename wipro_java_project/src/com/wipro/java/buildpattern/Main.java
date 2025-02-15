package com.wipro.java.buildpattern;

//Main.java
public class Main {
 public static void main(String[] args) {
     Director director = new Director();

     // Build Car
     CarBuilder carBuilder = new CarBuilder();
     director.constructSportsCar(carBuilder);
     Car sportsCar = carBuilder.getResult();
     sportsCar.showDetails();

     // Build Car Manual
     CarManualBuilder manualBuilder = new CarManualBuilder();
     director.constructSportsCar(manualBuilder);
     CarManual carManual = manualBuilder.getResult();
     carManual.printManual();
 }
}

