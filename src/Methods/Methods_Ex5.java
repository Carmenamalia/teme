package Methods;

import java.util.Scanner;

/* Citeste de la tastatura un String reprezetand un text si cuvantul pe care doresti sa il cauti.
De exempluu, pentru textul "eu sunt aici" si cuvantul "sunt", metoda va returna true pentru ca
 a gasit cuvantul "sunt" in text.
Cauta pe Google o metoda deja implementata care sa faca verificarea pentru tine.

 */
public class Methods_Ex5 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String text = scanner.nextLine();
        System.out.println(text);
        boolean word = text.contains("mere");
        System.out.println(word);

    }
}
