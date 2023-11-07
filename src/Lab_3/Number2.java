package Lab_3;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount_numbers_in = Integer.parseInt(scan.nextLine());

        int number_max = 0;
        int number_amount = 0;

        while (number_amount < amount_numbers_in) {
            int in_number = scan.nextInt();
            number_amount++;
            if ((in_number > number_max) && (in_number % 3 == 0)) {
                number_max = in_number;
            }
        }

        System.out.println(number_max);
    }
}
