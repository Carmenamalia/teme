package OOP.ex3animalshelter;

public class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }


    public void greeting() {
        System.out.println(this.getName() + "woof");
    }

    public void greeting(Dog anotherDog){
        System.out.println(this.getName() + " face woof catre " + anotherDog.getName());
    }
}
