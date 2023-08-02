package Arrays;

import java.util.Scanner;

/* Scrie un program care sa afiseze de cate ori apare un anumit numar n (citit de la tastatura)
 intr-un array.
De exemplu, pentru {1, 2, 2, 3, 3, 3, 4, 4, 4, 4} si n=3, se va afisa "3 apare de 3 ori".
 */
public class ArraysEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mylist = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int n = scanner.nextInt();
        int contor = 0;
        for (int i = 0; i < mylist.length; i++) {
            if (n == mylist[i]){
                contor++;

            }
        }System.out.println(n +" apare de "+ contor+" ori");
    }
}






