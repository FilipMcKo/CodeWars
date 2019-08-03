package com.mucko.filip.codewars;

import java.util.ArrayList;
import java.util.List;

public class RectangleIntoSquares {
    private static List<Integer> squares = new ArrayList<>();

    public static void fillSquares(int lng, int wdth) {
        if (lng == wdth) squares.add(wdth);
        else if (lng > wdth) {
            squares.add(wdth);
            fillSquares(lng - wdth, wdth);
        }
        else if(lng<wdth){
            squares.add(lng);
            fillSquares(lng, wdth-lng);
        }
    }

    public static List<Integer> sqInRect(int lng, int wdth) {
        squares.clear();
        if (lng == wdth)
            return null;
        fillSquares(lng,wdth);
        return squares;
    }


    public static void main(String[] args) {
        System.out.println(sqInRect(3,5));
        System.out.println(sqInRect(3,5));
        System.out.println(sqInRect(3,5));

    }
}
