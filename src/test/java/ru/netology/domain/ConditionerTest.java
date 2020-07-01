package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    public void shouldGetAndSet() {

        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void shouldIncreaseCurrentTemperature(){

        conditioner.setMaxTemperature(32);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        assertEquals(26, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature(){

        conditioner.setMaxTemperature(32);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        assertEquals(24, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseFromMax(){

        conditioner.setMaxTemperature(32);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(32);
        conditioner.decreaseCurrentTemperature();
        assertEquals(31, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseFromMax(){

        conditioner.setMaxTemperature(32);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(32);
        conditioner.increaseCurrentTemperature();
        assertEquals(32, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseFromMin(){

        conditioner.setMaxTemperature(32);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(16);
        conditioner.decreaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseFromOverMax(){

        conditioner.setMaxTemperature(32);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(35);
        conditioner.increaseCurrentTemperature();
        assertEquals(32, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseFromOverMax(){

        conditioner.setMaxTemperature(32);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(38);
        conditioner.decreaseCurrentTemperature();
        assertEquals(31, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseFromUnderMin(){

        conditioner.setMaxTemperature(32);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(10);
        conditioner.increaseCurrentTemperature();
        assertEquals(17, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseFromUnderMin(){

        conditioner.setMaxTemperature(32);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(16, conditioner.getCurrentTemperature());
    }


}