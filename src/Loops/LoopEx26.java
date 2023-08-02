package Loops;

import java.util.Scanner;

/* Printeaza jumatate de piramida, in functie de un numar n citit de la tastatura.
#
##
###
####
#####
 */
public class LoopEx26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("#");

            }System.out.println();
        }
    }
}