package Lab_4; //Вариант 3

import java.util.Scanner;

public class NumberOneDod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int minPrime = Integer.MAX_VALUE;

        int PrimeMult = 1;

        boolean check = true;

        while (check) {
            String xStr = scan.nextLine().toLowerCase();

            if (xStr.equals("stop")) {
                break;
            }

            if (!(xStr.matches("[0-9]+"))) {
                //System.out.println("invalid");
                continue;
            }

            if (xStr.equals("0") || xStr.equals("1") || xStr.contains("-") || xStr.contains("17")) {
                continue;
            }

            int x = Integer.parseInt(xStr);

            if (prime(x)) {
                if (x < minPrime) {
                    minPrime = x;
                }
            }

            if (!(prime(x))) {
                PrimeMult = PrimeMult * x;
            }
        }

        if (minPrime == Integer.MAX_VALUE) {
            System.out.println("prime_undefined");
        } else {
            System.out.println("prime_" + minPrime);
        }

        if (PrimeMult == 1) {
            System.out.println("non_prime_undefined");
        } else {
            System.out.println("non_prime_" + PrimeMult);
        }

    }

    public static boolean prime(int x) {
        int dc = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                dc += 1;
            }
        }

        return dc <= 2;
    }
}
