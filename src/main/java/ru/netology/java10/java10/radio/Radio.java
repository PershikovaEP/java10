package ru.netology.java10.java10.radio;

public class Radio {
    private int currentRadioStation;
    private int countRadioStation = 10;
    private int maxRadioStation = countRadioStation - 1;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int countRadioStation) {
        this.countRadioStation = countRadioStation;
        this.maxRadioStation = countRadioStation - 1;
    }

    public Radio() {
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCountRadioStation() {
        return countRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void next() {
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prev() {
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
