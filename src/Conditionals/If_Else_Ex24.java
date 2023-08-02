package Conditionals;
/* Citeste de la tastatura 3 numere si afiseaza in consola cel mai mare(maximul)
si cel mai mic (minimul) dintre cele 3 numere.
 */

import java.util.Scanner;

public class If_Else_Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        //a>b>c
        if (a - b >=1 && b- c >= 1) {
            System.out.println("maximul este: " + a);
            System.out.println("minimul este: " + c);
            //b>a>c
        } else if (b - a>=1 && a - c >= 1) {
            System.out.println("maximul este: " + b);
            System.out.println("minimul este: " + c);
            //c>a>b
        } else if (c - a>=1 && a - b >= 1) {
            System.out.println("maximul este: " + c);
            System.out.println("minimul este: " + b);
            //c>b>a
        } else if (c - b >=1 && b- a >= 1) {
            System.out.println("maximul este: " + c);
            System.out.println("minimul este: " + a);
            //a>c>b
        } else if (a - c >=1 && c- b >= 1) {
            System.out.println("maximul este: " + a);
            System.out.println("minimul este: " + b);
            //b>c>a
        } else if (b - c >=1 && c- a >= 1) {
            System.out.println("maximul este: " + b);
            System.out.println("minimul este: " + a);
        }

    }
}
