package ArraysExercises;

import java.util.Arrays;

public class ArraysEx23_ {
    public static void main(String[] args) {
        //Gaseste cea mai mica diferenta dintre doua numere dintr-un array.
        int[] arr = {2, 6, 1, 5, 8, 9, 3};
        int[] diff = new int[0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                diff = new int[]{arr[j] - arr[i]};
//vreau sa bag in array fiecare dif una cate una
            }
        }
        System.out.println(Arrays.toString(diff));
    }
}
