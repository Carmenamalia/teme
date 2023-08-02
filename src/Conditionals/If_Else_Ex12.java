package Conditionals;
/* Citeste de la tastatura doua numere, guess si answer si creeaza un joc de ghicit:
daca raspunsul este mai mic decat solutia (adica valoarea variabilei guess, afiseaza “nu ai ghicit,
 numarul este prea mic”
daca raspunsul este mai mare decat solutia, afiseaza “nu ai ghicit, numarul este prea mare”
daca raspunsul este egal cu solutia, afiseaza “ai ghicit” De exemplu, pentru valorile initiale:
int guess = 7
int answer = 8
se va afisa in consola: "nu ai ghicit, numarul este prea mare"

 */
import java.util.Scanner;

public class If_Else_Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guess = 9;
        int answer = scan.nextInt();
        if(answer < guess){
            System.out.println("nu ai ghicit,numarul e prea mic");
        }else if (answer > guess){
            System.out.println("nu ai ghicit,numarul e prea mare");
        }else if(answer == guess){
            System.out.println("ai ghicit");
        }
    }
}
