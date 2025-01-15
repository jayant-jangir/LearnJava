package com.classInJava;

public class Jaguar {
    CarModelCompany carModel = new CarModelCompany();
    MusicSystemCompany musicSystem = new MusicSystemCompany();

    public CarModelCompany getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModelCompany carModel) {
        this.carModel = carModel;
    }

    public MusicSystemCompany getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(MusicSystemCompany musicSystem) {
        this.musicSystem = musicSystem;
    }
}
