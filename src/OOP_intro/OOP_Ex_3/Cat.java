package OOP_intro.OOP_Ex_3;

import java.util.Scanner;

public class Cat {
    /* Creeaza un program care sa numere cate pisici se nasc.
    Implementeaza o clasa Cat si o metoda getNumberOfCats(), care va returna numarul de pisici create. Clasa Cat va avea atributele:

    name
    counter - in care vom retine cate pisici s-au creat
    Atunci cand o noua pisica se creeaza, counter-ul trebuie sa fie incrementat.
     */
    String name;
    int counter = 0;

    public Cat(){}
    public Cat(String name) {
        this.name = name;


    }
    public Cat getCat(String name){
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        return new Cat(name);
    }

}
