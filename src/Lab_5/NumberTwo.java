package Lab_5;

import java.util.Scanner;

public class NumberTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        System.out.println(findMin(text));
    }

    public static int findMin(String s) {
        int indexSpace = s.indexOf(" ");
        if (indexSpace == -1) {
            return Integer.parseInt(s);
        }

        String toSpace = s.substring(0, indexSpace);
        String afterSpace = s.substring(indexSpace + 1);

        int firstNumber = Integer.parseInt(toSpace);
        int secondNumber = findMin(afterSpace);
        return Math.min(firstNumber, secondNumber);
    }
}
