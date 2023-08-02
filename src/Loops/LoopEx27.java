package Loops;

import java.util.Scanner;

/* Printeaza aceeasi jumatate de piramida (doar ca acum formata din numere), in functie de un numar n citit de la tastatura.
0
01
012
0123
01234
 */
public class LoopEx27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0;i< n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
