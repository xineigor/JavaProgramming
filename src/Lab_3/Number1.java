package Lab_3;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        while (!((x >= -500) && (x <= 100) || (x >= 500) && (x <= 1000))){
            System.out.println("Not_yet");
            x = scan.nextInt();
        }

        System.out.println("Correct_number_" + x);
    }
}