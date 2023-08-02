package Conditionals;
/* Citeste de la tastatura un numar si afiseaza in consola “fizz” daca numarul este multimplu de 3,
 “buzz” daca numarul este multiplu de 5 si “fizzbuzz” daca numarul este divizibil atat cu 3 cat si cu 5
De exemplu, pentru valoarea citita:
int number = 15
se va afisa in consola "fizzbuzz", pentru ca 15 se imparte exact atat la 5, cat si la 3 iar pentru:
int number = 9
se va afisa in consola "fizz", pentru ca 9 se imparte exact doar la 3
 */
import java.util.Scanner;

public class If_Else_Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert number:");
        int number = scanner.nextInt();
        if((number % 3 == 0)&&(number % 5 == 0)){
            System.out.println("fizzbuzz");
        }else if(number % 3 == 0) {
            System.out.println("fizz");
        }else if(number % 5 == 0){
            System.out.println("buzz");
        } else{

        }
    }
}
