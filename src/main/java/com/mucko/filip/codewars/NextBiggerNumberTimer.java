package com.mucko.filip.codewars;

public class NextBiggerNumberTimer {

    public static void main(String[] args) {
        long start = System.nanoTime();
        long stop = System.nanoTime();


        start = System.nanoTime();
        NextBiggerNumber.nextBiggerNumberBasic(0);
        NextBiggerNumber.nextBiggerNumberBasic(1);
        NextBiggerNumber.nextBiggerNumberBasic(12);
        NextBiggerNumber.nextBiggerNumberBasic(513);
        NextBiggerNumber.nextBiggerNumberBasic(2017);
        NextBiggerNumber.nextBiggerNumberBasic(414);
        NextBiggerNumber.nextBiggerNumberBasic(144);
        NextBiggerNumber.nextBiggerNumberBasic(144);
        NextBiggerNumber.nextBiggerNumberBasic(144);
        NextBiggerNumber.nextBiggerNumberBasic(144);
        NextBiggerNumber.nextBiggerNumberBasic(144);
        NextBiggerNumber.nextBiggerNumberBasic(144);
        NextBiggerNumber.nextBiggerNumberBasic(144);
        stop = System.nanoTime();
        System.out.print("nextBiggerNumberV2(Basic): ");
        System.out.println(stop - start);

        start = System.nanoTime();
        NextBiggerNumber.nextBiggerNumber(0);
        NextBiggerNumber.nextBiggerNumber(1);
        NextBiggerNumber.nextBiggerNumber(12);
        NextBiggerNumber.nextBiggerNumber(513);
        NextBiggerNumber.nextBiggerNumber(2017);
        NextBiggerNumber.nextBiggerNumber(414);
        NextBiggerNumber.nextBiggerNumber(144);
        NextBiggerNumber.nextBiggerNumber(144);
        NextBiggerNumber.nextBiggerNumber(144);
        NextBiggerNumber.nextBiggerNumber(144);
        NextBiggerNumber.nextBiggerNumber(144);
        NextBiggerNumber.nextBiggerNumber(144);
        NextBiggerNumber.nextBiggerNumber(144);
        stop = System.nanoTime();
        System.out.print("nextBiggerNumberV2:        ");
        System.out.println(stop - start);

        start = System.nanoTime();
        NextBiggerNumber.nextBiggerNumber2(0);
        NextBiggerNumber.nextBiggerNumber2(1);
        NextBiggerNumber.nextBiggerNumber2(12);
        NextBiggerNumber.nextBiggerNumber2(513);
        NextBiggerNumber.nextBiggerNumber2(2017);
        System.out.println(NextBiggerNumber.nextBiggerNumber2(1445159009));
        NextBiggerNumber.nextBiggerNumber2(414);
        NextBiggerNumber.nextBiggerNumber2(144);
        NextBiggerNumber.nextBiggerNumber2(144);
        NextBiggerNumber.nextBiggerNumber2(144);
        NextBiggerNumber.nextBiggerNumber2(144);
        NextBiggerNumber.nextBiggerNumber2(144);
        NextBiggerNumber.nextBiggerNumber2(144);
        NextBiggerNumber.nextBiggerNumber2(144);
        stop = System.nanoTime();
        System.out.print("nextBiggerNumberV2(2):     ");
        System.out.println(stop - start);
    }
}
