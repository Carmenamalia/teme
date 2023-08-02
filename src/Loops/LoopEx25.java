package Loops;

import java.util.Scanner;

//Scrie un program care calculeaza x la puterea y, unde x si y sunt citite de la tastatura.
public class LoopEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu un numar diferit de 0");
        int x = scanner.nextInt();
        System.out.println("introdu o putere diferita de 0");
        int y = scanner.nextInt();
        int power = x*x;
        // x, y sa nu fie 0
        // trebuie sa inmultesc x  de y ori
        for (int i = x; i <= y; i++) {
            power = power * x;
        }
        System.out.println(x + " ^ " + y + " = " + power);

    }
}
