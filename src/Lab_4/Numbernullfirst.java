package Lab_4;

import java.util.Scanner;

public class Numbernullfirst {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.next());
        int finish = Integer.parseInt(scan.next());

        for (int i = start; i <= finish; i++ ) {
            if (i % 3 == 0) continue;
            if (i == 17) continue;
            sum += i;
        }

        System.out.println(sum);
    }
}
