package ArraysExercises;


import java.util.Scanner;

public class ArraysEx22_ {
    public static void main(String[] args) {
//Scrie un program care citeste de la tastatura un numar n, si genereaza un array bidimensional de marime n.
//Fiecare element din array-ului bidimensional va fi un element generat random.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        int i;
        int x = 0;
        int j = 0;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < i; j++) {

                x = scanner.nextInt();
                array[i][j] = x;
            }
        }
        System.out.print(array[i][j]);


    }

}
