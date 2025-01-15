package com.classInJava;

import com.interfaceInJava.MusicSystem;

class MusicSystemCompany implements MusicSystem {
    String musicInfo;

    MusicSystemCompany () {
        musicInfo = "Radio";
    }

    MusicSystemCompany (String musicInfo) {
        this.musicInfo = musicInfo;
    }

    public String getMusicInfo() {
        return musicInfo;
    }

    public void setMusicInfo(String musicInfo) {
        this.musicInfo = musicInfo;
    }

    @Override
    public void start() {
        System.out.println("Music System Started.");
    }

    @Override
    public void stop() {
        System.out.println("Music system stopped.");

    }
}
