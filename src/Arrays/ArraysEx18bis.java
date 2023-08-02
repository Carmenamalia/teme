package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEx18bis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list1 = {1, 7, 3, 10, 9};
        int[] list2 = new int[list1.length + 1];
        int index = 2;
        int x = scanner.nextInt();
        int j = 0;
        for(int i = 0;i< list1.length;i++){
            if(i == index){
                list2[j] = x;
                j++;
            }
            list2[j] = list1[i];
            j++;
        }System.out.print(Arrays.toString(list2));
    }
}
