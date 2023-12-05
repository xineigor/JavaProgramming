package Lab_5;

import java.util.Scanner;

public class NumberTwoDo {

    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine() + " ";

        System.out.println(minimum(text));

    }

    public static int minimum(String text) {
        int index = text.indexOf(' ');

        if (index == -1) {
            return min;
        }

        String strOne = text.substring(0, index);

        if (!(strOne.matches("[0-9]"))){
            if (!(strOne.contains("-"))){
                String textNext = text.substring(index + 1);
                return minimum(textNext);
            }
        }


        if (Integer.parseInt(strOne) < min) {
            min = Integer.parseInt(strOne);
        }

        String textNext = text.substring(index + 1);
        return minimum(textNext);

    }
}
