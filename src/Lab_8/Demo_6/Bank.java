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

            if (line.equalsIgnoreCase("End")) {
                break;
            }

            if (line.equalsIgnoreCase("Create")) {
                numberAccounts++;
                accounts[numberAccounts-1] = new BankAccount();
                System.out.println("Account " + "ID" + numberAccounts + " created");
                continue;
            }

            if (numberAccounts > 100) {
                System.out.println("Maximum accounts");
                break;
            }

            if (line.matches("(2i)Add Deposit.*")) {
                String[] arrayValuesDeposit = line.split(" ");
                tempId = Integer.parseInt(arrayValuesDeposit[2]);
                tempDeposit = Integer.parseInt(arrayValuesDeposit[3]);

                if (tempId > numberAccounts) {
                    System.out.println("Account ID"+tempId+" does not exist");
                    continue;
                }

                accounts[tempId - 1].deposit(tempDeposit);
                System.out.println("Deposited " + tempDeposit + " to " + "ID" + tempId);
                continue;
            }

            if (line.matches("Set Interest.*")) {
                String[] arrayValuesInterest = line.split(" ");
                BankAccount.setInteresetRate(Integer.parseInt(arrayValuesInterest[2]));
                System.out.println("Change Interest Rate");
                continue;
            }

            if (line.matches("Get Interest.*")) {
                String[] arrayValuesGetInterest = line.split(" ");
                tempId = Integer.parseInt(arrayValuesGetInterest[2]);

                if (tempId > numberAccounts) {
                    System.out.println("Account ID"+tempId+" does not exist");
                    continue;
                }

                System.out.println(accounts[tempId - 1].getInterest(Integer.parseInt(arrayValuesGetInterest[3])));
                continue;
            }

            else {
                System.out.println("Re-enter!");
            }

        }
    }
}
