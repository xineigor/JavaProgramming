package Lab_6;  // Вариант 8

import java.util.Scanner;

public class NumberTwoDo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstLine = scan.nextLine();
        String secondLine = scan.nextLine();
        int k = 0;
        String set = "";
        String suitableNumbers = "";

        String[] firstLineSplit = firstLine.split(" ");
        String[] secondLineSplit = secondLine.split(" ");

        for (String i : firstLineSplit) {
            for (String j : secondLineSplit) {
                if (i.length() == j.length()) {

                    suitableNumbers = suitableNumbers + i + " ";
                    suitableNumbers = suitableNumbers + j + " "; //записываем все повторения в строку
                    k += 2;
                }
            }
        }

        String[] suitableNumbersClear = suitableNumbers.split(" ");

        for (String x : suitableNumbersClear) {
            if (!(set.contains(x))){   //псевдо set
                set = set + x + " ";
            }
        }

        String[] sets = set.split(" ");

        for (String x : sets) {
            System.out.print(x + " "); //todo пробел в конце
        }

    }
}
