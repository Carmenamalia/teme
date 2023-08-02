package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEx22_ {
    public static void main(String[] args) {
//Scrie un program care citeste de la tastatura un numar n, si genereaza un array bidimensional de marime n.
//Fiecare element din array-ului bidimensional va fi un element generat random.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[][] array = new int[n][x];
     //   cum inserez in array un element generat random?
//m-am blocat aici
        System.out.println(Arrays.toString(array));
    }

}
