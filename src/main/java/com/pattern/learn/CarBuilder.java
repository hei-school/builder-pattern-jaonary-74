package com.pattern.learn;


public class CarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        this.car.setSeat(number);
    }

    @Override
    public void setTripComputer() {
        this.car.setHaveTripComputer(true);
    }

    @Override
    public void setGPS() {
        this.car.setGPS(String.valueOf(true));
    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.car.setHaveTripComputer(true);
    }

    @Override
    public void setGps() {

    }

    public Car getResult() {
        return this.car;
    }
}
