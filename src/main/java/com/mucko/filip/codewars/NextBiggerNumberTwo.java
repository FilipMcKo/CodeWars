package com.mucko.filip.codewars;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NextBiggerNumberTwo {

    static List<Character> baseNumberList;

    public static long nextBiggerNumber(long baseNumber) {
        long nextBigger = baseNumber + 1;
        Character[] baseNumberArr = toCharacterArray(String.valueOf(baseNumber));
        baseNumberList = Arrays.asList(baseNumberArr);

        while (condition2(String.valueOf(nextBigger))) {
            nextBigger++;
        }

        return nextBigger;
    }

    private static boolean condition2(String nextBiggerNumber) {
        List<Character> copy = new LinkedList<>(baseNumberList);
        char[] nextBiggerArr = nextBiggerNumber.toCharArray();
        for (char c : nextBiggerArr) {
            copy.remove(new Character(c));
        }
        return !copy.isEmpty();
    }

    static Character[] toCharacterArray(String number) {
        Character[] characters = new Character[number.length()];
        for (int i = 0; i < number.length(); i++) {
            characters[i] = number.charAt(i);
        }
        return characters;
    }
}


