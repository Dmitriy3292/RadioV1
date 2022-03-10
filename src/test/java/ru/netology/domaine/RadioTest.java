package ru.netology.domaine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //ГРОМКОСТЬ
    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        assertEquals(10,radio.getCurrentVolume());
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        assertEquals(0,radio.getCurrentVolume());
    }
    @Test
    public void shouldUpVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.upVolume();
        assertEquals(10,radio.getCurrentVolume());
    }
    @Test
    public void shouldUpVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setMaxVolume(10);
        radio.upVolume();
        assertEquals(10,radio.getCurrentVolume());
    }
    @Test
    public void shouldDownVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.downVolume();
        assertEquals(8, radio.getCurrentVolume());
    }
    @Test
    public void shouldDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setMinVolume(0);
        radio.downVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

    //СТАНЦИИ
    @Test
    public void shouldMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    public void shouldMinStation() {
        Radio radio = new Radio();
        radio.setMaxStation(10);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        assertEquals(0,radio.getCurrentStation());
    }
    @Test
    public void shouldUpStationMax() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        radio.upStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldUpStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(6);
        radio.upStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldDownStationMin() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        radio.downStation();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void shouldDownStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        radio.downStation();
        assertEquals(4, radio.getCurrentStation());
    }
    @Test
    public void  shouldCurrentStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);
        assertEquals(0,radio.getCurrentStation());
    }
    @Test
    public void  shouldCurrentStationMax() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);
        assertEquals(0,radio.getCurrentStation());
    }
    @Test
    public void  shouldCurrentStationMin() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);
        assertEquals(0,radio.getCurrentStation());
    }

}