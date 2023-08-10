package ArraysExercises;

/* 9. Scrie un program care sa afiseze cel mai mare si cel mai mic pret dintr-o lista de preturi.
De exemplu, pentru {1, 7, 3, 10, 9}, se vor afisa in consola valorile 1 si 10
 */
public class ArraysEx9 {
    public static void main(String[] args) {
        int[] priceList = {1, 7, 3, 10, 9};
        int min = 100;//sau int min = prices[0]; compar cu primul element din array
        int max = priceList[0];
        //enumar si compar fiecare element
        for (int i = 0; i < priceList.length; i++) {

            if (priceList[i] < min) { //compar fiecare elem cu min
                min = priceList[i]; //minimul nou va fi elem cel mai mic gasit
                ;
            } else if (priceList[i] >max) {
                max = priceList[i];

            }
        }System.out.println("elementul minim: " + min);
        System.out.println("elementul maxim: " + max);

    }
}

