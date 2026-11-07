package com.example.circle_area;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAreaForRadiusOne() {
        assertEquals(Math.PI,
                App.calculateArea(1), 0.0001);
    }

    @Test
    public void testAreaForRadiusFive() {
        assertEquals(78.5398,
                App.calculateArea(5), 0.0001);
    }

    @Test
    public void testAreaForZeroRadius() {
        assertEquals(0.0,
                App.calculateArea(0), 0.0001);
    }

    @Test
    public void testNegativeRadius() {
        assertThrows(IllegalArgumentException.class,
                () -> App.calculateArea(-2));
    }
}