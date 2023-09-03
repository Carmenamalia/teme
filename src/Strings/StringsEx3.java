package Strings;

import java.util.Scanner;

public class StringsEx3 {
    public static void main(String[] args) {
/*Scrie un program care citeste de la tastatura un String si il afiseaza in consola consola caracter cu caracter
 (cate un caracter pe fiecare linie)
 */
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
//        String word = "abcdefgh";
        for (int i = 0;i<word.length();i++){
            char c = word.charAt(i);
            System.out.print(c);

        }
        //sau alta metoda:
char[] wordChars = word.toCharArray();
        for(int i = 0;i< wordChars.length;i++){
            System.out.print(wordChars[i] + ",");
        }

    }
}
