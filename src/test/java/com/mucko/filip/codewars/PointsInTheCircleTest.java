package com.mucko.filip.codewars;
import com.mucko.filip.codewars.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointsInTheCircleTest {

    @Test
    public void test1() {
        assertEquals(5,PointsInTheCircle.pointsNumber(1));
        assertEquals(13,PointsInTheCircle.pointsNumber(2));
        assertEquals(29,PointsInTheCircle.pointsNumber(3));
        assertEquals(81,PointsInTheCircle.pointsNumber(5));
        assertEquals(3141549,PointsInTheCircle.pointsNumber(1000));
    }

}