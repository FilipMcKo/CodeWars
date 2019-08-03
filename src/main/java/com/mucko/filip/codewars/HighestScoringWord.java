package com.mucko.filip.codewars;

import java.util.Arrays;

public class HighestScoringWord {


    public static String high(String s) {
        String[] r = s.split(" ");
        int index = 0;
        int maxValue = 0;
        int tempMaxValue = 0;
        for (int i = 0; i < r.length; i++) {
            char[] chars = r[i].toCharArray();
            for (int j = 0; j < r[i].length(); j++) {
                tempMaxValue += chars[j]-96;
            }
            if (tempMaxValue > maxValue) {
                index = i;
                maxValue = tempMaxValue;
            }
            tempMaxValue = 0;
        }

        return r[index];
    }

    public static void main(String[] args) {
        System.out.println(high("climbing up to the volcano"));
    }

}


