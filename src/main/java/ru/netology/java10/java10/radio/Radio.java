package ru.netology.java10.java10.radio;

public class Radio {
    private int currentRadioStation;
    private int countRadioStation = 10;
    private int currentVolume;

    public Radio(int countRadioStation) {
        this.countRadioStation = countRadioStation;
    }

    public Radio() {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > countRadioStation - 1) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCountRadioStation() {
        return countRadioStation;
    }

    public void next() {
        if (currentRadioStation >= countRadioStation - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation <= 0) {
            currentRadioStation = countRadioStation - 1;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
