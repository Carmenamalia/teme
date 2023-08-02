import java.util.Scanner;

public class WhileLoopsEx9 {
    public static void main(String[] args) {
/*Scrie un program care afiseaza daca un numar este, sau nu, palindrom, numarul fiind citit de la tastatura.
Un numar este palindrom daca ramane la fel atunci cand cifrele ii sunt inversate.
De exemplu, numarul 12321 este palindrom deoarece atunci cand e inversat, este tot 12321.
 */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int n2 = n;//pun nr dat intr-o variabila temporara

        while (n != 0) {
            int cifra = n % 10;
            i = i * 10 + cifra;
            n /= 10;
        }
        if (i == n2)//compar variabila temporara cu nr inversat
            System.out.println(i + " e palindrom");

        else
            System.out.println(" nu e palindrom");
    }
}

