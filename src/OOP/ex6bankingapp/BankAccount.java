package OOP.ex6bankingapp;

public abstract class BankAccount {


    private int balance;
    private String accountNumber;

    public BankAccount(int balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public abstract int withdraw (int amount);

    public abstract int deposit (int amount);
}
