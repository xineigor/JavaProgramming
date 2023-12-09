package Lab_7;

import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        int R = Integer.parseInt(scan.nextLine()); //строк
        int C = Integer.parseInt(scan.nextLine()); //столбцов

        int[][] matrix = new int[R][C];

//        R -= 1;
//        C -= 1;

        int k = 1;
        for (int i = C; i >= 1; i--){
            k = k * -1;
            for (int j = R ; j >= 1; j = j + k){
                matrix[j-1][i-1] = N;
                N++;

                for(int[] x : matrix){
                    System.out.println();
                    for(int y: x){
                        System.out.print(y + " ");
                    }
                }
            }
        }

//        for(int i = C  ; i > 0; i--){
//        matrix[R-1][C-1] = N;
        

//        for(int[] x : matrix){
//            System.out.println();
//            for(int y: x){
//                System.out.print(y + " ");
//            }
//        }
    }
}
