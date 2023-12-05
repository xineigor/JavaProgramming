package Lab_6;

import java.util.Scanner;

public class NumberNullFirst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            int digit = Integer.parseInt(scan.nextLine());
            numbers[i] = digit;
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
