package Loops;

import java.util.Scanner;

/* Printeaza o piramida cu un spatiu in mijloc, in functie de un numar n citit de la tastatura.
De exemplu, pentru n = 5, se va printa:

       # #
      ## ##
     ### ###
    #### ####
   ##### #####
 */
public class LoopEx32_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int j;
            for (j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (j = n; j <= n - i; j++) {
                System.out.print("#");
                if (j == n) {
                    System.out.print("*");
                }
//                for (int k = n + 1; k < 2 * n - j; j++) {
//                    System.out.print("#");
//                }

                System.out.println();
            }
        }
//    }
//}
    }
}