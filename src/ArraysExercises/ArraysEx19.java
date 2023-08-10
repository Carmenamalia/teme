package ArraysExercises;

public class ArraysEx19 {
    public static void main(String[] args) {
/* Scrie un program care sa gaseasca al doilea cel mai mare numar dintr-un array:
De exemplu, pentru {1, 7, 3, 10, 9}, se va afisa in consola 9.
 */
        int[] list = {1, 7, 3, 10, 9};
        int max = 0;
        int max2 = 0;

        //enumar si compar fiecare element
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max2 && list[i] != max) {
                max2 = list[i];
            }
        }
        System.out.println(max2);
    }
}
