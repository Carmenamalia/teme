package Loops;

import java.util.Scanner;
// Scrie un program care sa afiseze numerele de la 1 la n, n fiind citit de la tastatura.

public class LoopEx17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }


    }
}
