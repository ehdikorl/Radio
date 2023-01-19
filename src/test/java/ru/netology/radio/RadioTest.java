package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void shouldSetNumberRadioStationChanging() {
        Radio rad = new Radio();
        rad.setRadioStation(5);
        int actual = rad.getCurrentRadioStation();
        assertEquals(5, actual);
    }

    @Test
    void shouldSelectingTheWrongRadioStationNumber() {
        Radio rad = new Radio();
        rad.setRadioStation(-1);

        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    void shouldSelectingTheWrongRadioStationNumber11() {
        Radio rad = new Radio();
        rad.setRadioStation(11);

        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByButtonNextIfCurrentIsNine() {
        Radio rad = new Radio();
        rad.setRadioStation(9);
        rad.next();
        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    void shouldTheNextChannelOfTheRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStation(5);
        rad.next();
        assertEquals(6, rad.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByPrevButtonIfCurrentIsNull() {
        Radio rad = new Radio();
        rad.setRadioStation(0);
        rad.prev();
        assertEquals(9, rad.getCurrentRadioStation());
    }

    @Test
    void shouldChangeTheStationByPrevButton() {
        Radio rad = new Radio();
        rad.setRadioStation(5);
        rad.prev();
        assertEquals(4, rad.getCurrentRadioStation());
    }


    @Test
    void shouldIncreaseTheVolumeByOneStep() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.increaseVolume();
        assertEquals(6, rad.getCurrentVolume());
    }

    @Test
    void shouldIncreaseTheMaximumVolumeValue() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.increaseVolume();
        assertEquals(10, rad.getCurrentVolume());
    }

    @Test
    void shouldReduceTheVolumeByOneStep() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        assertEquals(0, rad.getCurrentVolume());
    }


    @Test
    void shouldReduceTheMinimumVolumeValue() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.decreaseVolume();
        assertEquals(4, rad.getCurrentVolume());
    }

    @Test
    void shouldSetTheRadioChannelToIndicateItsNumber() {
        Radio rad = new Radio();
        rad.setRadioStation(5);
        assertEquals(5, rad.getCurrentRadioStation());

    }
}