package Lab_4;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inn = 0;
        boolean is_simple;
        int del_count = 0;
        int i = 1;
        //del_count = 0;
        int all_sum = 0;
        int all_mult = 0;

        while (true){
            inn = scan.nextInt();

            if (inn == 0){
                break;

            }

            while (true){
                if (inn % i == 0){
                    del_count += 1;
                }

                i++;

                if (i > inn){
                    if (del_count == 2){
                        all_sum += inn;
                    }
                    if (del_count > 2) {
                        all_mult += inn;
                    }

                    del_count = 0;
                    break;
                }

            }
            //break;
        }

        System.out.println(all_sum);
        System.out.println(all_mult);
    }
}
