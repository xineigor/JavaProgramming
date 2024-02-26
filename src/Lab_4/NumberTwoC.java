package Lab_4;

import java.util.Scanner;

public class NumberTwoC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean check = true;
        String destinationCountry = scan.nextLine();
        int travelBudget = scan.nextInt();
        int wallet = 0;

        while (check) {

            String thing = scan.nextLine();
            if (thing.equals("stop")) {
                break;
            }


            if (thing.matches("[0-9]+")) {
                wallet += Integer.parseInt(thing);
            }

            if ((wallet >= travelBudget) && (!(destinationCountry.equals(" ")))) {
                System.out.println("Going to " + destinationCountry);
                wallet = 0;
                destinationCountry = " ";
                travelBudget = Integer.MAX_VALUE;
            }

            if (thing.matches("[a-zA-Z]+") && (destinationCountry == " ")) {
                destinationCountry = thing;
                travelBudget = scan.nextInt();
            }

        }
    }
}
