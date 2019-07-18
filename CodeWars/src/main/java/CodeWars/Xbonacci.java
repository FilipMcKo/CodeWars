package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Xbonacci {

    public static double[] tribonacci(double[] s, int n) {

        double[] tribonacciSequence = new double[n];
        if (n < 4) {
            for (int i = 0; i < n; i++) {
                tribonacciSequence[i] = s[i];
            }
            return tribonacciSequence;
        }
        for (int i = 0; i < 3; i++) {
            tribonacciSequence[i] = s[i];
        }

        double tempValue = 0;
        for (int i = 3; i < n; i++) {
            tempValue = tribonacciSequence[i - 1] + tribonacciSequence[i - 2] + tribonacciSequence[i - 3];
            tribonacciSequence[i] = tempValue;
        }

        return tribonacciSequence;
    }

    public static void main(String[] args) {
        double[] s = {6, 4, 1};
        System.out.println(Arrays.toString(tribonacci(s, 2)));
    }
}