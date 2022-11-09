package com.mucko.filip.codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> intsB = Arrays.stream(b).boxed().collect(Collectors.toList());
        return Arrays.stream(a).filter(n -> !intsB.contains(n)).toArray();
    }
}
