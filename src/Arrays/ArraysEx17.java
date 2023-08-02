package Arrays;

import java.util.Arrays;

public class ArraysEx17 {
    public static void main(String[] args) {
/* Scrie un program care sa gaseasca intersectia a doua array-uri.
Intersectia a doua array-uri este un array format din elementele care apar atat in primul, cat si in al doilea array.
 */
        int[] list1 = {1, 7, 4, 3, 10, 9};
        int[] list2 = {2, 7, 5, 3, 12, 9};
        for(int i=0;i< list1.length;i++){
            for(int j = 0;j< list2.length;j++){
                if(list1[i]==list2[j]){
                    System.out.print(Arrays.toString(new int[]{list2[j]}));
                }
            }
        }
    }
}
