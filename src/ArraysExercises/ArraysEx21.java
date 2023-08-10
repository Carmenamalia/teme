package ArraysExercises;

import java.util.Scanner;

public class ArraysEx21 {
    public static void main(String[] args) {
    /*Scrie un program care sa gaseasca toate perechile de elemente dintr-un array, a caror suma este egala
    cu un numar n citit de la tastatura
     */
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 6, 1, 5, 8, 9, 3};
        int n = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n && arr[i] != arr[j]) {
                    System.out.println(arr[i] + "+" + arr[j]);

                }
            }
        }
    }
}
