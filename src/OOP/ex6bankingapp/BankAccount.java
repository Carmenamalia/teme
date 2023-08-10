package OOP.ex6bankingapp;

public abstract class BankAccount {


    int balance;
    String accountNumber;

    public BankAccount(int balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public abstract int withdraw (int amount);

    public abstract int deposit (int amount);
}
