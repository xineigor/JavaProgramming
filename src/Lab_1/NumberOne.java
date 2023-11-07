package Lab_1;

import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scan.nextInt();

        System.out.println("Enter b:");
        double b = scan.nextInt();

        double res = ((17 + 2) / Math.sqrt(a * b)) - (Math.abs((a - 17) / (2 * b)));
        double res_round = Math.round(res * 100.0) / 100.0;

        System.out.println(res_round);

    }
}