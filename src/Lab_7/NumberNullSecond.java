package Lab_7;

import Service.Service;

import java.util.Arrays;

public class NumberNullSecond {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int k = 4;
        int[][][] trio = new int[n][m][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {;
                for (int l = 0; l < k; l++) {
                    trio[i][j][l] = (i + 1) * (j + 1) * (l + 1);
                }

            }
        }

        for (int i = 0; i < n; i++) {
            printMatrix(trio[i]);
            System.out.println();
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] x : matrix) {
            for (int y : x) {
                System.out.print(y + "\t");
            }
            System.out.println();
        }
    }
}
