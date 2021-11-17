package com.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestAndLowestTest {

    @Test
    void sum() {
        HighestAndLowest num = new HighestAndLowest();
        int actual = num.sum(5);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void highAndLow() {
        assertEquals("42 -9", HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}