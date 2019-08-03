package com.mucko.filip.codewars;

import java.util.Arrays;

public class Greed {

    private static int ones;
    private static int twos;
    private static int threes;
    private static int fours;
    private static int fives;
    private static int sixes;
    private static int result;

    public static int greedy(int[] dice) {
        resetValues();
        determineAmounts(dice);
        countPoints();
        return result;
    }

    private static void resetValues() {
        ones = 0;
        twos = 0;
        threes = 0;
        fours = 0;
        fives = 0;
        sixes = 0;
        result = 0;
    }

    private static void determineAmounts(int[] dice) {
        for (int die : dice) {
            switch (die) {
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
                case 3:
                    threes++;
                    break;
                case 4:
                    fours++;
                    break;
                case 5:
                    fives++;
                    break;
                case 6:
                    sixes++;
                    break;
            }
        }
    }

    private static void countPoints() {
        int[] throwResults = {ones, twos, threes, fours, fives, sixes};
        while (Arrays.stream(throwResults).sum() > 0) {
            for (int i = 0; i < throwResults.length; i++) {
                if (i == 0 && throwResults[i] >= 3) {
                    result += 1000;
                    throwResults[i] -= 3;
                } else if (throwResults[i] >= 3) {
                    result += (i + 1) * 100;
                    throwResults[i] -= 3;
                } else if (throwResults[i] < 3) {
                    if (i == 0 && throwResults[i] > 0) {
                        result += 100;
                        throwResults[i]--;
                    } else if (i == 4 && throwResults[i] > 0) {
                        result += 50;
                        throwResults[i]--;
                    } else if (throwResults[i] > 0) {
                        throwResults[i]--;
                    }
                }
            }
        }
    }
}
