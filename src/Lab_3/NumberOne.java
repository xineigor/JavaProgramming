package Lab_3; //Вариант 5

import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Option: ");
        int option = Integer.parseInt(scan.nextLine());

        int number = scan.nextInt();

        while (!((number >= (-5 * option)) && (number <= (1 * option)) || (number >= (5 * option)) && (number <= (10 * option)))) {
            System.out.println("Not_yet");
            number = scan.nextInt();
        }

        System.out.println("Correct_number_" + number);
    }
}