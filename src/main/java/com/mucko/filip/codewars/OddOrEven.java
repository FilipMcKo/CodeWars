package com.mucko.filip.codewars;

public class OddOrEven {

    public static String oddOrEven (int[] array) {
        boolean even = true;
        for (int i : array) {
            if (i % 2 != 0) even = !even;
        }
        if (even) return "even";
        return "odd";

    }

}
