package Lab_3;

import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amountNumbersIn = Integer.parseInt(scan.nextLine());

        int numberMax = 0;
        int numberAmount = 0;

        while (numberAmount < amountNumbersIn) {
            int inNumber = scan.nextInt();
            numberAmount++;
            if ((inNumber > numberMax) && (inNumber % 3 == 0)) {
                numberMax = inNumber;
            }
        }

        System.out.println(numberMax);
    }
}
