import java.util.Scanner;

public class WhileLoopsEx10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 /*  Scrie un program care afiseaza cel mai mare divizor comun al doua numere, citite de la tastatura.
De exemplu, pentru numerele 21 si 15, cel mai mare divizor comun este 3.
3 este cel mai mare numar la care si 21 si 15 se impart exact.
 */
        int a = scanner.nextInt();
        int b = scanner.nextInt();

//luăm restul împărțirii lui a la b, apoi restul împărțirii lui b la rest, și așa mai departe,
//pînă ce obținem un rest zero. CMMDC este numărul rămas, cel diferit de zero.
        int rest;
        while ((a % b) > 0) {
            rest = a % b;
            a = b;
            b = rest;
        }
        System.out.println(b);


    }
}
