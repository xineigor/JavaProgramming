package Lab_2;

import java.util.Scanner;

public class NumberNullFirst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int numberInGroup = number + 17;

        if (number % 2 == 0) {
            System.out.println("ever");
        } else {
            System.out.println("odd");
        }

        if (numberInGroup % 2 == 0) {
            System.out.println("for +17: ever");
        } else {
            System.out.println("for +17: odd");
        }
    }
}
