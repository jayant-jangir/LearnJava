package com.interfaceInJava;

import com.classInJava.CarMusicCompany;

public class Audi {
    public CarMusicCompany getCarAndMusic() {
        return carAndMusic;
    }

    public void setCarAndMusic(CarMusicCompany carAndMusic) {
        this.carAndMusic = carAndMusic;
    }

    CarMusicCompany carAndMusic = new CarMusicCompany();
}
