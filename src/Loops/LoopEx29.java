package Loops;

import java.util.Scanner;

/*Printeaza jumatate de piramida rasturnata, in functie de un numar n citit de la tastatura.
#####
####
###
##
#
 */
public class LoopEx29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
