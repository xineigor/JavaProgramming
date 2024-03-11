package Lab_8.Demo_6;

import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class Bank {
    public static BankAccount[] accounts = new BankAccount[100];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String line = scan.nextLine();

            if (line.equals("End")) {
                break;
            }

            if (line.equals("Create")) {
                BankAccount account = new BankAccount();
            }
        }

    }
}
