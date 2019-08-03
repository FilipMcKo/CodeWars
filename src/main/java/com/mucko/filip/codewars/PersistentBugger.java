package com.mucko.filip.codewars;

public class PersistentBugger {

    public static int persistence(long n) {
        int count = 0;
        int temp = 1;
        while (n > 10) {
            while (n > 0) {
                temp *= n % 10;
                n /= 10;
            }
            n = temp;
            temp = 1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(persistence(25));
    }

}
