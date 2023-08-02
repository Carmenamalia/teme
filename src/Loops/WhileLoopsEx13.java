import java.util.Random;
import java.util.Scanner;

public class WhileLoopsEx13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        System.out.println("ghiceste numarul");
        int num = 0;
        int i = 0;
        do {
             num = scanner.nextInt();
            if (num < numberToGuess) {
                System.out.println("numarul e prea mic, mai incearca");
            } else if (num > numberToGuess) {
                System.out.println("numarul e prea mare,mai incearca");
            }
            i++;
        }
        while (i < 5 && num != numberToGuess);
        {
            if (num == numberToGuess) {
                System.out.println("ai ghicit din " + i + " incercari");
            } else {
                System.out.println("nu ai ghicit,jocul s-a terminat");

            }

        }

    }
}