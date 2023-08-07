package MyFitnesspalClone;

public class Product {
    String name;
    double fats;
    double carbs;
    double proteins;
    double calories;

    public Product(String name, double fats, double carbs, double proteins) {
        this.name = name;
        this.fats = fats;
        this.carbs = carbs;
        this.proteins = proteins;
        this.calories = computeCalories(fats,carbs,proteins);
    }
    /* Clasa Product va contine si operatiile pentru un produs

Metoda computeCalories() care tine de clasa
Metoda accepta ca si parametrii numarul de grame de grasimi, numarul de grame de carbohidrati si numarul de grame de proteine
Metoda returneaza numarul total de calorii
     */
    public static double computeCalories(double fats,double carbs,double proteins){
/*  * În 1 g de grăsime, 9 calorii.   fats*9
    *În 1 g de carbohidrați găsim 4 calorii.  carbs*4
    * În 1 g de proteine, 4 calorii. proteins*4
*/
        double calories = 0;
        calories = fats*9 + carbs*4 + proteins*4;
        return calories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", fats=" + fats +
                ", carbs=" + carbs +
                ", proteins=" + proteins +
                ", calories=" + calories +
                '}';
    }
}
