package Exceptii.Ex_2;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args)  {
/* Scrie o functie care sa retuneze ziua din saptamana in functie de un numar primit ca input.
De exemplu, 1 este Luni, 2 este Marti, etc. Trateaza cazul exceptional in care ce primeste functia ca input este nu numar
in afara intervalului 1-7.
 */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] days = {"Luni","Marti","Miercuri","Joi","Vineri","Sambata","Duminica"};
      try {
          getDay(n);
          for (int i = 0; i < days.length - 1; i++) {
              if (n-1 == i) {
                  System.out.println(days[i]);
              }
          }
      }catch (InvalidNumberException e){
          System.out.println(e.getMessage());
      }

    }
    public static void getDay(int n) throws InvalidNumberException {
       if (!(n>=1&&n<=7)){
           throw new InvalidNumberException("numar invalid,numarul trebuie sa fie intre 1 si 7");
       }

    }
}
