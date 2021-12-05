package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void shouldSetCountRadioStation() {
        radio.setCountRadioStation(16);
        assertEquals(16, radio.getCountRadioStation());
    }

    @Test
    void shouldCreateRadio() {
        Radio radio = new Radio(27);
        assertEquals(27, radio.getCountRadioStation());
    }


    @Test
    void shouldSetValidRadioStation() {
        radio.setStation(7);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetInvalidRadioStation() {
        radio.setStation(-5);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetRadioStation() {
        radio.setStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    void shouldSetStation() {
        radio.setCurrentRadioStation(4);
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetInvalidStationUpperBound() {
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(12);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetInvalidStationLowerBound() {
        radio.setCurrentRadioStation(4);
        radio.setCurrentRadioStation(-2);
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNextStation() {
        radio.setCurrentRadioStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNextStationMaxBound() {
        radio.setCurrentRadioStation(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldPrevStationMinBound() {
        radio.setCurrentRadioStation(1);
        radio.prevStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldPrevStation() {
        radio.setCurrentRadioStation(3);
        radio.prevStation();
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNextStationUpperBound() {
        radio.setCurrentRadioStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldPrevStationLowerBound() {
        radio.setCurrentRadioStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void shouldTurnDownVolume() {
        radio.setCurrentVolume(5);
        radio.turnDownVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeUpperBound() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldTurnDownVolumeLowerBound() {
        radio.setCurrentVolume(0);
        radio.turnDownVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}