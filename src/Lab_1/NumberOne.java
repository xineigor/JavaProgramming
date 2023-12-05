package Lab_1; //Вариант 7

import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = Double.parseDouble(scan.nextLine());

        System.out.println("Enter b:");
        double b = Double.parseDouble(scan.nextLine());

        System.out.println("Enter Option: ");
        double option = Double.parseDouble(scan.nextLine());

        double res = ((option + 2) / Math.sqrt(a * b)) - (Math.abs((a - option) / (2 * b)));
        //double resRound = Math.round(res * 100.0) / 100.0;

        System.out.printf("%.2f", res);

    }
}