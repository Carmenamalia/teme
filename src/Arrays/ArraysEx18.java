package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEx18 {
    public static void main(String[] args) {
/* Scrie un program care sa insereze un element intr-un array, la o pozitie specificata
De exemplu, pentru {1, 7, 3, 10, 9}, daca vrem sa inseram elementul 4 la indexul 2, array-ul
va deveni {1, 7, 4, 3, 10, 9}
HINT: array-ul avand o lungime fixa, este necesar sa copiem elementele din prim-ul array
 (impreuna cu elementul de inserat) intr-un nou array care sa aiba lungimea cu 1 mai mare.
 */
        Scanner scanner = new Scanner(System.in);
        int[] list1 = {1, 7, 3, 10, 9};
        int[] list2 = new int[list1.length + 1];
        int index = 2;
        int x = scanner.nextInt(); //elementul de adaugat
        int i ;
        for(i = 0;i < index;i++){//i este mai mic sau egal cu 2,indexul unde vrem sa bagam noul elem
            list2[i] = list1[i];//bagam elem din primul array pana la indexul 2
           //maresc pe i cu 1
        }
        list2[i] = x;//adaug noul element
       //copiez in noul array elem din primul array de la o pozitie in spate incepand de la pozitia la care a ramas i-ul in al doilea array

        for(int j = i+1;j<list2.length;j++){
            list2[j] = list1[j-1];
        }
        System.out.print(Arrays.toString(list2));
    }
}
