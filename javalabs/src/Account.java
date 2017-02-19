// Chapter 6 - Intro to Objects

public class Account {
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

    private double balance;
    private String name;


    public void addInterest() {
        balance = balance + ((balance / 100) * 10);
    }

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public Account() {
        this(50,"Tony McElroy");
    }
}
