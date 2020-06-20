package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio(2, 10, 25);
        radio.setCurrentStation(2);
        int actual = radio.getCurrentStation();
        assertEquals(2, actual);
    }

    @Test
    void shouldNotSetOverMaxStation() {
        Radio radio = new Radio(10, 10, 25);
        radio.setCurrentStation(11);
        int actual = radio.getCurrentStation();
        assertEquals(10, actual);
    }

    @Test
    void shouldNotSetUnderMinStation() {
        Radio radio = new Radio(0, 10, 25);
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio(2, 10, 25);
        radio.setCurrentVolume(25);
        int actual = radio.getCurrentVolume();
        assertEquals(25, actual);
    }

    @Test
    void shouldNotSetOverMaxVolume() {
        Radio radio = new Radio(2, 10, 100);
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        assertEquals(100, actual);
    }

    @Test
    void shouldNotSetUnderMinVolume() {
        Radio radio = new Radio(2, 10, 0);
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        assertEquals(0, actual);
    }

    @Test
    void shouldSetNextStation() {
        Radio radio = new Radio(7, 10, 25);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(8, actual);
    }

    @Test
    void shouldNotSetNextStation() {
        Radio radio = new Radio(10, 10, 25);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }

    @Test
    void shouldSetPrevStation() {
        Radio radio = new Radio(9, 10, 25);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(8, actual);
    }

    @Test
    void shouldNotSetPrevStation() {
        Radio radio = new Radio(0, 10, 25);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        assertEquals(10, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio(2, 10, 25);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(26, actual);
    }

    @Test
    void shouldNotIncreaseVolume() {
        Radio radio = new Radio(2, 10, 100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(100, actual);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio(2, 10, 50);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(49, actual);
    }

    @Test
    void shouldNotDecreaseVolume() {
        Radio radio = new Radio(2, 10, 0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(0, actual);
    }
}
