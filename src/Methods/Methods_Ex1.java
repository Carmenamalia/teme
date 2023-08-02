package Methods;
//Scrie un program care sa citeasca de la tastatura un mesaj, iar apoi sa afiseze mesajul cu litere mari.

import java.util.Scanner;

public class Methods_Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("spune salut si numele tau");
        String message = scanner.nextLine();
        String message2 = message.toUpperCase();
        System.out.println(message2);





    }
}
