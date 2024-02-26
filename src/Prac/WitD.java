package Prac;
import java.util.Scanner;

public class WitD {
    public static void main(String[] args) {

        int[] mass = enterArray();
        int size = mass.length;
        int s = 0;
        int i = 0;
        while (i < size) {

            if (mass[i] > 0) {
                s += mass[i];
            }

            i += 1;
        }
        System.out.println(s);
    }

    public static int[] enterArray() {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int size = 2 * n;
        int[] array = new int[size];

        int i = 0;

        while (i < size) {
            int temp = Integer.parseInt(scanner.nextLine());
            array[i] = temp;
            i += 1;
        }

        return array;
    }
}