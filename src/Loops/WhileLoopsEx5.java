import java.util.Scanner;

public class WhileLoopsEx5 {
    public static void main(String[] args) {
        //Scrie un program care afiseaza numerele din sirul fibonacci pana la maxim n, n fiind citit de la tastatura.
        //0 1 1 2 3 5 8 13 21
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;
        int next = 0;

        //cat timp nu am ajuns la n
        //next devine first + second
        //first devine second
        //second devine next
        while(first<=n) {
            System.out.println(first);
            next = first + second;
            first = second;
            second = next;
        }
    }
}
