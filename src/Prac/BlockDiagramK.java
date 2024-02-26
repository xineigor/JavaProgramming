package Prac;

import java.util.Scanner;

public class BlockDiagramK {
    public static int[] enterArray() {
        Scanner scan = new Scanner(System.in);

        int amountNumbers = scan.nextInt();
        int[] numbersArray;
        int size = amountNumbers * 2;
        numbersArray = new int[amountNumbers * 2];
        int i = 0;
        while (i < size) {
            int temp = scan.nextInt();
            numbersArray[i] = temp;
            i = i + 1;

        }
        return numbersArray;

    }

    public static void main(String[] args) {
//        for (int x : BlockDiagramK.enterArray()) {
//            System.out.println(x);
//        }
        int[] mass = BlockDiagramK.enterArray();
        int size = mass.length;
        int temp = mass[0];
        int k = 1;
        int i = 1;

        while (i < size) {
            if (mass[i] > temp) {
                temp = mass[i];
                k = 1;

            }

            if (mass[i] == temp) {
                k = k + 1;
            }
            i = i + 1;
        }

        System.out.println(temp);  //макс число
        System.out.println(k); //сумма повторяющихся

    }
}
