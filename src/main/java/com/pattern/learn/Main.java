package com.pattern.learn;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.makeSUV(carBuilder);
        Car car = carBuilder.getResult();

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.makeSUV(carManualBuilder);
        CarManual carManual = CarManualBuilder.getResult();

        System.out.println("Car details: " + car);
        System.out.println("CarManual details: " + carManual);
    }
}
