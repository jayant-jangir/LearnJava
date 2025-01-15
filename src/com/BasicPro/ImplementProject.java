package com.BasicPro;
import com.classInJava.CarModelCompany;
import com.classInJava.CarMusicCompany;
import com.interfaceInJava.Audi;
import com.classInJava.Jaguar;
import com.interfaceInJava.MusicSystem;

public class ImplementProject {
    public static void main(String[] args) {
        Audi audiCar = new Audi();

        System.out.println("Audi Car");
        CarMusicCompany carMusic = audiCar.getCarAndMusic();
        carMusic.start();
        carMusic.stop();
        carMusic.startCarMusic();
        carMusic.stopCarMusic();
        carMusic.noOfActiveWeelCarMusic();
        System.out.println();

        Jaguar jaguar = new Jaguar();

        System.out.println("Jaguar Car");
        CarModelCompany car = jaguar.getCarModel();
        car.start();
        car.stop();
        car.noOfActiveWeel();

        MusicSystem musicSystem = jaguar.getMusicSystem();
        musicSystem.start();
        musicSystem.stop();
    }

}
