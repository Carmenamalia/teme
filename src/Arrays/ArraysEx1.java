package Arrays;

import java.util.Scanner;

/* Scrie un program care sa caute un numar de telefon intr-o lista de numere.
Programul va printa “numarul a fost gasit” sau “numarul nu a fost gasit”
 */
public class ArraysEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phoneNr = {"0745612354", "0754648352", "0736789452"};//am zis sa fie string pt ca sunt lungi nr
        String n = scanner.nextLine();//introduc nr dorit de la tastatura


        for (int i = 0; i < phoneNr.length; i++) {
            if (phoneNr[i].equals(n)) {
                System.out.println("numarul  a fost gasit");
            } else {
                System.out.println("numarul nu a fost gasit  ");
            }
        }
    }

}




