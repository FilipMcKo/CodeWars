package com.mucko.filip.codewars;

import java.util.*;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {

        Map<Integer, Integer> evenNr = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                evenNr.put(i, array[i]);
        }

        List<Integer> oddNr = new ArrayList<>();
        for (int i : array) {
            if (i % 2 != 0)
                oddNr.add(i);
        }

        Collections.sort(oddNr);
        int[] sorted = new int[array.length];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (evenNr.containsKey(i)) sorted[i] = evenNr.get(i);
            else {
                sorted[i] = oddNr.get(j);
                j++;
            }
        }


        return sorted;
    }


    public static void main(String[] args) {

        int[] array = {5, 3, 2, 8, 1, 4};
        System.out.println(Arrays.toString(sortArray(array)));
    }

}
