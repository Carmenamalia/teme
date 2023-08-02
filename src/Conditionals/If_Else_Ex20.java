package Conditionals;
/* Dorim sa implementam logica unui semafor pentru masini.
Culorile posibile ale semaforului sunt verde, galben si rosu. Avem urmatoarele scenarii:
-Daca lumina este verde, afisam in consola faptul ca masinile circula.
 Apoi lumina trebuie sa devina galben
-Daca lumina este galben, afisam in consola faptul ca masinile se pregatesc sa opreasca.
 Apoi lumina trebuie sa devina rosu
-Daca lumina este rosu, afisam in consola faptul ca masinile s-au oprit. Apoi lumina trebuie sa devina verde
Implementeaza codul care face toate verificarile in locul indicat din urmatoarea bucata de cod:

        Scanner scanner = new Scanner(System.in);
        String trafficLight = scanner.nextLine();
          for (int i = 0; i < 10; i++) {
            System.out.println("Iteration: " + i);
            // insereaza codul aici //
   TimeUnit.SECONDS.sleep(2);
        }
*/

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//verde-->masinile circula-->se face galben; galben -->masinile preg sa opr-->rosu; rosu-->opresc-->verde
public class If_Else_Ex20 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        String trafficLight = scan.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration: " + i);
            if (trafficLight.equals("verde")) {
                System.out.println("masinile circula");
                trafficLight = "galben";
            } else if (trafficLight.equals("galben")) {
                System.out.println("masinile se pregatesc sa opreasca");
                trafficLight = "rosu";
            } else if (trafficLight.equals("rosu")) {
                System.out.println("masinile s-au oprit");
                trafficLight = "verde";
            }

            TimeUnit.SECONDS.sleep(2);

        }
    }
}
