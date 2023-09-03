package Strings;

import java.util.Arrays;

public class StringsEx9 {
    public static void main(String[] args) {
/* Scrie un program care sa transforme in litera mare prima litera din fiecare cuvant dintr-un String citit de la tastatura.
De exemplu, pentru String-ul "ana are mare", se va afisa "Ana Are Mere"
 */
        // Scanner scanner = new Scanner(System.in);
        // String text = scanner.next();
        String text = "ana are mere";
        String[] text2 = text.split(" ");//transform stringul intr-un array de stringuri format din fiecare cuvant
        System.out.println(Arrays.toString(text2));//il afisez
        for (int i = 0; i < text2.length; i++) {
//transform prima litera a fiecarui cuvant in majuscula:
            System.out.print(text2[i].substring(0, 1).toUpperCase() + text2[i].substring(1) + " ");

        }
    }
}
