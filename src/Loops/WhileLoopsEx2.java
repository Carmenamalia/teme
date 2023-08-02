import java.util.Scanner;

//2. Scrie un program care afiseaza suma numerelor de la 1 la n, n fiind citit de la tastatura
public class WhileLoopsEx2 {
    public static void main(String[] args) {
        ///fiecare nr il adunam intr-o variabila suma
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }


    }


}
