package com.mucko.filip.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextBiggerNumberTwoTest {

    @Test
    void nextBiggerNumber() {
        assertEquals(21, NextBiggerNumberTwo.nextBiggerNumber(12));
        assertEquals(531, NextBiggerNumberTwo.nextBiggerNumber(513));
        assertEquals(2071, NextBiggerNumberTwo.nextBiggerNumber(2017));
        assertEquals(441, NextBiggerNumberTwo.nextBiggerNumber(414));
        assertEquals(414, NextBiggerNumberTwo.nextBiggerNumber(144));
    }
}