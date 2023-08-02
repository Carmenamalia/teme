package Methods;

import java.util.Scanner;

public class ScratchWYN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Care e numele tau?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
