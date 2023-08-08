package Strings;

import java.util.Scanner;

public class StringsEx10 {
    public static void main(String[] args) {
// Scrie un program care printeaza in consola daca un String are caracterele in ordine alfabetica, sau nu.

         Scanner scanner = new Scanner(System.in);
         String n = scanner.nextLine();

        char[] nChar = n.toCharArray();

        boolean isSorted = true;
        for (int i = 0; i < nChar.length - 1; i++) {
            if (nChar[i] > nChar[i + 1]) {
                isSorted = false;
                System.out.println("nu este in ordine alfabetica");
                break;
            }
        }
        if (isSorted) {
            System.out.println("este in ordine alfabetica");
        }
    }
}


