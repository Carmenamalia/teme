package OOP.ex6bankingapp;

public class Client {

    private String firstName;
    private String lastName;

    private BankAccount[] accounts;

    private int numberOfAccounts;


    public boolean addAccount(BankAccount account){
        return true;
    }

    public void listAccounts(){

    }

    public int deposit (int amount, String accountNumber){
        //caut in accounts contul cu numarul account number
        //depozitez in el suma de bani amount
        return 0;
    }

    //withdraw e la fel ca deposit

    public void checkAccountDetails (String accountNumber){

    }

}
