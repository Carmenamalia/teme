package SDA1;

import java.util.Random;
import java.util.Scanner;

public class SDA1_Ex2 {
    /* Implementeaza jocul "piatra-foarfece-hartie".
    Utilizatorul are la dispozitie alegerile "piatra", "foarfece", sau "hartie".

    Alegerea utilizatorului va fi citita de la tastatura. Alegerea calculatorului va fi generata random.

    Daca alegerile sunt egale, atunci se va afisa "remiza".
    Daca utilizatorul alege piatra si calculatorul foarfeca, sau utilizatorul foarfeca si calculatorul hartie, sau utilizatorul hartie si
     calculatorul piatra, atunci utilizatorul castiga.
    Daca este fix invers, atunci calculatorul castiga.
    Implementeaza apoi versiunea jocului in care se alege cel mai bun jucator din 3 runde de joc.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] options = {"piatra", "foarfeca", "hartie" };
        String userOption = "";
        //input
        Random random = new Random();
        int randomIndex = random.nextInt(3);

        //daca alegerile sunt egale se va afisa remiza
        int equalGames = 0;
        int userWins = 0;
        int computerWins = 0;

        for(int i = 0;i<3;i++) {
            do {
                userOption = scanner.nextLine();
            } while (!isOptionValid(userOption,options));
            String computerOption = options[randomIndex];
            System.out.println("computerul a ales " + computerOption);
            if (userOption.equals(computerOption)) {
                System.out.println("remiza in runda " + i);
                equalGames++;
            } else if (userWins(userOption, computerOption)) {
                System.out.println("utilizatorul a castigat in runda " + i);
                userWins++;
            } else {
                System.out.println("calculatorul a castigat in runda " + i);
                computerWins++;
            }
        }
        System.out.println("meciuri egale " + equalGames);
        System.out.println("meciuri castigate de utilizator " + userWins);
        System.out.println("meciuri castigate de computer " + computerWins);
        if(computerWins>userWins){
            System.out.println("calculatorul a castigat turneul");
        }else if(userWins>computerWins){
            System.out.println("utilizatorul a castigat turneul");
        }else{
            System.out.println("remiza in turneu");
        }
    }

    public static boolean userWins(String userOption, String computerOption) {
        return (userOption.equals("piatra") && computerOption.equals("foarfeca")) || (userOption.equals("foarfeca") && computerOption.equals("hartie")) || (userOption.equals("hartie") && computerOption.equals("piatra"));
    }

    public static boolean isOptionValid(String option,String[] validOptions) {
        for (int i = 0;i< validOptions.length;i++){
            if (option.equals(validOptions[i])){
                return true;
            }
        }
       return false;
    }
}
