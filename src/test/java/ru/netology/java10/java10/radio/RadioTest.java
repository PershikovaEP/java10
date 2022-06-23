package ru.netology.java10.java10.radio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void mustBeInRangeWhenValueMiddle() {

        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void mustBeInRangeWhenValueAboveBorder() {

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void mustBeInRangeWhenValueUnderBorder() {

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void mustBeInRangeWhenValueTopBorder() {

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void mustBeInRangeWhenValueBottomBorder() {

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldInitFieldCountRadioStationWhenConstructorWithoutParameter() {

        assertEquals(10, radio.getCountRadioStation());
    }

    @Test
    public void shouldInitFieldCountRadioStationWhenConstructorWithParameter() {
        Radio radio = new Radio(15);

        assertEquals(15, radio.getCountRadioStation());
    }


    @Test
    public void shouldChangeNextRadioStationWhenValueMiddle()  {
        radio.setCurrentRadioStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextRadioStationWhenValueOfTopBorder() {
        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextRadioStationWhenValueOfTopBorderWhenConstructorWithParameter() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(14);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePrevRadioStationWhenValueMiddle() {
        radio.setCurrentRadioStation(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePrevRadioStationWhenValueOfBottomBorder() {
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePrevRadioStationWhenValueOfBottomBorderWhenConstructorWithParameter() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 14;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeMustBeInRangeWhenValueMiddle() {

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeMustBeInRangeWhenValueAboveBorder() {

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeMustBeInRangeWhenValueUnderBorder() {

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeMustBeInRangeWhenValueTopBorder() {

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeMustBeInRangeWhenValueBottomBorder() {

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeWhenValueMiddle() {
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeWhenValueTopBorder() {
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeWhenValueMiddle() {
        radio.setCurrentVolume(5);

        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeWhenValueBottomBorder() {
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


}
