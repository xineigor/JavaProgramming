package Lab_7;

import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {
        int[][] mainArray = NumberTwo.enterArrayS();

        for (int[] x : mainArray) {
            System.out.println();
            for (int y : x) {
                System.out.print(y + "\t"); //todo лишние прбела
            }
        }
    }

    public static int[][] enterArrayS() {  //мето возвращающий из стрики через пробел чисел, массив
        Scanner scan = new Scanner(System.in); //todo вввести размерность массива вначале
        int arraySize = scan.nextInt();
        String numbersString = scan.nextLine();
        int indexArrayX = 0;
        int indexArrayY = 0;
        int i = 0;
        int[][] returnArray = new int[arraySize][arraySize];
        int amountNumbers = numbersString.length() / 2;
        String temp;

        while (i < amountNumbers * 2) {

            temp = numbersString.substring(i, i + 1);
            System.out.println(temp);
            returnArray[indexArrayY][indexArrayX] = Integer.parseInt(temp);
            indexArrayX += 1;

            if (indexArrayX > 3) {
                indexArrayX = 0;
                indexArrayY += 1;
            }

            i += 2;
        }

        return returnArray;
    }
}
