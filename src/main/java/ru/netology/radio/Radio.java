package ru.netology.radio;

public class Radio {


    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;

    public void next() {
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = 0;

        } else {
            currentRadioStation += 1;
        }
    }

    public void prev() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;

        } else {
            currentRadioStation -= 1;

        }

    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
            return;
        } else {
            currentVolume++;
            return;
        }
    }


    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
            return;

        } else {
            currentVolume--;
            return;

        }
    }

    public int getCurrentVolume() {
        return currentVolume;

    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;

    }


    public int getCurrentRadioStation() {
        return currentRadioStation;

    }

    public void setRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }
}









