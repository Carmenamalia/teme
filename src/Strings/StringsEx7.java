package Strings;

import java.util.Scanner;

public class StringsEx7 {
    public static void main(String[] args) {
/* Scrie un program care sa afiseze in consola daca un cuvant este palindrom sau nu.
Un cuvant sau numar este palindrom daca este egal cu inversul lui
De exemplu, ana este palindrom, dar mama nu este palindrom pt ca mama este diferit de inversul sau (amam)
 */
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
//        String name1 = "hannah";
//        String name2 = "alina";
//        String reverseName1 = "";
//        String reverseName2 = "";
//        for (int i = name1.length() - 1; i >= 0; i--) {
//             reverseName1 += name1.charAt(i);
//        }
//        if (reverseName1.equals(name1)){
//            System.out.println(name1 + " este palindrom");
//        }
//        for (int i = name2.length() - 1; i >= 0; i--) {
//            reverseName2 += name2.charAt(i);
//        }
//        if (!reverseName2.equals(name2)) {
//            System.out.println(name2 + " nu este palindrom");
//        }
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
            if (reverseWord.equals(word)) {
                System.out.println(word + " este palindrom");
            } else {
                System.out.println(word + " nu este palindrom");
            }

    }
}

