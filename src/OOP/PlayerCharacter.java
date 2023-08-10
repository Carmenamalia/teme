package OOP;

public abstract class PlayerCharacter {
    private String name;
    private int age;
    private int level;

    public PlayerCharacter(String name, int age) {
        this.name = name;
        this.age = age;
        this.level = 0;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public abstract void attack();

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       // if (age >= 18)  pot pune conditii
            this.age = age;

    }
    public void speak(){
        System.out.println("My name is " + this.name);
    }
}
