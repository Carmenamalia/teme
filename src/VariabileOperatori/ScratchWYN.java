package VariabileOperatori;

import java.util.Scanner;

public class ScratchWYN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //   System.out.println("Care e numele tau?");
      //  String name = scanner.nextLine();
     //   System.out.println(name);
     //   System.out.println("Hello" + name);

        String productName = "mustar";
        double price = 2.77;
        boolean isAvailable = true;
        char nutriScore = 'A';
        boolean isBio = false;

        String productName2 = "mustar2";
        double price2 = 65;
        boolean isAvailable2 = false;
        char nutriScore2 = 'A';
        boolean isBio2 = true;

        double totalPrice = price + price2;
        double mediumPrice = totalPrice/2;
        boolean isMediumPriceCorrect = (30 < mediumPrice) && (mediumPrice < 35);
        boolean isMediumPriceCorrect2 = (30 < mediumPrice) || (mediumPrice < 35);
        System.out.println(totalPrice);
        System.out.println(mediumPrice);

       // boolean isTotalPriceAvailable = totalPrice < 70;
        //sau mai pot scrie asa:
        System.out.println(totalPrice > 70);
        System.out.println(totalPrice >= 70);
        //calc recunoaste totalPrice < 70 ca fiind boolean
        System.out.println(price == price2);
        //imi returneaza o valoare de tip boolean (compara cele doua variabile)
        System.out.println(isBio2 && isBio);
        boolean isMustarCheaper = price < price2;


        boolean isCold = false;
        boolean isDry = true;
        boolean isSummer = false;
        boolean canTreking = isDry && (!isCold || isSummer);
        //adevarat si (adev sau fals)

        String username = "user";
        String password = "pass";
        String inputUsername = scanner.nextLine();
        String inputPassword = scanner.nextLine();
       // boolean isLoggedIn = inputUsername == username && inputPassword == password; sau folosim .equals:
        boolean isLoggedIn = inputUsername.equals(username) && inputPassword.equals(password);
        System.out.println(isLoggedIn);


    }
}
