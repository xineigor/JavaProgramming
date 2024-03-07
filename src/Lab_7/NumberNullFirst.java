package Lab_7;

import java.util.Scanner;

public class NumberNullFirst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        String[] array = scan.nextLine().split(" ");

        String[][] matrix = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = array[i * m + j];
            }
        }

        String[][] reverse = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                reverse[n - i - 1][j] = matrix[i][j];

            }
        }

        String[][] reverseR = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                reverseR[i][j] = matrix[i][m - j - 1];

            }
        }

        System.out.println();
        printMatrix(matrix);
        System.out.println();
        printMatrix(reverse);
        System.out.println();
        printMatrix(reverseR);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] x : matrix) {
            for (int y : x) {
                System.out.println(y);
            }
        }
    }

    public static void printMatrix(String[][] matrix) {
        for (String[] x : matrix) {
            for (String y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
