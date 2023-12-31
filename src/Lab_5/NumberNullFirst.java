package Lab_5;

import java.util.Scanner;

public class NumberNullFirst {
    public static void main(String[] args) { //
        Scanner scan = new Scanner(System.in);
        voice(scan.nextInt());
    }

    static void  voice(int number) {
        System.out.println(
                switch (number){
                    case 1 -> "One";
                    case 2 -> "Two";
                    case 3 -> "Three";
                    case 4 -> "Four";
                    case 5 -> "Five";
                    case 6 -> "Six";
                    case 7 -> "Seven";
                    case 8 -> "Eight";
                    case 9 -> "Nine";
                    case 10 -> "Ten";
                    default -> "I'm tired";
                }
        );
    }
}
