package OOP_intro.OOP_Ex_1;

public class Dog {
/* Creeaza un program care sa simuleze un caine
Creeaza clasa Dog care are ca si atribute nume, culoare si rasa. Comportamentele cainelui sunt "bark" (adica se afiseaza in consola "woof")
si "run" (adica se afiseaza in consola "dog is running"). Creeaza mai multi caini in Main si apeleaza-le comportamentele.
 */
    String name;
    String color;
    String breed;
public Dog(){}
    public Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public void bark(){
        System.out.println("woof");
    }
    public void run(){
        System.out.println("dog running");
    }
}
