package Strings;

import java.util.Scanner;

public class StringsEx11 {
    public static void main(String[] args) {
/*  Scrie un program care citeste de la tastatura numele complet al unui om si ii afiseaza initialele.
De exemplu, pentru String-ul "Stefan I. Olimpiu", se va afisa "SIO".
HINT: foloseste metoda split() pentru a "sparge" string-ul intr-un array a carui elemente sa fie toate numele din numele complet.
 */
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String[] splitName = name.split(" ");
        for (int i = 0;i< splitName.length;i++){
            System.out.print(splitName[i].charAt(0) + " ");
        }
    }
}
