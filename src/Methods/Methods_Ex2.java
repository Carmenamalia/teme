package Methods;
/* Scrie un program care sa "puna pauza intre cuvinte". Citeste de la tastatura un mesaj
si inlocuieste toate spatiile cu "...".
De exemplu, pentru mesajul introdus "aceasta e o functie", se va afisa in consola "aceasta...e...o...functie".
Cauta pe Google o metoda deja implementata care sa faca inlocuirea.
 */

import java.util.Scanner;

public class Methods_Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert message:");
        String message = scanner.nextLine();
        char oldChar = ' ';
        char newChar = '.';
        System.out.println(message.replace(" ", "..."));


    }
}
