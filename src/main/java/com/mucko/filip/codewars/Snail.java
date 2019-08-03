package com.mucko.filip.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snail {
    public static int[] snail(int[][] array) {
        if (array.length <= 1) {
            try {
                return new int[]{array[0][0]};
            } catch (IndexOutOfBoundsException e) {
                return new int[0];
            }
        }

        List<Integer> list = new ArrayList<>();
        int rowStart = 0;
        int rowEnd = array.length - 1;
        int colStart = 0;
        int colEnd = array.length - 1;
        int currRow = 0;
        int currCol = 0;

        while (true) {
            for (; currCol <= colEnd; currCol++) {
                list.add(array[currRow][currCol]);
            }
            currCol--;
            currRow++;
            for (; currRow <= rowEnd; currRow++) {
                list.add(array[currRow][currCol]);
            }
            currRow--;
            currCol--;
            for (; currCol >= colStart; currCol--) {
                list.add(array[currRow][currCol]);
            }
            currCol++;
            currRow--;
            for (; currRow > rowStart; currRow--) {
                list.add(array[currRow][currCol]);
            }
            currRow++;
            currCol++;

            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;

            if (array.length % 2 != 0 && currCol == (array.length / 2) && currCol == currRow) {
                list.add(array[currRow][currCol]);
                break;
            }
            if (array.length % 2 == 0 && currRow == (array.length / 2) && (currCol - 1) == (array.length / 2 - 1)) {
                break;
            }
        }

        int[] num = new int[list.size()];
        for (
                int i = 0; i < list.size(); i++) {
            num[i] = list.get(i);
        }
        return num;
    }


    public static void main(String[] args) {
        int[][] array = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] array2 = {{1, 2, 3, 9},
                {4, 5, 6, 4},
                {7, 8, 9, 1},
                {1, 2, 3, 4}};
        int[][] array3 = {{}};
        int[][] array4 = {{0, 8, 4, 0, 3},
                {0, 3, 4, 9, 9},
                {5, 9, 4, 1, 7},
                {6, 4, 2, 0, 6},
                {0, 0, 1, 4, 3}};
        //System.out.println(Arrays.toString(snail(array)));
        //System.out.println(Arrays.toString(snail(array2)));
        //System.out.println(Arrays.toString(snail(array3)));
        System.out.println(Arrays.toString(snail(array4)));


    }
}
