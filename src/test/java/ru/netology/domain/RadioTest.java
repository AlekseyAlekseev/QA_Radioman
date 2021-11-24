package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void shouldSetStation() {
        radio.setCurrentRadioStation(4);
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetInvalidStation() {
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(12);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNextStation() {
        radio.setCurrentRadioStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentRadioStation());
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
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldTurnDownVolumeLowerBound() {
        radio.setCurrentVolume(0);
        radio.turnDownVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}