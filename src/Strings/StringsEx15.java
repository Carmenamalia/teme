package Strings;

import java.util.Scanner;

public class StringsEx15 {
    public static void main(String[] args) {
/* Pe twitter exista moda de a omite vocale atunci cand scrii, ca sa salvezi spatiu.
De exemplu, Twitter a fost numit original Twttr.
Scrie un program care citeste de la tastatura un String si printeaza acelasi string, fara vocale.
 */
        // Scanner scanner = new Scanner(System.in);
        //String str = scanner.nextLine();
        String str = "autoinsamantarile";

        String result = str.replaceAll("[aeiou]","");
        System.out.println(result);

    }
}

