package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

/*Construieste un array bazat pe input-ul utilizatorului.
Cat timp utilizatorul introduce numere de la tastatura (maxim 100 de numere), adauga-le intr-un array
si apoi afiseaza elementele array-ului.
 */
public class ArraysEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myList = new int[10];//am stabilit lungimea array-ului la 10 ca sa pot verifica

        for (int i = 0; i < myList.length; i++) {
            myList[i] = scanner.nextInt();//citeste pe rand nr introduse si le baga in lista

        }

            System.out.println(Arrays.toString(myList));


    }
}



