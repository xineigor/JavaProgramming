package Lab_5;

import java.util.Scanner;

public class NumberTwoDoF {

    // 5 4 -1 проверить строчку
    //static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine() + " ";

        System.out.println(minimum(text, Integer.MAX_VALUE)); //todo от статической избавится парсинг


    }
    //static int min = Integer.MAX_VALUE;
    public static int minimum(String text, int min) { //передаётся также min

        int index = text.indexOf(' ');

        if (index == -1) {
            return min;
        }

        String strOne = text.substring(0, index);  // todo в мтеод value

        if (!(strOne.matches("[0-9]"))){
            if (!(strOne.contains("-"))){
                String textNext = text.substring(index + 1);
                return minimum(textNext, Integer.MAX_VALUE);
            }
        }


        if (Integer.parseInt(strOne) < min) {
            min = Integer.parseInt(strOne);
        }

        String textNext = text.substring(index + 1);
        return minimum(textNext, Integer.MAX_VALUE);

    }
}
