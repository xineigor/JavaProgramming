package Lab_7;

import Service.Service;

import java.util.Arrays;
import java.util.Scanner;

public class NumberTwoK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = Integer.parseInt(scan.nextLine());
        String inLine = scan.nextLine();
//        int arraySize = scan.nextInt();
        String[] inArray = inLine.split(" ");

        int k = 0;
        int[] inArrayInt = new int[inArray.length];
        for (String x : inArray) {
            inArrayInt[k] = Integer.parseInt(x);
            k++;
        }


        int[][] arrayOut = new int[arraySize][arraySize];

        for (int i = 0, j = 0, m = 0; true;) { //заполнение массива по введёной строчке

            if (i == (arraySize)) {
                i = 0;
                j++;
            }

            if (j == arraySize) {
                break;
            }

            arrayOut[j][i] = inArrayInt[m];
            m++;

            if (m == inArrayInt.length) {
                break;
            }

            i++;

        }

        int summQ = 0;
        for (int i = 0; i < arraySize/2; i++) {
            for (int j = 0; j < arraySize/2; j ++) {
                summQ += arrayOut[i][j];
            }
        }

        int summW = 0;
        for (int i = 0; i < arraySize/2; i++) {
            for (int j = arraySize/2; j < arraySize; j ++) {
                summW += arrayOut[i][j];
            }
        }

        int summE = 0;
        for (int i = arraySize/2; i < arraySize; i++) {
            for (int j = 0; j < arraySize/2; j ++) {
                summE += arrayOut[i][j];
            }
        }

        int summR = 0;
        for (int i = arraySize/2; i < arraySize; i++) {
            for (int j = arraySize/2; j < arraySize; j ++) {
                summR += arrayOut[i][j];
            }
        }

        Service.printMatrix(arrayOut);
        System.out.println(summQ);
        System.out.println(summW);
        System.out.println(summE);
        System.out.println(summR);
    }

}
