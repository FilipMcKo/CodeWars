package com.mucko.filip.codewars;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeFormatterTest {

    @Test
    void testFillTimePeriods(){
        TimeFormatter.fillTimePeriods(3662+3*365*24*60*60+2*24*60*60);
        List<Integer> answer = new ArrayList<>();
        answer.add(3);
        answer.add(2);
        answer.add(1);
        answer.add(1);
        answer.add(2);
        assertEquals(answer, TimeFormatter.timePeriods);
    }

    @Test
    void testFormatDuration(){
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
    }

}