package Lab_4;

import java.util.Scanner;

public class Number0_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.next());
        int finish = Integer.parseInt(scan.next());
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            int factorial = i;
            for (int j = factorial -1; j > 0; --j) {
                factorial *= j;
            }

            sum += factorial;
        }
        System.out.println(sum);
    }
}
