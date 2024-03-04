package Lab_7;

import java.util.Scanner;

public class NumberTwo {
    public static int arraySize;
//    public static int sumElementsPartO = 0;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        arraySize = scan.nextInt();

        int[][] mainArray = NumberTwo.enterArrayS();

        int sumElementsPart = 0;

//        for (int i = 0; i < arraySize; i++) {
//            sumElementsPart += mainArray[0][0];
//            sumElementsPart += mainArray[0][arraySize/2-1];
//            sumElementsPart += mainArray[1][0];
//            sumElementsPart += mainArray[2]
//
//        }

        for (int[] x : mainArray) {
            System.out.println();
            for (int y : x) {
                System.out.print(y + "\t"); //todo лишние прбела
            }
        }

//        System.out.println(sumElementsPartO);
    }

    public static int[][] enterArrayS() {  //мето возвращающий из стрики через пробел чисел, массив
        Scanner scan = new Scanner(System.in); //todo вввести размерность массива вначале

        String numbersString = scan.nextLine();
        int sumElementsPartT = 0;


        int indexArrayX = 0;
        int indexArrayY = 0;
        int numberSpaces = 0;
        int i = 0;
        int[][] returnArray = new int[arraySize][arraySize];
        int amountNumbers = numbersString.length();
        String tempT;

        while (i < amountNumbers) {

            if (numberSpaces > (arraySize * arraySize) - 1) {
                break;
            }

            tempT = numbersString.substring(i, i + 1);

//            if (temp.equals(" ")){
//                numberSpaces += 1;
////                if (numberSpaces == ((arraySize/2) * (arraySize/2))) {
////                    sumElementsPartO = sumElementsPartT;
////                    sumElementsPartT = 0;
////                }
//
//                i += 1;
//                continue;
//            }

//            while (!(tempT.equals(" "))){
//
//            } ??? todo считывание двузначных чисел
//            sumElementsPartT = Integer.parseInt(numbersString.substring(i, i + 1));
////            System.out.println(temp);

            returnArray[indexArrayY][indexArrayX] = Integer.parseInt(tempT);
            indexArrayX += 1;

            if (indexArrayX > arraySize - 1) {
                indexArrayX = 0;
                indexArrayY += 1;
            }

            i += 1;
//            System.out.println(i);
        }

        return returnArray;
    }
}
