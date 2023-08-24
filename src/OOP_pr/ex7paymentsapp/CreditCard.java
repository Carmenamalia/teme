package OOP_pr.ex7paymentsapp;

public class CreditCard extends Card implements Payable {
   final int maxOverDraft; //- nu se va putea schimba valoarea acestui atribut

    public CreditCard(boolean isActive, String PIN, String cardNumber, String cardHolderName, double cardBalance, int maxOverDraft) {
        super(isActive, PIN, cardNumber, cardHolderName, cardBalance);
        this.maxOverDraft = maxOverDraft;
    }


// Metode:
    //- nu se va putea plăti mai mult decât cardBalance + maxOverDraft

    @Override
    public double pay(double amount) {
        if (amount <= getCardBalance() + maxOverDraft) {
            return setCardBalance(getCardBalance() - amount);
        }
        return 0;
    }


}
