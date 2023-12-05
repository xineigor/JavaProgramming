package Lab_1;

import java.util.Scanner;

public class NumberNullSecond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char symbol = scan.next().charAt(0);
        symbol += 17;
        System.out.println(symbol);
    }
}
