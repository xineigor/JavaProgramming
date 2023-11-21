package Lab_4;

import java.util.Scanner;

public class NumberNullSecond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.next());
        int finish = Integer.parseInt(scan.next());
        int sum = 0;
        long fc = 1;

        for (int i = start; i <= finish; i++) {

            if (i == 17){ continue; }

            int factorial = i;
            for (int j = factorial - 1; j > 0; --j) {
                factorial *= j;
            }

            sum += factorial;
        }

        for (long k = 2; k <= 17; k++) {
            fc = fc * k;
            System.out.println(fc);
        }

        System.out.println(fc);
        System.out.println(sum);
    }
}