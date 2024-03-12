package Lab_8.Demo_6;

import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class Bank {
    public static BankAccount[] accounts = new BankAccount[100];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberAccounts = 0;
        int tempId;
        int tempDeposit;
        while (true) {
            String line = scan.nextLine();

            if (line.equals("End")) {
                break;
            }

            if (line.equals("Create")) {
                numberAccounts++;
                accounts[numberAccounts-1] = new BankAccount();
                System.out.println("Account " + "ID" + numberAccounts + " created");
            }

            if (line.matches("Add Deposit.*")) {
                String[] arrayValuesDeposit = line.split(" ");
                tempId = Integer.parseInt(arrayValuesDeposit[2]);
                tempDeposit = Integer.parseInt(arrayValuesDeposit[3]);

                if (tempId > numberAccounts) {
                    System.out.println("Account ID "+tempId+" does not exist");
                    continue;
                }

                accounts[tempId - 1].deposit(tempDeposit);
                System.out.println("Deposited " + tempDeposit + " to " + "ID" + tempId);
            }

            if (line.matches("Set Interest.*")) {
                String[] arrayValuesInterest = line.split(" ");
                BankAccount.setInteresetRate(Integer.parseInt(arrayValuesInterest[2]));
            }

        }
    }
}
