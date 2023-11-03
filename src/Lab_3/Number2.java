package Lab_3;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount_numbers = Integer.parseInt(scan.nextLine());

        int number_max = 0;
        int number = 0;

        while (number < amount_numbers) {
            int inn = scan.nextInt();
            number++;
            if ((inn > number_max) && (inn % 3 == 0)) {
                number_max = inn;
            }
        }

        System.out.println(number_max);
    }
}
