package com.mucko.filip.codewars;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

    public static boolean ifEureka(long number) {
        long eurekaNr = 0;
        Long copyNr = number;
        int length = copyNr.toString().length();
        while (length > 0) {
            eurekaNr += Math.pow(copyNr % 10, length);
            length--;
            copyNr /= 10;
        }
        if (number == eurekaNr) return true;
        return false;
    }

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> eurekaList = new ArrayList<>();
        for (long i = a; i < b; i++) {
            if (ifEureka(i)) eurekaList.add(i);
        }
        return eurekaList;
    }


    public static void main(String[] args) {
        System.out.println(sumDigPow(90,100));
    }

}
