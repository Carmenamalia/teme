package VariabileOperatori;

import java.util.Scanner;

public class Var_Op_Ex_1 {
    public static void main(String[] args) {
        //Scrie un program care sa citeasca de la tastatura numele tau,
        // iar apoi sa afiseze mesajul “Salut”, urmat de numele tau.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Spune numele tau");
        String name = scanner.nextLine();
        System.out.println("Salut, " + name);
    }

}
