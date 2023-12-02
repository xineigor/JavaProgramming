package Lab_6;  // Вариант 8

import java.util.Arrays;
import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstLine = scan.nextLine();
        String secondLine = scan.nextLine();
        int k = 0;
        int kk = 0;
        String[] firstLineSplit = firstLine.split(" ");
        String[] secondLineSplit = secondLine.split(" ");

        double pow = Math.pow((double) firstLineSplit.length, (double) secondLineSplit.length); //размер массива максимум совподений

        String[] suitableNumbers = new String[(int)pow];

        for (String i : firstLineSplit) {
            for (String j : secondLineSplit) {
                if (i.length() == j.length()) {

                    suitableNumbers[k] = i;
                    suitableNumbers[k + 1] = j; //записываем все повторения в массив
                    k += 2;
                }
            }
        }

        String[] suitableNumbersClear = Arrays.copyOf(suitableNumbers, k);

        for (int i = 0; i < suitableNumbersClear.length - 1; i++) {
            if (suitableNumbersClear[i + 1].equals(suitableNumbersClear[i])) {  //чистка массива от дубликатов
                suitableNumbersClear[i] = "nn";
            }
        }

        for (String x : suitableNumbersClear) {
            if (!(x.equals("nn"))) {
                System.out.print(x + " ");
            }

        }

    }
}
