package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/* Vrei sa pui un discount de n lei (n fiind citit de la tastatura), pentru fiecare produs.
De exemplu, pentru n = 2 si lista de preturi {3, 7, 3, 10, 9}, lista de preturi va deveni {1, 5, 1, 8, 7}
 */
public class ArraysEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] priceList = {3, 7, 3, 10, 9};
        int[] discountPrice = new int[priceList.length];
        int n = scanner.nextInt();
        for (int i = 0; i < priceList.length; i++) {
            discountPrice[i] = priceList[i] - n;

//imi iese rezultatul dar unul sub altul

        }System.out.print(Arrays.toString(discountPrice));
    }
}
