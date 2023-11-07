package Lab_3;

import java.util.Scanner;

public class Numbernullsecond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limit = Integer.parseInt(scan.nextLine());

        int pow = 0;
        int power = 1;
        while (limit >= power * 2){
            power *= 2;
            pow += 1;
        }


        System.out.println(power + " " + pow);
    }
}
