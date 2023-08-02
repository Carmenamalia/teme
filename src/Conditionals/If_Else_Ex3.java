package Conditionals;/* Citeste de la tastatura un caracter care reprezinta da sau nu.
 In functie de acest input, afiseaza in consola “de acord” sau “nu sunt de acord”.
 */

import java.util.Scanner;

public class If_Else_Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            System.out.println("de acord");
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("nu sunt de acord");
        }else{
            System.out.println("answer not found");
        }
    }

}
