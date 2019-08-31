package com.mucko.filip.codewars;

import java.util.ArrayList;
import java.util.Collections;

public class DoubleLinear {

    private static ArrayList<Integer> sequence = new ArrayList();

    public static int dblLinear(int n) {
        sequence.add(1);
        fillSequence(n);
        return sequence.get(n);
    }

    private static void fillSequence(int n) {
        int x;
        int y;

        for (int i = 0; i <  n; i++) {
            x = 2 * sequence.get(i) + 1;
            y = 3 * sequence.get(i) + 1;
            if (!sequence.contains(x)) {
                sequence.add(x);
            }
            if (!sequence.contains(y)) {
                sequence.add(y);
            }
            Collections.sort(sequence);
        }
    }
}

