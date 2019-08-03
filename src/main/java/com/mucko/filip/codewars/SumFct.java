package com.mucko.filip.codewars;

//name: Perimeter of squares in a rectangle

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SumFct {
    private static List<BigInteger> fibonacci;

    public static BigInteger perimeter(BigInteger n) {
        BigInteger answer = BigInteger.ZERO;
        fillFibonacciArr(n.intValue() + 1);
        for (int i = 0; i <= n.intValue(); i++) {
            answer = answer.add(fibonacci.get(i));
        }
        return answer.multiply(BigInteger.valueOf(4));
    }

    static void fillFibonacciArr(int n) {
        fibonacci = new ArrayList<>();
        fibonacci.add(BigInteger.valueOf(1));
        fibonacci.add(BigInteger.valueOf(1));
        for (int i = 2; i < n; i++) {
            fibonacci.add(fibonacci.get(i - 2).add(fibonacci.get(i - 1)));
        }
    }
}

