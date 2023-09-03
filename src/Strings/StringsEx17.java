package Strings;

import java.util.Scanner;

public class StringsEx17 {
    public static void main(String[] args) {
 /* Ai posibilitatea sa iti pui la masina numar de inmatriculare "de smecher".
Un numar de smecher trebuie sa inceapa cu cel putin doua litere.
Un numar de smecher poate sa contina maxim 6 caractere (litere sau numere) si minim 2 caractere.
Nu poti sa folosesti cifre in mijlocul unui numar de smecher. De exemplu, "AAA222" este valid, dar "AAA22A" nu este valid.
In plus, nu sunt acceptate virgule, spatii, sau alte semne de punctuatie.
  */

        //nr trebuie sa inceapa cu cel putin 2 litere
//nr trebuie sa fie >2 si <=6
        //daca nu pot folosi cifre in interiorul nr iar la inceput trebuie sa fie cel putin 2 litere
        //atunci cifrele pot fi la sfarsit
        //  boolean	endsWith(String suffix)   Tests if this string ends with the specified suffix.
        //nu trebuie sa contina semne de punctuatie,spatii
        //boolean	contains(CharSequence s)
        //Returns true if and only if this string contains the specified sequence of char values.
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        if (!isValidNumber(number)) {
            System.out.println("Numărul nu este smecher.");
        } else {
            System.out.println("Numărul este smecher.");
        }
    }

    private static boolean isValidNumber(String number) {
        if (number.length() < 2 || number.length() > 6) {
            return false;
        }
        // Verificăm primele două caractere să fie litere
        for (int i = 0; i < 2; i++) {
            if (!Character.isLetter(number.charAt(i))) {
                return false;
            }
        }
        // Verificăm să nu avem cifre în mijloc
        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(2)) && Character.isDigit(number.charAt(3))) {
                return false;
            }
        }
        // Verificăm daca are cifre la sfarsit
        for (int i = 3; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }
            // Verificăm să nu avem semne de punctuație sau spații
        for (int i = 0; i < number.length(); i++) {
                if (Character.isLetterOrDigit(number.charAt(i))) {
                    return true;
                }
            }
        return true;
    }
}



