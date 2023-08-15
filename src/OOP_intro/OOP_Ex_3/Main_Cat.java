package OOP_intro.OOP_Ex_3;

import java.util.Scanner;

public class Main_Cat {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat();

        getNumberOfCats(cat);//apelez metoda care numara pisicile
        System.out.println(cat.counter + " pisici"); //afisez nr de pisici
    }

    public static int getNumberOfCats(Cat cat){
      do {
          cat.getCat(cat.name); //apelez metoda getCat
          cat.counter++; //numar pisicile
      }while (cat.counter<3); //atat timp cat pisicile sunt mai putin de 3
        return cat.counter; //returnez nr de pisici
    }
}
