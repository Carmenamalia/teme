package Conditionals;
/* Citeste 3 numere de la tastatura si scrie un program care sa printeze in consola:
“toate numerele sunt egale”, daca toate numerele sunt egale
“toate numerele sunt diferite”, daca toate numerele sunt diferite
“cel putin doua sunt egale”, daca oricare doua numere dintre cele trei sunt egale De exemplu, pentru valorile initiale:
int a = 3
int b = 3
int c = 4
se va afisa in consola: "cel putin doua sunt egale"
 */
import java.util.Scanner;

public class If_Else_Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if((a == b) && (b == c)){
            System.out.println("toate numerele sunt egale");
        }
        if ((a != b) && (b != c)){
            System.out.println("toate numerele sunt diferite");
        }
        if((a == b) || (b == c) || (a == c)){
            System.out.println("cel putin doua numere sunt egale");
        }
    }
}
