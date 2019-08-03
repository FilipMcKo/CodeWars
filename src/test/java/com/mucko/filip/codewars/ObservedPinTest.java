package com.mucko.filip.codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.mucko.filip.codewars.*;

import static org.junit.Assert.assertEquals;

class ObservedPinTest {

    @Test
    void oneDigitCombinationTest() {
        //given
        List<String> results = Arrays.asList("2","4","5","6","8");
        List<String> observedPIN = ObservedPin.getPINs("5");

        //when
        observedPIN.sort(Comparator.comparingInt(s->Integer.parseInt(s)));

        //then
        assertEquals(results,observedPIN);
    }

    @Test
    void twoDigitCombinationTest1(){
        //given
        List<String> results = Arrays.asList("78","77","75","79","88","87","85","89","48","47","45","49","40","70","80");
        List<String> observedPIN = ObservedPin.getPINs("78");

        //when
        observedPIN.sort(Comparator.comparingInt(s->Integer.parseInt(s)));
        results.sort(Comparator.comparingInt(s->Integer.parseInt(s)));

        //then
        assertEquals(results,observedPIN);
    }

    @Test
    void twoDigitCombinationTest2(){
        //given
        List<String> results = Arrays.asList("11", "21", "41", "12", "22", "42", "14", "24", "44");
        List<String> observedPIN = ObservedPin.getPINs("11");

        //when
        observedPIN.sort(Comparator.comparingInt(s->Integer.parseInt(s)));
        results.sort(Comparator.comparingInt(s->Integer.parseInt(s)));

        //then
        assertEquals(results,observedPIN);
    }

    @Test
    void threeDigitCombinationTest(){
        //given
        List<String> results = Arrays.asList("236", "238", "239", "256", "258", "259", "266", "268", "269", "296", "298", "299", "336", "338", "339", "356", "358", "359", "366", "368", "369", "396", "398", "399", "636", "638", "639", "656", "658", "659", "666", "668", "669", "696", "698", "699");
        List<String> observedPIN = ObservedPin.getPINs("369");

        //when
        observedPIN.sort(Comparator.comparingInt(s->Integer.parseInt(s)));
        results.sort(Comparator.comparingInt(s->Integer.parseInt(s)));

        //then
        assertEquals(results,observedPIN);

    }


}