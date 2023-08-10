package OOP;

public class Game {
    public static void main(String[] args) {
//        PlayerCharacter character = new PlayerCharacter("nume",45);
//        System.out.println(character.getName());
//        character.setName("name2");
//        System.out.println(character.getName());

        Archer archer = new Archer("Legolas",18,100);
        System.out.println(archer.getName());//mosteneste si getter si setter din PlayerCharacter

        System.out.println(archer instanceof Archer);
        System.out.println(archer instanceof PlayerCharacter);

        System.out.println(archer instanceof Object);//este o instanta de Object

        PlayerCharacter character1 = new Archer("Legolas2",12,100);
        character1.attack();

       PlayerCharacter character2 = new Wizard("Gandalf",90,50);
        character2.attack();

        doAllPlayerActions(character1);
        doAllPlayerActions(character2);

        Wizard wizard = (Wizard) character2;
        wizard.levelUp();
    }
    public static void doAllPlayerActions(PlayerCharacter playerCharacter){
        playerCharacter.speak();
        playerCharacter.attack();

    }
}
