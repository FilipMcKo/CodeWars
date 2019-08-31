package com.mucko.filip.codewars.TdaTools;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class CoordinatesConverter {

    public static final double MAX_RESOLUTION = Math.pow(2, 32);
    private static final double MAX_DEGREES = 360d;


    public static long degrToMost(double degrees) {
        return (long) (degrees * MAX_RESOLUTION / MAX_DEGREES);
    }

    public static String degrsToMosts(double degrees1, double degrees2) {
        return degrToMost(degrees1) + ", " + degrToMost(degrees2);
    }

    public static double mostToDegr(long most) {
        return ((double) most) * MAX_DEGREES / MAX_RESOLUTION;
    }

    public static String mostsToDegrs(long most1, long most2) {
        return mostToDegr(most1) + ", " + mostToDegr(most2);
    }

    public static Integer degToIntTpeg(double input) {
        Double eq1 = Math.signum(input) * 0.5;
        Double eq2 = input * Math.pow(2, 24);
        Double eq = eq1 + eq2 / 360;
        return eq.intValue();
    }


    public static BigDecimal intToDegTpeg(int input) {
        BigDecimal eq1 = new BigDecimal((input - Math.signum(input) * 0.5) * 360);
        BigDecimal eq2 = new BigDecimal(Math.pow(2, 24));
        BigDecimal eq = eq1.divide(eq2);
        return eq.setScale(5, RoundingMode.UP);
    }

    public static String intsToDegsTpeg(int input1, int input2) {
        return intToDegTpeg(input1) + ", " + intToDegTpeg(input2);
    }

    public static String degsToIntsTpeg(double input1, double input2) {
        return degToIntTpeg(input1) + ", " + degToIntTpeg(input2);
    }

    public static BigDecimal currentPointOutOfRelativeInDeg(int previousPointTpeg, double relativeTpeg) {
        BigDecimal previousPointDeg = intToDegTpeg(previousPointTpeg);
        return previousPointDeg.add(BigDecimal.valueOf(relativeTpeg / 100000)).setScale(5, RoundingMode.UP);
    }




    public static void main(String[] args) throws IOException {
        System.out.println(mostsToDegrs(307727357, -956048269));
    }
}