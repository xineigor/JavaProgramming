package Lab_4;

import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int del_amount = 0;
        int div_number = 1;
        int all_sum = 0;
        int all_mult = 0;

        while (true) {
            String inn_str = scan.nextLine();
            inn_str = inn_str.toLowerCase();  //формат ignore caps

            if (inn_str.equals("0") || inn_str.equals("1") || inn_str.contains("-") || inn_str.contains("17")) {
                System.out.println("invalid");
                continue;
            }

            if (inn_str.equals("stop")) {
                break;
            }

            int inn = Integer.parseInt(inn_str);

            while (true) {  //перебор делителей
                if (inn % div_number == 0) {
                    del_amount += 1;
                }

                div_number++;

                if (div_number > inn) {
                    if (del_amount == 2) {  //при выходе из цикла по кол-ву делителей определяем в какую группу определить число
                        all_sum += inn;
                    }
                    if (del_amount > 2) {
                        all_mult += inn;
                    }

                    del_amount = 0;
                    break;
                }

            }
        }

        if (all_sum == 0) {    //формат вывод
            System.out.println("prime_undefined");
        } else {
            System.out.println("prime_" + all_sum);
        }

        if (all_mult == 0) {
            System.out.println("non_prime_undefined");
        } else {
            System.out.println("non_prime_" + all_mult);
        }
    }
}
