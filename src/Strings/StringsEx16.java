package Strings;

import java.util.Scanner;

public class StringsEx16 {
    /* Scrie un program care sa valideze o parola
    O parola (citita de la tastatura) este valida daca contine cel putin o litera mare, cel putin o litera mica, cel putin un numar,
    si cel putin un simbol.
    Simbolul inseamna ca nu este litera sau cifra, cum ar fi "!", "$", etc.
    Printeaza apoi un mesaj corepsunzator, si da-i posibilitatea utilizatorului sa introduca din noua o parola, pana cand introuce una care
    sa fie valida.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Insert pasword ");
            String pasword = scanner.nextLine();

            if (verifyPasword(pasword)) {
                isValid = true;
                System.out.println("Pasword is valid");
            } else {
                System.out.println("Invalid pasword");
            }
        }
    }

    public static boolean verifyPasword(String pasword) {
        boolean containDigit = false;
        boolean containLetter = false;
        boolean containUppercase = false;
        boolean containSpecialChar = false;

        for (int i = 0; i < pasword.length(); i++) {
            char c = pasword.charAt(i);
            if (Character.isDigit(c)) {
                containDigit = true;
            } else if (Character.isLowerCase(c)) {
                containLetter = true;
            } else if (Character.isUpperCase(c)) {
                containUppercase = true;
            } else if (!Character.isLetterOrDigit(c)) {
                containSpecialChar = true;
            }
        }

        return containDigit && containLetter && containUppercase && containSpecialChar;
    }
}






