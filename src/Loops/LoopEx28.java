package Loops;

import java.util.Scanner;

/*Printeaza cealalta jumatate de piramida, in functie de un numar n citit de la tastatura.
       #
      ##
     ###
    ####
   #####
 */
public class LoopEx28 {
    /* pentru n=5
    4 pauze + 1 #    printam n-i - 1 spatii  si printam i+1 diezi
    3 pauze + 2 #
    2 pauze + 3 #
    1 pauza + 4 #
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0;j <= i;j++){
                System.out.print("#");
            }System.out.println();
        }

    }
}
