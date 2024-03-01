package Lab_7;

import java.util.Arrays;
import java.util.Scanner;

public class NumberTwoL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][4];
        String str = scanner.nextLine();
        char asa = str.charAt(0);
        String asas = String.valueOf(asa);
//        for (int i = 0; i < args.length; i++){
//            arr[i] =
//        }
        int xIndex = 0;
        int yIndex = 0;
        int sc = 0;
        for (int[] x : arr) {
            arr[yIndex][xIndex] = Integer.parseInt(String.valueOf(str.charAt(sc)));
            sc += 2;
            xIndex += 1;

            if (xIndex > 3) {
                xIndex = 0;
                yIndex += 1;
            }
            for (int y : x) {
//                System.out.print(y + "\t"); //todo лишние прбела
                System.out.print(x);
            }
            System.out.println();
        }
        System.out.println(asas);
    }
}
