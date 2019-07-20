package CodeWars;

public class PascalDiagonals {
    static long[][] matrix;

    public static long[] generateDiagonal(int n, int l) {
        long[] answer = new long[l];
        getPascalMatrix(l + n);
        for (int i = 0, j = 0; i < l; i++) {
            if (matrix[i][n] == 0) {
                l++;
                continue;
            }
            answer[j++] = matrix[i][n];
        }
        return answer;
    }

    static void getPascalMatrix(int rowAmount) {
        matrix = new long[rowAmount][rowAmount];
        matrix[0][0] = 1;
        fillWithZeros(1, matrix[0]);
        if (rowAmount < 2) {
            return;
        }
        matrix[1][0] = 1;
        matrix[1][1] = 1;
        fillWithZeros(2, matrix[1]);

        for (int i = 2; i < rowAmount; i++) {
            long[] temp = new long[rowAmount];
            temp[0] = 1;
            temp[i] = 1;
            for (int j = 1; j < i; j++) {
                temp[j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
            }
            fillWithZeros(i + 1, temp);
            matrix[i] = temp;
<<<<<<< HEAD
         }
=======
        }
>>>>>>> 96bcad1700cb5e8e6a8519d8503dea884a7531d7
    }

    private static void fillWithZeros(int col, long[] array) {
        for (int i = col; i < array.length; i++) {
            array[i] = 0;
        }
    }
}
