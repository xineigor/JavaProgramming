package Lab_0;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char symbol = scan.next().charAt(0);

        System.out.println(symbol+17);
        scan.close();
    }
}
