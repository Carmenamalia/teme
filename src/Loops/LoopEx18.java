package Loops;

import java.util.Scanner;

// Scrie un program care sa printeze urmatorul pattern, in functie de numar n citit de la tastatura.

public class LoopEx18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                System.out.println("moo");
            }

        }
    }
}
