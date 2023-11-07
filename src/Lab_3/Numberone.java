package Lab_3;

import java.util.Scanner;

public class Numberone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        while (!((number >= -500) && (number <= 100) || (number >= 500) && (number <= 1000))){
            System.out.println("Not_yet");
            number = scan.nextInt();
        }

        System.out.println("Correct_number_" + number);
    }
}