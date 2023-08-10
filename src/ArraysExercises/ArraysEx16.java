package ArraysExercises;

import java.util.Scanner;

public class ArraysEx16 {
    public static void main(String[] args) {
 /* Esti programator si dezvolti un magazin online. Vrei sa ii arati utilizatorului care este cel mai apropiat pret
  (dintr-o lista de preturi) de bugetul utilizatorului.
Scrie un program care afiseaza cel mai apropiat element din array de un numar introdus de la tastatura, n.
Daca exista mai multe numere la fel de apropiate,se afiseaza oricare dintre ele. De exemplu, pentru n=12 si
 array-ul {1, 7, 3, 10, 9, 18, 0} se va afisa 10. De exemplu, pentru n=5 si array-ul {1, 7, 3, 10, 9, 18, 0}
  se va afisa 7 sau 3.
  *///care e diferenta minima dintre n si fiecare din numerele din array
        Scanner scanner = new Scanner(System.in);
        int[] prices = {1, 7, 3, 10, 9, 18, 0};
        int n = scanner.nextInt();
        int closestNumb = prices[0];
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int diff;//pot inlocui if-else cu int diff = Math.abs(prices[i] - n) si ne ia diferenta fara minus
            if (n > prices[i]) {
            diff = n - prices[i];
        }else{
            diff = prices[i] - n;
        }//adica scade intotdeauna din cel mai mare nr ^^
            if (diff < minDiff) {
                minDiff = diff;
               closestNumb =prices[i];
            }
        }
        System.out.println(closestNumb);
    }
}
