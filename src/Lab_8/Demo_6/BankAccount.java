package Lab_8.Demo_6;

public class BankAccount {
    private final static double DEFALUT_INTEREST_RATE = 0.02;
    private static double interesetRate = DEFALUT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    private int id;
    private double balance;

    public BankAccount() {
        this.id = bankAccountCount++;
    }

    public static void setInteresetRate(double interesetRate) {
        BankAccount.interesetRate = interesetRate;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    double getInterest(int years) {
        return BankAccount.interesetRate * years * this.balance;
    }
}
