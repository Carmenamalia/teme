package Conditionals;
/* Citeste de la tastatura un numar care reprezinta un an, si afiseaza la consola
daca anul este bisect sau nu. Un an este bisect daca este divizibil cu 400 sau cu 4
si in acelasi timp nu este divizibil cu 100
De exemplu, pentru valoarea initiala:
int year = 2020
se va afisa in consola: "anul 2020 este bisect"
 */
import java.util.Scanner;

public class If_Else_Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if(((year % 400 == 0) || (year % 4 == 0)) && year !=100){
            System.out.println("anul " + year + " este bisect");
        }else {

        }
    }
}
