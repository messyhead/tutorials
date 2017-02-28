// Chapter 6 - Intro to Objects

public class Account {
    static double interestRate = 5;
    private double balance;
    private String name;

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public Account() {

        this(50, "Tony McElroy");
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addInterest() {
        balance = balance + ((balance / 100) * interestRate);
    }

    public boolean withdraw() {
        return withdraw(20);
    }

    public boolean withdraw(double amount) {

        boolean withdrew = false;
        if ((balance-amount) > 0) {
            balance -= amount;
            withdrew = true;
            System.out.println("Withdrawal successful");
        } else
            System.out.println("Withdrawal unsuccessful - check your balance");
            return withdrew;
    }
}
