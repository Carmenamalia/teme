package OOP_pr.ex7paymentsapp;

public class ShoppingAccount extends Adress {
    String[] cardList; //- o listă de carduri
    String[] addressList; //- o listă de adrese
    String firstName;
    String lastName;
    Card currentPaymentMethod; //- poate fi de fapt un CreditCard sau un DebitCard
   Adress currentBillingAddress;

    public ShoppingAccount(String street, int number, String city, String firstName, String lastName, Card currentPaymentMethod) {
        super(street, number, city);
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentPaymentMethod = currentPaymentMethod;
    }

    public ShoppingAccount(String street, int number, String city) {
        super(street, number, city);
    }
    // Metode:
    //addPaymentMethod(){}
    //addAddress(){}
    //removePaymentMethod(){}
    //removeAddress(){}
    //selectPaymentMethod(String cardNumber){} //- setează currentPaymentMethod în funcție de numărul de card primit ca și parametru
    //selectAddress(String street){} //- setează currentBillingAddress în funcție de strada primită ca și parametru
    //generateInvoice(amount, address, card){} //- se va printa un mesaj în funcție de suma, cardul și adresa cu care a fost făcută tranzacția
    // (de exemplu: “Nume: Olimpiu Stefan. Ați plătit suma 2300 RON folosind cardul cu numărul 1234 1234 1234 1234 pentru
    // adresa: str. Republicii, nr. 12, Cluj-Napoca”)

}
