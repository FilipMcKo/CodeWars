package com.mucko.filip.codewars;

public class NumberOfTrailingZerosOfNFactorized {

    public static int zeros(int n) {
        int sum = 0;
        n = n / 5;
        if (n > 0) {
            sum += n + zeros(n);
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println(zeros(0));
        System.out.println(zeros(3));
        System.out.println(zeros(4));
        System.out.println(zeros(5));
        System.out.println(zeros(9));
        System.out.println(zeros(12));
        System.out.println(zeros(19));
        System.out.println(zeros(24));
    }
}
