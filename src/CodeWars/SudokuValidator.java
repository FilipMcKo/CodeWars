package CodeWars;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SudokuValidator {
    static boolean[][] boolArr;

    public static boolean check(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                if(sudoku[i][j] == 0) return false;
            }
        }

        boolArr = new boolean[27][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boolArr[i][sudoku[i][j] - 1] = true;
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boolArr[i + 9][sudoku[j][i] - 1] = true;
            }
        }

        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    boolArr[18+k][sudoku[i][j+3*k]-1] = true;
                }
            }
        }

        for (int k = 0; k < 3; k++) {
            for (int i = 3; i < 6; i++) {
                for (int j = 0; j < 3; j++) {
                    boolArr[21+k][sudoku[i][j+3*k]-1] = true;
                }
            }
        }

        for (int k = 0; k < 3; k++) {
            for (int i = 6; i < 9; i++) {
                for (int j = 0; j < 3; j++) {
                    boolArr[24+k][sudoku[i][j+3*k]-1] = true;
                }
            }
        }

        //System.out.println(Arrays.deepToString(boolArr));
        for (int i = 0; i < 27; i++) {
            for (int j = 0; j < 9; j++) {
                if (!boolArr[i][j]) return false;
            }

        }


        return true;
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        System.out.println(check(sudoku));
    }
}
