package Prac;
import java.util.Scanner;

public class Wit {
    public static void main(String[] args) {
        int[] mass = enterArray();
        int size = mass.length;
        int temp = mass[0];

        int k = 1;
        int i = 1;
        while (i < size) {

            if (mass[i] > temp) {
                temp = mass[i];
                k = 1;
            }

            else {

                if (mass[i] == temp) {

                    k = k + 1;

                }

            }

            i = i + 1;

        }

        System.out.println(temp);
        System.out.println(k);
        
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