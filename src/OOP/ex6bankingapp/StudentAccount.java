package OOP.ex6bankingapp;

public class StudentAccount extends BankAccount{

    private final int maxDepositAmount;

    public StudentAccount(int balance, String accountNumber, int maxDepositAmount) {
        super(balance, accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    @Override
    public int withdraw(int amount) {
        return 0;
    }

    @Override
    public int deposit(int amount) {
        return 0;
    }
}
