package Loops;

import java.util.Scanner;

//Scrie un program care sa afiseze numerele pare de la 1 la n, n fiind citit de la tastatura.
public class LoopEx20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
               // System.out.println(i);
                System.out.print(" " + i);
            }
        }
    }
}