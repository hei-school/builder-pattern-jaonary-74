package com.pattern.learn;

public class Director {
    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("v8");
        builder.setTripComputer();
        builder.setGps();
    }

    public void makeSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("sports");
        builder.setTripComputer();
        builder.setGPS();
    }
}
