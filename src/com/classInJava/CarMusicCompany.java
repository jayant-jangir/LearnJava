package com.classInJava;

import com.interfaceInJava.CarMusic;

public class CarMusicCompany implements CarMusic {
    private String engineType;
    protected double mileage;
    public int speedLimit;
    String musicInfo;

    public CarMusicCompany() {
        engineType = "Petrol";
        mileage = 15;
        speedLimit = 60;
        musicInfo = "Radio";
    }

    CarMusicCompany (String engineType, double mileage, int speedLimit, String musicInfo) {
        this.engineType = engineType;
        this.mileage = mileage;
        this.speedLimit = speedLimit;
        this.musicInfo = musicInfo;
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

    public String getMusicInfo() {
        return musicInfo;
    }

    public void setMusicInfo(String musicInfo) {
        this.musicInfo = musicInfo;
    }

    @Override
    public void startCarMusic() {
        System.out.println("Start music in car.");
    }

    @Override
    public void stopCarMusic() {
        System.out.println("Stopped Music in Car");
    }

    @Override
    public void noOfActiveWeelCarMusic() {
        System.out.println("4 Active Wheels");
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void noOfActiveWeel() {
        System.out.println("4 wheels");
    }
}
