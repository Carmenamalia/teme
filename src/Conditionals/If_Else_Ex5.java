package Conditionals;/* Citeste de la tastatura 2 numere si un caracter care reprezinta operatia pe care vrei sa
 o realizezi: +, -, * sau /. Apoi afiseaza rezultatul calculului respectiv in consola.
  Ai grija sa tratezi cazul in care se face impartire la 0.
 */

import java.util.Scanner;

public class If_Else_Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char op = scanner.nextLine().charAt(0);
if(op == '+') {
    System.out.println(("a + b = ") + (a + b));
}if(op == '-') {
            System.out.println(("a - b = ") + (a - b));
        }if(op == '-') {
            System.out.println(("a * b = ") + (a * b));

        }if((op == '/') && (b != 0)) {
        System.out.println(("a / b = ") + (a / b));
    }
    if ((op == '/') && (b == 0)) {
        System.out.println("nu are sens");
    }
}
}





