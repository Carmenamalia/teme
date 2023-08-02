package Conditionals;
/*Citeste de la tastatura un numar intre -10 si 10.
Daca valoarea citita este 10, -10, sau 0, printeaza un mesaj corespunzator
 (ex: "numarul este -10", in caz ca valoarea citita este -10)
Altfel, printeaza fie "numarul este pozitiv", fie "numarul este negativ", dupa caz
 */
import java.util.Scanner;

public class If_Else_Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if((number == -10) || (number == 10) || (number == 0)){
            System.out.println("numarul este: " + number);
        }else if((number < 0) && (number > -10)){
            System.out.println("numarul e negativ");
        }else if((number < 10) && (number >= 1)){
            System.out.println("numarul e pozitiv");
        }
    }
}
