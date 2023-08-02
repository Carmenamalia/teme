package Conditionals;
/*  Scrie un program care citeste de la tastatura 3 numere,
reprezentand lugimile laturilor unui triunghi.
Trebuie sa afisezi in consola daca cele 3 laturi formeaza un triunghi valid, sau nu.
 Un triunghi este valid daca suma lungimilor oricaror doua laturi este mai mare decat
  lugimea celei de-a 3-a laturi.
 */
import java.util.Scanner;

public class If_Else_Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(((a + b) > c) && ((a + c) > b) && ((b + c) > a)){
            System.out.println("formeaza un triunghi valid");
        }else{
            System.out.println("nu formeaza un triunghi valid");
        }
    }
}
