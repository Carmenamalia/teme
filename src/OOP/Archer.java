package OOP;

public class Archer extends PlayerCharacter implements Playable{
    private int numberOfArrows;

    public Archer(String name,int age,int numberOfArrows){
        super(name,age);
        this.numberOfArrows = numberOfArrows;
    }
    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
    public void attack(){
        numberOfArrows--;
        System.out.println("Number of arrows remain: " + numberOfArrows);
    }

    @Override
    public void levelUp() {
        //level up archer
        setLevel(getLevel()+1);
        numberOfArrows+=100;
    }
}
