package Loops;

import java.util.Scanner;

//Scrie un program care sa afiseze numerele prime din intervalul 1 - n, n fiind citit de la tastatura.
public class LoopEx24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            int contor = 0;
            //doar daca i este prim il printez
            //ma duc prin toate nr de la 2 la i
            //daca gasesc un nr la care i se imparte exact atunci il numar
            //daca nu gasesc nici un nr la care se imparte exact atunci afisez pe i pt ca este prim)
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    contor++;
                    break; //ca sa nu mai faca bucla odata ce a gasit macar un caz cand se imparte exact
            }
            }
            if(contor == 0) {
                System.out.println(i);
            }
        }
    }
}

//putem fo;osi in loc de contor un boolean
/*boolean isPrime = true;
for(int j = 2;j<i;j++){
  if(i%j == 0){
  isPrime = false;
  }
  if(isPrime){
  System.out.println(i);
}
 */
/*
sau o metoda :
for (int j = 2; j < i; j++) {
if(isPrime(i)) {
                System.out.println(i);
            }
public static boolean isPrime(int number){
boolean isPrime = true;
for(int i = 2;i < number;i++){
  if(number % i == 0){
    isPrime = false;
    }
  }
    return isPrime;
 */