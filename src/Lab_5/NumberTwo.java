package Lab_5;

import java.util.Scanner;

public class NumberTwo {

    static int min = Integer.MAX_VALUE; // избавится

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        System.out.println(minimum(text));

    }

    public static int minimum(String text) {
        int index = text.indexOf(' ');

        if (index == 4) {
            return min;
        }

        String strOne = text.substring(index - 1, index);
        if (Integer.parseInt(strOne) < min) {
            min = Integer.parseInt(strOne);
        }



        return minimum(text.substring(index + 1));

    }
}
