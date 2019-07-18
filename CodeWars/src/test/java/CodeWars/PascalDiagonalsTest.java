package CodeWars;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalDiagonalsTest {

    @Test
    void generateDiagonalTest1() {
        long[] arr = { 1, 1, 1, 1, 1, 1 };
        assertTrue(Arrays.equals(arr, PascalDiagonals.generateDiagonal(0, 6)));
    }

    @Test
    void generateDiagonalTest2() {
        long[] arr = { 1, 2, 3, 4, 5, 6 };
        assertTrue(Arrays.equals(arr, PascalDiagonals.generateDiagonal(1, 6)));
    }

    @Test
    void generateDiagonalTest3() {
        long[] arr = { 1, 3, 6, 10 };
        assertTrue(Arrays.equals(arr, PascalDiagonals.generateDiagonal(2, 4)));
    }

    @Test
    void generateDiagonalTest4() {
        long[] arr = { };
        assertTrue(Arrays.equals(arr, PascalDiagonals.generateDiagonal(2, 0)));
    }

}