package Lab_1;

import java.util.Scanner;

public class NumberTwoChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tmp = 0;
        String lineOne = scan.nextLine();
        char chOne = scan.next().charAt(0);
        char chTwo = scan.next().charAt(0);

        int indexOne = lineOne.indexOf(chOne);
        int indexTwo = lineOne.indexOf(chTwo);

        if (indexOne > indexTwo) {   //проверка на правильный порядок индексов
            tmp = indexOne;
            indexOne = indexTwo;
            indexTwo = tmp;
        }

        String lineTwo = lineOne.substring(indexOne, indexTwo + 1).toUpperCase();
        System.out.println(lineTwo);
    }
}
