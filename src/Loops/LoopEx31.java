package Loops;

import java.util.Scanner;

/*  Afiseaza laturile unui partrat forma din "*", cu latura de lunigime n, n fiind citit de la tastatura.
De exemplu, pentru n = 5, se va printa:

* * * * *      i=0 printeaza 5 "*"
*       *       i=1 print 1"*" + 4" " + 1"*"
*       *
*       *
* * * * *
 */
public class LoopEx31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //daca j e prima pozitie sau ultima
                // si i diferit de 0 sau i este 0
// si j nu este pe ultima pozitie sau  i este pe ultima pozitie

                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}