package Conditionals;
/* Dorim sa implementam logica unui semafor pentru masini, unde exista o trecere de pietoni.
Culorile posibile ale semaforului sunt verde, si rosu. Trebuie sa luam in considerare urmatoarele scenarii:
-Daca semaforul este verde si nu asteapta niciun pieton, afisam in consola faptul ca masinile circula
-Daca semaforul este verde si exista pietoni care asteapta, afisam in consola faptul ca lumina se va schimba
 la rosu. Si dupa un delay, semaforul trebuie sa se schimbe la rosu
-Daca semaforul este rosu si inca exista pietoni care asteapta, afisam in consola faptul ca acum trec
 pietonii
 -Daca semaforul este rosu si nu mai exista pietoni care asteapta, afisam in consola ca lumina se va schimba
  la verde. SI dupa un delay, semaforul trebuie sa se schimbe la verde.
Citeste de la tastatura lumina semaforului pentru masini (trafficLight) si
statusul pietonilor (arePedestriansWaiting).
Apoi implementeaza codul care face toate verificarile in locul indicat din urmatoarea bucata de cod:

        Scanner scanner = new Scanner(System.in);
        String trafficLight = scanner.nextLine();
        boolean isPedestrianWaiting = scanner.nextBoolean();
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration: " + i);
            if (i == 3) {
                isPedestrianWaiting = true;
            }
            if (i == 6) {
                isPedestrianWaiting = false;
            }

            // insereaza codul aici //
}
        Foloseste comanda:
        TimeUnit.SECONDS.sleep(2)
        pentru a introduce un delay de 2 secunde acolo unde este cazul
 Ruleaza codul si observa cum se desfasoara traficul.
 */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class If_Else_Ex22 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String trafficLight = scanner.nextLine();
        boolean isPedestrianWaiting = scanner.nextBoolean();
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration: " + i);
            if (i == 3) {
                isPedestrianWaiting = true;
            }
            if (i == 6) {
                isPedestrianWaiting = false;
            }
            if (trafficLight.equals("verde") && !isPedestrianWaiting) {
                System.out.println("masinile circula");
            } else if (trafficLight.equals("verde") ) {
                System.out.println("lumina se va schimba in rosu");
                trafficLight = "rosu";
            } else if (trafficLight.equals("rosu") && isPedestrianWaiting) {
                System.out.println("acum trec pietonii");
            } else if (trafficLight.equals("rosu")) {
                System.out.println("lumina se va schimba in verde");
                trafficLight = "verde";
            }

        }
        TimeUnit.SECONDS.sleep(2);
    }
}