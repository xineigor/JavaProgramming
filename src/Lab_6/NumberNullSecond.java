package Lab_6;

import java.util.Scanner;

public class NumberNullSecond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");
        int[] numbers = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            numbers[i] = Integer.parseInt(words[i]);
        }

        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }

        int sumClassNumber = 0;
        for (int i = 0; i < words.length; i++) {
            if (numbers[i] % 17 == 0) {
                sumClassNumber += numbers[i];
            }
        }

        System.out.println(sum);
        System.out.println(sumClassNumber);
    }
}
