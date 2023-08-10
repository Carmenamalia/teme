package OOP;

public class Wizard extends PlayerCharacter implements Playable{

    private int power;

    public Wizard(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void attack(){
        System.out.println("Attacking with power " + power);
    }

    @Override
    public void levelUp() {
        //level up wizard
        setLevel(getLevel()+1);
        power+=50;
    }
}
