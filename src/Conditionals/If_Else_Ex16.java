package Conditionals;
/* Angajatii unei banci trebuie sa intampine clientii cu salutul "Buna ziua", altfel vor fi
 penalizati.
Scrie un program care citeste de la tastatura salutul folosit.

Daca salutul incepe cu "Buna ziua", atunci printeaza "nicio penalizare"
Daca salutul incepe cu "B", dar nu este "Buna ziua", atunci printeaza "20 de lei penalizare"
Daca salutul nici macar nu incepe cu "B", printeaza "100 de lei penalizare" Ignora literele mari
 si literele mici din salut. Ignora si orice spatii care apar inainte de primul cuvant din salut

 */
import java.util.Scanner;

public class If_Else_Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String salut = scan.nextLine().trim();
        if(salut.startsWith("Buna ziua")){
            System.out.println("nici o penalizare");
        }else if(salut.startsWith("B")){
            System.out.println("20 de lei panalizare");
        }else {
            System.out.println("100 de lei panalizare");
        }

    }
}
