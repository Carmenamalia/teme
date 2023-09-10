package SDA2;

import java.util.Scanner;

public class Algoritmi_Ex2 {
    public static void main(String[] args) {
        //Scrie un program care citește un șir de numere întregi și două numere n și m. Programul trebuie să verifice
        // că n și m nu apar niciodată unul lângă celălalt (în orice ordine) în șir.
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 7, 3, 10, 9, 18, 20};
        int n;
        int m;
        //atat timp cat unul din numere  nu este in lista cerem alt numar
        do {
            System.out.print("numarul n: ");
            n = scanner.nextInt();
        } while (!containsNumber(numbers, n));
        do {
            System.out.print("numarul m: ");
            m = scanner.nextInt();
        } while (!containsNumber(numbers, m));
        //parcurg lista si verific daca numerele sunt alaturi
        boolean numbersAttached = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            if ((numbers[i] == n && numbers[i + 1] == m) || (numbers[i] == m && numbers[i + 1] == n)) {
                numbersAttached = true;
                break;
            }
        }
            if (numbersAttached) {
                System.out.println("numerele n si m sunt unul langa celalalt");
            } else {
                System.out.println("numerele n si m nu sunt unul langa celalalt");
            }

    }
    //metoda containsNumber() verifica daca un numar e in lista
    private static boolean containsNumber(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        System.out.println("numarul nu e in lista,introdu alt numar");
        return false;
    }

}
