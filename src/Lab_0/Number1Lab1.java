package Lab_0;

import java.util.Scanner;

public class Number1Lab1 {
    public static void main(String[] args) {
        double cost = 123.45 * 17;
        double discount = 0.95;

        Scanner scan = new Scanner(System.in);
        int passengers = scan.nextInt();

        double result = cost * passengers;
        result *= discount;
        System.out.printf("%.2f", result);
        scan.close();
    }
}