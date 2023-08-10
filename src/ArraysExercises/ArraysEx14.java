package ArraysExercises;

import java.util.Scanner;

public class ArraysEx14 {
    public static void main(String[] args) {
 /*  Scrie un program care afiseaza produsul a cate 2 numere consecutive din array.
Daca numarul de elemente este impar, ultimul produs va fi numarul insusi.
De exemplu, pentru {1, 7, 3, 10, 9}, se va afisa in consola 7, 30, 9.
Explicatie: (7 = 1 * 7, 30 = 3 * 10, 9 = 1 * 9)\
  */
        Scanner scanner = new Scanner(System.in);
        System.out.println("cate elemente va avea array-ul");
        int n = scanner.nextInt();
        int[] list = new int[n];
        System.out.println("introdu elementele array-ului");
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }
        for (int i = 0; i < list.length; i += 2) {
            if (i < list.length - 1) {
                System.out.println(list[i] * list[i + 1]);
            }
            if (list.length % 2 != 0 && i == list.length - 1) {
                System.out.println(list[i]);
            }
        }

    }
}