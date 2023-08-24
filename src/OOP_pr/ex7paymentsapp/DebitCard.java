package OOP_pr.ex7paymentsapp;

public class DebitCard extends Card implements Payable {
    double maxTransactionAmount;
public DebitCard(){}
    public DebitCard(boolean isActive, String PIN, String cardNumber, String cardHolderName, double cardBalance, int maxTransactionAmount) {
        super(isActive, PIN, cardNumber, cardHolderName, cardBalance);
        this.maxTransactionAmount = maxTransactionAmount;
    }


// Metode:
    //- nu se va putea plăti mai mult decât maxTransactionAmount

    @Override
    public double pay(double amount) {
        if (amount <= maxTransactionAmount) {
         return    setCardBalance(getCardBalance() - amount);
        }
        return 0;
    }

    //changeTransactionLimit()- va da o nouă valoare atributului maxTransactionAmount
    public void changeTransactionLimit(double amount) {
        maxTransactionAmount = amount;
    }



}
