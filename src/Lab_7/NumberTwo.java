package Lab_7;

import java.util.Scanner;

public class NumberTwo {
    public static int arraySize;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        arraySize = scan.nextInt();

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

        String numbersString = scan.nextLine();

        int indexArrayX = 0;
        int indexArrayY = 0;
        int i = 0;
        int[][] returnArray = new int[arraySize][arraySize];
        int amountNumbers = numbersString.length() / 2;
        String temp;

        while (i < amountNumbers) {

            temp = numbersString.substring(i, i + 1);
            if (temp.equals(" ")){
                continue;
            }
//            System.out.println(temp);
            returnArray[indexArrayY][indexArrayX] = Integer.parseInt(temp);
            indexArrayX += 1;

            if (indexArrayX > arraySize - 1) {
                indexArrayX = 0;
                indexArrayY += 1;
            }

            i += 2;
            System.out.println(i);
        }

        return returnArray;
    }
}
