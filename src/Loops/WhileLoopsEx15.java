package Loops;

import java.util.Scanner;

/* Presupunem ca o masina vinde sticle de cola care costa 50 de centi si accepta doar urmatoarele monede:
 25 de centi, 10 centi si 5 centi.
Implementeaza un program care ii cere utilizatorului sa introduca cate o moneda pe rand, si de fiecare data
 il informeaza cat mai are de platit pana la cei 50 de centi.
O data ce utilizatorul a introdus minim 50 de centi, afiseaza cati centi trebuie sa primeasca rest.
Ca si simulam introducerea monedelor, vom citi de la tastatura numere reprezetand valoarea monedelor.
 */
public class WhileLoopsEx15 {
    public static void main(String[] args) {
//o cola costa 50 centi    int colaBottle = 50;
//introdu o moneda pe rand,de fiecare data verific cat mai are pana la 50
//doar monede de 25 || 10 ||5   boolean isValidCoin =?
//daca a introdus <50 verific   cati centi si socotesc cat mai e pana la 50
//daca a introdus > 50 afisez cat trebuie sa primeasca rest : cat a introdus - 50
        Scanner scanner = new Scanner(System.in);
        int colaBottle = 50;
        int partialAmount = 0;
        int insertCoin = 0;
        while (partialAmount < colaBottle) {
            System.out.println("introdu o moneda");
            do {
                insertCoin = scanner.nextInt();
            } while (insertCoin != 5 && insertCoin != 10 && insertCoin != 25);
            partialAmount = partialAmount + insertCoin;//fac suma
            if (colaBottle - partialAmount > 0) {
                System.out.println("mai trebuie sa introduci " + (colaBottle - partialAmount) + " centi");
            }
        }
        System.out.println("vei primi rest: " + (colaBottle - partialAmount) + "centi");
    }
}
