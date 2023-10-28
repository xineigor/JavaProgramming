package Lab_1;

import java.util.Scanner;

public class Number0_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char symbol = scan.next().charAt(0);

        System.out.println(symbol + 17);
        scan.close();
    }
}
