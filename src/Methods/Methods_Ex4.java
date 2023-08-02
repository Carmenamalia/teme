package Methods;
/*Scrie un program care sa construiasca o adresa de e-mail.
Citeste de la tastatura numele si domeniul.
Defineste o metoda. De exemplu, pentru numele "stefan.olimpiu" si domeniul "gmail",
 metoda va returna "stefan.olimpiu@gmail.com"
 */

import java.util.Scanner;

public class Methods_Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String domain = scanner.nextLine();
        String emailAdress  = createEmail(name, domain);
        System.out.println("Adresa e " + emailAdress);
    }

    public static String createEmail(String name,String domain) {
        return name + "@" + domain;


    }

}
