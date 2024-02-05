package com.pattern.learn;

public class CarManualBuilder implements Builder{
    private CarManual carManual;
    @Override
    public void reset() {
        this.carManual = new CarManual();
    }

    @Override
    public void setSeats(int number) {
        this.carManual.setSeat(number);
    }

    @Override
    public void setTripComputer() {
        this.carManual.setHaveTripComputer(true);
    }

    @Override
    public void setGPS() {
        this.carManual.setGPS(String.valueOf(true));
    }

    @Override
    public void setEngine(String engine) {
        this.carManual.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.carManual.setHaveTripComputer(true);
    }

    @Override
    public void setGps() {
        this.carManual.setGPS(String.valueOf(true));
    }

    public CarManual getResult() {
        return this.carManual;
    }
}
