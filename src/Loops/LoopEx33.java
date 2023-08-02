package Loops;

import java.util.Scanner;

/* Printeaza o piramida din numere, in functie de un numar n citit de la tastatura.
De exemplu, pentru n = 4, se va printa:

   4                rand=4   4 coloane
  333
 22222
1111111
 */
public class LoopEx33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(n - i);
            }
            System.out.println();
        }

    }
}
