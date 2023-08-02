package Conditionals;

import java.util.Scanner;

/*Citeste de la tastatura doua numere si afiseaza-l la consola pe cel mai mare dintre ele.
De exemplu, pentru valorie initiale:

int a = 13;
int b = 14;
programul ar trebui sa afiseze in consola valoarea 14

 */
public class If_Else_Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("care numar e mai mare");


        if (x >y) {
            System.out.println(x);
        } else System.out.println(y);

    }
}
