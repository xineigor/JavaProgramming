package Lab_7;

import java.util.Arrays;

public class NumberNullSecondL {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int k = 4;
        int[][] trio = new int[m][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {;
                for (int l = 0; l < k; l++) {
                    trio[j][l] = i + j + l;
                }
                System.out.println(Arrays.deepToString(trio));

            }
            //System.out.println(Arrays.deepToString(trio));
            System.out.println();
        }

        //System.out.println(Arrays.toString(trio));
        //System.out.println(Arrays.deepToString(trio));
    }
}
