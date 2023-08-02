package Arrays;

import java.util.Arrays;

public class ArraysEx20 {
    public static void main(String[] args) {
/* Scrie un program care gaseasca perechea de elemente dintr-un array care are produsul maxim.
** ca sa luam toate perechile de elemente, ar trebui sa parcurgem cu for in for
 iar apoi sa punem intrebarea: "daca elementul de la pozitia i inmultit cu elementul de la pozitia j este
 mai mare decat in max, atunci aceasta inmultire devine max"
 */

        int[] list = {1, 7, 4, 3, 10, 9};
        int max = 0;
        int max2 = 0;

        for(int i = 0;i< list.length;i++){
            if(list[i]>max){
                max = list[i];
            }
        }
        for(int j = 0;j< list.length;j++){
            if(list[j]>max2 && list[j] !=max){
                max2 = list[j];
            }
        }
        System.out.println(max + " * " + max2);
    }
}
