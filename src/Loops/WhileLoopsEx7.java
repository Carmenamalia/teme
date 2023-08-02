import java.util.Scanner;

public class WhileLoopsEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
 /*
 ultima cifra a unui nr e restul impartiri nr la 10 adica n % 10
--apoi trebuie sa taiem ultima cifra pentru a ramane cu nr fara ultima cifra si facem n/10
--  =>se opreste cand ajunge la 0
pentru ca am n> 0 nu afiseaza 0 ,atunci e bine sa pun do-while
*/
        do{
            int cifra = n % 10;
            sum = sum + cifra;
            n = n / 10;//sau n/=10;

        }
        while(n > 0);
        System.out.println(sum);



    }
}