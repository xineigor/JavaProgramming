package Lab_4; //Вариант 3

import java.util.Scanner;

public class NumberOneDo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int delAmount = 0;
        int divNumber = 1;
        int allSum = 0;
        int allMult = 1;

        do {
            String innStr = scan.nextLine();
            innStr = innStr.toLowerCase();  //формат ignore caps

            if (innStr.equals("0") || innStr.equals("1") || innStr.contains("-") || innStr.contains("17")) {
                System.out.println("invalid");
                continue;
            }

            if (innStr.equals("stop")) {
                break;
            }

            int inn = Integer.parseInt(innStr);

            do {  //перебор делителей
                if (inn % divNumber == 0) {
                    delAmount += 1;
                }

                divNumber++;

                if (divNumber > inn) {
                    if (delAmount == 2) {  //при выходе из цикла по кол-ву делителей определяем в какую группу определить число
                        allSum += inn;
                    }
                    if (delAmount > 2) {
                        allMult *= inn;
                    }

                    delAmount = 0;
                    break;
                }

            } while (true);
        } while (true);

        if (allSum == 0) {    //формат вывод
            System.out.println("prime_undefined");
        } else {
            System.out.println("prime_" + allSum);
        }

        if (allMult == 0) {
            System.out.println("non_prime_undefined");
        } else {
            System.out.println("non_prime_" + allMult);
        }
    }
}
