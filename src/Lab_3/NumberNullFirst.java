package Lab_3;

import java.util.Scanner;

public class NumberNullFirst {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int enter = 0;

        do {
            sum += enter;
            enter = Integer.parseInt(scan.nextLine());
        } while (enter <= 17);
        System.out.println(sum);  //суммировать только положительные
    }
}
