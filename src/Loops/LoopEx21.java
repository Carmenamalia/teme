package Loops;

import java.util.Scanner;

//Scrie un program care sa faca media tuturor numerelor consecutive de la x la y, unde x si y sunt citite de la tastatura.
public class LoopEx21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum = sum + i;
            System.out.println(i + " suma e " + sum + " media e " + sum / ((y - x) + 1));
        }
    }
}
