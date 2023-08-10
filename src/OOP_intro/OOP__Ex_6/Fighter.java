package OOP_intro.OOP__Ex_6;

public class Fighter {
/* Un luptator are urmatoarele atribute:
 *name
 *health
*damagePerAttack (cat din health i se scade celuilalt jucator, atunci cand jucatorul curent ataca)
 */

    String name;
    int health;
    int damagePerAttack;

    public Fighter() {

    }

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

}
