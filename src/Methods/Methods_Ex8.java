package Methods;

import java.util.Scanner;

/* Aplicatia va trebui sa imparta nota pentru 2 oameni, in functie de valoarea notei de plata,
 taxele adaugate, si bacsis.
Se va citi de tastatura valoarea notei de plata, valoarea taxelor, si valoarea bacsisului.
Valoarea notei de plata va reprezenta cati lei costa, insa valoarea taxelor si a bacsisului
vor fi introduse ca procente.
Taxele trebuie adaugate la suma totala inainte sa fie adaugat bacsisul.
Trebuie sa calculezi jumatate din suma totala, incluzand valoarea notei, taxele si bacsisul.
Creeaza o metoda pentru a face acest calcul.

 */
public class Methods_Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cat e nota de plata?");
        double bill = scanner.nextDouble();
        System.out.println("Cat e TVA?");
        double tax = (bill * 15) / 100;
        System.out.println(tax);
        System.out.println("Cat e bacsisul?");
        double tip = ((bill + tax) * 10)/100;
        System.out.println(tip);
       // double splitBill = splitBill(bill,tax,tip);
        System.out.println(splitBill(bill,tax,tip));

    }

    public static double splitBill(double bill,double tax,double tip) {
        System.out.println("cat plateste fiecare?");
        double splitBill = (bill + tax + tip)/2;
        return splitBill;

    }

}
