package Conditionals;
/*Creeaza un automat de cafea.
Automatul are 3 tipuri de cafea:
 espresso, care costa 5 lei,
  latte, care costa 7 lei
  si cappuccino, care costa 6 lei.
Clientul poate adauga extra lapte pentru 1 leu, sau extra zahar in mod gratuit.
Citeste de la tastatura tipul cafelei si daca clientul doreste extra lapte sau extra zahar.
Apoi afiseaza in consola pretul total.
 */

import java.util.Scanner;

public class If_Else_Ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ce tip de cafea?");
        String coffeeType = scan.nextLine();
        System.out.println("extra milk?");
        boolean extra = scan.nextBoolean();
        int price = 0;
        if (!((coffeeType.equals("espresso")) || (coffeeType.equals("latte")) || (coffeeType.equals("cappuccino")))) {
            System.out.println("nu avem asa ceva");
        } else {
            if (coffeeType.equals("espresso")) {
                price = 5;
            } else if (coffeeType.equals("latte")) {
                price = 7;
            } else if (coffeeType.equals("cappuccino")) {
                price = 6;
            }
        }
        if (extra) {
            price += 1;
        }
        System.out.println(price);


    }
}
