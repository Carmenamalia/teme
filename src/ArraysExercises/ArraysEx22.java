package ArraysExercises;

import java.util.Random;
import java.util.Scanner;

public class ArraysEx22 {
    public static void main(String[] args) {
        // Scrie un program care citeste de la tastatura un numar n, si genereaza un array bidimensional de marime n.
        //Fiecare element din array-ului bidimensional va fi un element generat random.
        Scanner scanner = new Scanner(System.in);
        System.out.print("randuri: ");
        int n = scanner.nextInt();
        System.out.print("coloane: ");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];//n randuri si m coloane
        Random rand = new Random();
        //generez arrayul :
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int element = rand.nextInt(50); // Generează un număr aleatoriu între 0 și 50
                array[i][j] = element;
            }
        }
        //afisez array-ul:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

    }
}
