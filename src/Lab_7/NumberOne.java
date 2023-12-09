package Lab_7;

import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int R = Integer.parseInt(scan.nextLine());
        int C = Integer.parseInt(scan.nextLine());

        int matrix[][] = new int[R][C];

        

        for(int[] x : matrix){
            System.out.println();
            for(int y: x){
                System.out.print(y + " ");
            }
        }
    }
}
