package OOP_pr.ex7paymentsapp;

public abstract class Card {
    private boolean isActive;
    private String PIN;
    private String cardNumber;
    private String cardHolderName;
    private double cardBalance;

    public Card() {}

    public Card(boolean isActive, String PIN, String cardNumber, String cardHolderName, double cardBalance) {
        this.isActive = isActive;
        this.PIN = PIN;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardBalance = cardBalance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        if (PIN.length() == 4) {
            this.PIN = PIN;
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        if (cardNumber.length() == 16) {
            this.cardNumber = cardNumber;
        }
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public double setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
        return cardBalance;
    }

    //Metode:
    //- schimbă valoarea PIN-ului, dar doar dacă aceasta este o valoare formată din 4 cifre
    public void changePin(String newPIN){
        setPIN(newPIN);
    }

    //- face ca cardul să fie inactiv
    public void freezeCard(boolean inactive) {
        setActive(inactive);
    }
}
