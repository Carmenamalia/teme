package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEx13 {
    public static void main(String[] args) {
/*Scrie un program care verifică dacă un array este palindrom.
Un array este palindrom daca ordinea elementelor este aceeași dacă o parcurgem de la început la sfârșit,
 sau de la sfârșit la început.int j = original.length-1;j>i;j--
*/
        Scanner scanner = new Scanner(System.in);
        int[] original = {1, 7, 3, 6, 8};
        System.out.println("original string; " + Arrays.toString(original));
        int[] reverse = new int[original.length];
        int j = 0;
        for (int i = original.length - 1; i >= 0; i--) {
            reverse[j] = original[i];
            j++;
        }
        if (Arrays.equals(reverse, original)) {
            System.out.println("reverse of original; " + Arrays.toString(reverse));
            System.out.println("este palindrom");
        } else
            System.out.println("nu este palindrom");

    }
}

