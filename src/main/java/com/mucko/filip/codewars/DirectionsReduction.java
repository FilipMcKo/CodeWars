package com.mucko.filip.codewars;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DirectionsReduction {

    public static String[] dirReduc(String[] arr) {
        boolean ns = false;
        boolean sn = false;
        boolean we = false;
        boolean ew = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals("NORTH")) {
                if (arr[i + 1].equals("SOUTH")) {
                    arr[i + 1] = " ";
                    arr[i] = " ";
                    ns = true;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals("SOUTH")) {
                if (arr[i + 1].equals("NORTH")) {
                    arr[i + 1] = " ";
                    arr[i] = " ";
                    sn = true;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals("WEST")) {
                if (arr[i + 1].equals("EAST")) {
                    arr[i + 1] = " ";
                    arr[i] = " ";
                    we = true;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals("EAST")) {
                if (arr[i + 1].equals("WEST")) {
                    arr[i + 1] = " ";
                    arr[i] = " ";
                    ew = true;
                    break;
                }
            }
        }

        List<String> result = new LinkedList<>();
        for (String s : arr) {
            if (!s.equals(" ")) {
                result.add(s);
            }
        }

        if (ns || sn || we || ew) {
           result = Arrays.asList(dirReduc(result.toArray(new String[result.size()])));
        }

        if (!ns && !sn && !we && !ew) {
            return result.toArray(new String[result.size()]);
        }

        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        String[] dir = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        System.out.println(Arrays.toString(dirReduc(dir)));
    }
}