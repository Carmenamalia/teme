import java.util.Scanner;

public class WhileLoopsEx14 {
    public static void main(String[] args) {
/* Creeaza un sistem de verificare a PIN-ului.
Defineste in cadrul programului o variabila care sa contina un PIN, format din 4 cifre,
care va reprezenta PIN-ul corect.
Un utilizator are maxim 3 incercari sa introduca de la tastatura PIN-ul corect.
Daca reuseste sa faca asta, se va afisa in consola "PIN corect" si programul se va opri.
Daca nu reuseste sa faca asta, se va afisa in consola "PIN incorect" si programul se va opri.
 */
        Scanner scanner = new Scanner(System.in);
        int pinCorrect = 4567;
        int i = 0;
        while (i < 3) {
            System.out.println("insert PIN");
            int pin = scanner.nextInt();
            if (pin == pinCorrect) {
                System.out.println("PIN correct");
break;
            } else {
                System.out.println("PIN incorrect");
            } i++;
        }if(i == 3){
            System.out.println(" card blocat");
        }
    }
}