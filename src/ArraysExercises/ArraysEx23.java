package ArraysExercises;

public class ArraysEx23 {
    public static void main(String[] args) {
        //Gaseste cea mai mica diferenta dintre doua numere dintr-un array.
        int[] arr = {2, 6, 1, 5, 8, 9, 3};
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        //aflu cel mai mic nr din lista
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        //aflu cel mai mic nr din lista diferit de cel gasit inainte
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min2 && arr[j] != min) {
                min2 = arr[j];
            }
        }
        int diff = min2 - min;
        System.out.println(min2 + "-" + min + "=" +diff);
    }
}
