package OOP_intro.OOP__Ex_5;

import java.util.Scanner;

public class BankAccount {
    int currentSold;
    String currency;
    int maxWithdraw;

    public BankAccount() {
    }
//creez obiectul BankAccount
    public BankAccount(int currentSold, String currency, int maxWithdraw) {
        this.currentSold = currentSold;
        this.currency = currency;
        this.maxWithdraw = maxWithdraw;

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "currentSold=" + currentSold +
                ", currency='" + currency + '\'' +
                ", maxWithdraw=" + maxWithdraw +
                '}';
    }

    /* functionalitati:
     **retragerea unei anumite sume de bani (daca nu se depaseste limita maxima de retragere si daca exista suficienti bani)
     **depunerea unei anumite sume de bani
     **afisarea unui extras de cont cu situatia actuala a contului
     **afisarea limitei maxime de retragere din cont
     */
    public BankAccount getAccount() {   //introducem datele contului
        Scanner scanner = new Scanner(System.in);
        int currentSold = scanner.nextInt();
        scanner.nextLine(); // Consumăm linia goală rămasă în buffer//aici imi dadea o exceptie "InputMismatchException" de asta am introdus aceasta linie
        String currency = scanner.nextLine().toUpperCase();
        int maxWithdraw = scanner.nextInt();
        return new BankAccount(currentSold, currency, maxWithdraw);
    }

    public boolean getWithdraw(int withdraw) { //metoda pentru retragere
        printMaxWithdraw();
        if (withdraw <= maxWithdraw && currentSold > withdraw) { //retragerea nu trebuie sa depaseasca limita max si soldul curent
            currentSold -= withdraw; //din soldul curent scadem suma retrasa
            return true;
        } else {
            return false;
        }

    }

    public int depositSum(int depozit) { //metoda pentru depunere
        currentSold += depozit;  //la soldul curent adaug suma depozitata
        return currentSold;
    }

    public void printExtras(int withdraw, int depozit) {  
        System.out.println("Suma initiala: " + currentSold + currency);
        System.out.println("Retragere: " + getWithdraw(withdraw) + currency);
        System.out.println("Depunere: " + depositSum(depozit) + currency);
        System.out.println("Suma actuala: " + currentSold + currency);
    }

    public void printMaxWithdraw() {
        System.out.println("Limita maxima de retragere: " + maxWithdraw + " " + currency);
    }

}
