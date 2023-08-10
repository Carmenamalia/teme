package ArraysExercises;

/* Scrie un program care sa adune toate preturile dintr-o lista
 (ca mai apoi sa fie afisata suma totala in cosul de cumparaturi):
De exemplu, pentru {1, 7, 3, 10, 9}, se va afisa in consola valoarea 30.
 */
public class ArraysEx2 {
    public static void main(String[] args) {
        int[] price = {1, 7, 3, 10, 9};
        int total = 0;

        for(int i = 0; i < price.length; i++){
            System.out.println(price[i]);//afiseaza preturile din lista
            total = total + price[i];//aflu totalul adunand fiecare element la suma initiala
        }
        System.out.println("total: " + total);//afisez totalul

    }
}
