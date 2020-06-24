package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldSetCurrentStation() {
        radio.setCurrentStation(2);
        int actual = radio.getCurrentStation();
        assertEquals(2, actual);
    }

    @Test
    void shouldNotSetOverMaxStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(11);
        int actual = radio.getCurrentStation();
        assertEquals(10, actual);
    }

    @Test
    void shouldNotSetUnderMinStation() {
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        radio.setCurrentVolume(25);
        int actual = radio.getCurrentVolume();
        assertEquals(25, actual);
    }

  @Test
    void shouldNotSetOverMaxVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(100, actual);
    }

    @Test
    void shouldNotSetUnderMinVolume() {
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        assertEquals(0, actual);
    }

    @Test
    void shouldSetNextStation() {
        radio.setCurrentStation(7);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(8, actual);
    }

    @Test
    void shouldNotSetNextStation() {
        radio.setCurrentStation(10);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }

    @Test
    void shouldSetPrevStation() {
        radio.setCurrentStation(9);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(8, actual);
    }

    @Test
    void shouldNotSetPrevStation() {
        radio.setCurrentStation(0);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(10, actual);
    }

    @Test
    void increaseVolume() {
        radio.setCurrentVolume(25);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(26, actual);
    }

    @Test
    void shouldNotIncreaseVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(100, actual);
    }

    @Test
    void decreaseVolume() {
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(49, actual);
    }

    @Test
    void shouldNotDecreaseVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(0, actual);
    }
}
