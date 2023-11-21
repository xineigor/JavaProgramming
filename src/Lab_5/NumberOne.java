package Lab_5;

import java.util.Scanner;

public class NumberOne {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        area(scan.nextInt(), scan.nextInt(),scan.nextInt(),scan.nextInt());

        System.out.println();

    }

    static double area (int a, int b, int c, int d) {
        float r = (float) Math.sqrt(Math.pow((a - c),2) + Math.pow((b - d), 2));

        float pl = (float) (Math.PI * 2 * r);

        return pl;
    }
}
