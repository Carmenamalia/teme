package Loops;

import java.util.Scanner;

//Scrie un program care sa afiseze suma numerelor de la 1 la n, n fiind citit de la tastatura.
public class LoopEx19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
            System.out.println(i +" " + sum);
        }
    }
}
