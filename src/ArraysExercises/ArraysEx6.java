package ArraysExercises;

import java.util.Scanner;

/*Scrie un program care sa calculeze produsul numerelor impare din intervalul x si y,
 unde numerele x si y sunt introduse de la tastatura
 */
public class ArraysEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int x = scanner.nextInt();
       int y = scanner.nextInt();
       int multiply = 1;
       int[] listNum = new int[y];
        for (int i = x;i<= listNum.length; i++) {
           if((i%2)!=0){
               System.out.println(i);
               multiply = multiply * i;
               System.out.println(multiply);
           }else{

           }
        }
    }
}
