package Lab_5;

import java.util.Scanner;

public class NumberTwo {
    static Scanner scan = new Scanner(System.in);
    int min = 0;

    public static void main(String[] args) {
        //String input = scan.nextLine();
        //String[] numbers = input.split(" ");

    }

    static int minimum(String a) {
        String[] numbers = a.split(" ");
        int q = 0;
        int min = 0;
        int minm = 99999;

        while (true) {
            min = Integer.parseInt(numbers[q]);
            q += 1;
            if (min < minm) {
                minm = min;
            }


        }

    }

}
}
