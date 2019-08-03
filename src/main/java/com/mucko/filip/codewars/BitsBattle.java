package com.mucko.filip.codewars;

public class BitsBattle {


    static String bitsBattle(int[] numbers) {
        int ones = 0;
        int zeros = 0;
        String binary;

        for (int number : numbers) {
            if(number==0) continue;
            binary = Integer.toBinaryString(number);
            if(number%2==0)
            for (int i = 0; i < binary.length(); i++){
                if(binary.charAt(i)=='0') zeros++;
            }
            else{
                for (int i = 0; i < binary.length(); i++){
                    if(binary.charAt(i)=='1') ones++;
                }
            }
        }

        if(ones>zeros) return "odds win";
        else if(zeros>ones) return "evens win";
        return "tie";

    }


    public static void main(String[] args) {
        System.out.println(bitsBattle(new int[]{1,13,16}));
    }
}
