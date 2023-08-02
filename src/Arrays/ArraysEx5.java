package Arrays;

import java.util.Arrays;

/* Scrie un program care sa afiseze pretul mediu pe metru patrat, dintr-o lista de preturi
ale unor proprietati imobiliare:
De exempu, pentru {1, 7, 3, 10, 9}, se va afisa in consola valoarea 6
 */
public class ArraysEx5 {
    public static void main(String[] args) {
        int[] price = {1, 7, 3, 10, 9};
        System.out.println(Arrays.toString(price));//afisez lista
        int sum = 0; //am initializat suma la 0
        for (int i = 0; i < price.length; i++) {
            sum = sum + price[i]; //suma este ficare index adunat la suma initiala
        }  System.out.println("suma este: " + sum);//am afisat suma

        int mediumPrice = sum/price.length;//media este suma / lungimea array-ului(cate elemente)
        System.out.println("pretul mediu e: " + mediumPrice);//afisez pretul mediu
    }
}