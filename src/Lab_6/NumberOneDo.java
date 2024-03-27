package Lab_6; //Вариант 8

import java.util.Arrays;
import java.util.Scanner;

public class NumberOneDo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numbers = scan.nextLine();
        int sum = 0;
        int amount = 0;

        String[] numbersSplit = numbers.split(" ");

        for (String x : numbersSplit) {
            sum = sum + Integer.parseInt(x);
            amount += 1;
        }

        for (int i = 0; i < sum; i++) {
            numbersSplit = translit(numbersSplit); //todo избавится от пробела 1 2000001 показать в отчёте
        }

        System.out.println(sum);
        System.out.println(amount);

        for (String x : numbersSplit) {
            System.out.print(x + " ");
        }
    }

    public static String[] translit(String[] trans) {
        String[] extendedArray = new String[trans.length + 1];
        extendedArray = Arrays.copyOf(trans, trans.length + 1);
        extendedArray[extendedArray.length- 1] = extendedArray[0];
        String[] movedArray = Arrays.copyOfRange(extendedArray, 1 , extendedArray.length);
        return movedArray;
    }
}
