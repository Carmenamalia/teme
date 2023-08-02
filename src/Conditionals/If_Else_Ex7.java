package Conditionals;
/*Ai o aplicatie de bilete la cinema si vrei sa determini pretul unui bilet.
 Pretul normal este de 10 lei. Daca persoana este copil (are varsta mai mica decat 12 ani),
 sau pensionar (mai mult de 65 de ani), atunci pretul este de 5 lei.
 In plus, in fiecare marti, este un discount de 2 lei pentru toata lumea.
Citeste de la tastatura varsta persoanei si ziua din saptamana, apoi afiseaza in consola pretul biletului.
 */

import java.util.Scanner;

public class If_Else_Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ziua?");
        String day = scanner.nextLine();
        System.out.println("varsta?");
        int age = scanner.nextInt();
        int initialPrice = 10;
        int price = initialPrice - getAgeDiscount(age) - getDayDiscount(day);
        System.out.println("pretul este: " + price);
    }

    public static int getAgeDiscount(int age) {
        int ageDiscount = 0;
        if (age >= 65 || age <= 12) {
            ageDiscount = 5;
        }
        return ageDiscount;
    }

    public static int getDayDiscount(String day) {
        if (day.equals("marti")) {
            return 2;
        }
        return 0;
    }
}