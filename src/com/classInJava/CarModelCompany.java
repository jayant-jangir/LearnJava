package com.classInJava;

import com.interfaceInJava.*;

public class CarModelCompany implements Engine, Tyre {
    private String engineType;
    protected double mileage;
    public int speedLimit;

    CarModelCompany () {
        engineType = "Petrol";
        mileage = 15;
        speedLimit = 60;
    }

    CarModelCompany (String engineType, double mileage, int speedLimit) {
        this.engineType = engineType;
        this.mileage = mileage;
        this.speedLimit = speedLimit;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public void noOfActiveWeel() {
        System.out.println("4 active wheels");
    }
}
