package Lab_4;

import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean check = true;
        String destinationСountry = scan.nextLine();
        int amountMoneyTrip = Integer.parseInt(scan.nextLine());


        String amountSavings = "0";

        int sumSavings = 0;




        while (check) {

            if (sumSavings >= amountMoneyTrip) {  //( if (amountSavings.matches("[a-zA-Z]+") || (sumSavings >= amountMoneyTrip))
                System.out.println("Going to " + destinationСountry);
                sumSavings = 0;
                destinationСountry = scan.nextLine();
                amountMoneyTrip = Integer.parseInt(scan.nextLine());

            amountSavings = scan.nextLine();

            sumSavings += Integer.parseInt(amountSavings);


            }


        }
    }
}
