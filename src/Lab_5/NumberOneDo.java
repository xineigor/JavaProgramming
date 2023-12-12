package Lab_5;

import java.util.Scanner;

public class NumberOneDo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int d = Integer.parseInt(scan.nextLine());

        System.out.println(area(a, b, c, d));
        System.out.printf("%.2f", area(a, b, c, d) * 17 * 17);
    }

    public static double area(int a, int b, int c, int d) {
        double r = Math.sqrt((c - a) * (c - a) + (d - b) * (d - b));
        return Math.PI * (r * r);
    }
}
