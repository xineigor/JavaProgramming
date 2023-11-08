package Lab_1;

import java.util.Scanner;

public class NumberTwoChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tmp = 0;
        String line1 = scan.nextLine();
        char ch1 = scan.next().charAt(0);
        char ch2 = scan.next().charAt(0);

        int index1 = line1.indexOf(ch1);
        int index2 = line1.indexOf(ch2);

        if (index1 > index2) {   //проверка на правильный порядок индексов
            tmp = index1;
            index1 = index2;
            index2 = tmp;
        }

        String line2 = line1.substring(index1, index2 + 1).toUpperCase();
        System.out.println(line2);
    }
}
