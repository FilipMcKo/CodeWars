package com.mucko.filip.codewars;

public class BrakingWell {

    static final double G = 9.81; //m/s/s
    static final double UNIT_RATIO = 3.6;

    public static double dist(double v, double mu) {    // suppose reaction time is 1
        return v / UNIT_RATIO + (v / UNIT_RATIO) * (v / UNIT_RATIO) / (2.0 * mu * G);
    }

    public static double speed(double d, double mu) {   // suppose reaction time is 1
        double a = 1 / (2 * mu * G);
        double delta = 1 + 4 * a * d;
        return UNIT_RATIO * (-1 + Math.sqrt(delta)) / (2 * a);
    }

    public static void main(String[] args) {
        System.out.println(dist(144, 0.3));
        System.out.println(speed(159, 0.8));
    }


}
