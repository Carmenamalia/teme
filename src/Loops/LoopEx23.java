package Loops;

import java.util.Scanner;

//23. Scrie un program care sa afiseze factorialul unui numar.
public class LoopEx23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        for(int i = n;i >= 1;i--){
            fact = fact * i;
            System.out.print(" " + i);
            System.out.println();
        }
        System.out.println(n + " ! = " + fact);
    }
}
