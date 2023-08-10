package OOP_intro.OOP__Ex_6;

import java.util.Scanner;

public class Main {
    /* Jocul trebuie sa aiba o functie care sa returneze numele castigatorului unei lupte la care participa doi luptatori.
     Fiecare lupator ataca pe rand celalalt luptator si cel care il omoara pe celalalt primul, castiga (adica castiga cel care ramane in viata).
      Un jucator moare atunci cand health-ul lui este mai mic sau egal cu 0.
     Se vor citi de la tastatura atributele celor 2 jucatori, dar si care dintre jucatori va ataca primul.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fighter fighter1 = new Fighter("fighter1",100,10);
        Fighter fighter2 = new Fighter("fighter2",100,11);
        System.out.println(declareWinner(fighter1,fighter2,"fighter1"));


    }
    public static void getFighter(String name,int health,int damagePerAttack,Scanner scanner){
name = scanner.nextLine();
health = scanner.nextInt();
damagePerAttack = scanner.nextInt();
    }
    public static String declareWinner(Fighter fighter1,Fighter fighter2,String firstAttackerName){
        //stabilim cine ataca primul
            //compar firstAttacker cu numele lui fighter1 si daca sunt egale atunci retin intr-o variabila cu numele de firstAttacker pe fighter1
            //daca nu retin intr-o variabila firstAttacker pe fighter2
        //atat timp cat viata amandurora e >-0 jocul continua
        //jocul e o metoda:  scadem din viata celui de al doilea damage-ul pe care il da primul
        //daca viata lui al doilea e <=0 returnez numele primului
        //scadem din viata primului damage-ul pe care il da al doilea
        //daca viata primului e <=0 returnez numele celui de al doilea
        Fighter firstAttacker = new Fighter();
        Fighter secondAttacker = new Fighter();
       if (firstAttackerName.equals(fighter1.name)){
           firstAttacker = fighter1;
           secondAttacker = fighter2;
       }
       else{
           firstAttacker = fighter2;
           secondAttacker = fighter1;
       }
      //  Fighter   firstAttacker =  firstAttackerName.equals(fighter1.name)? fighter1: fighter2;
        // Operație ternară (Ternary operation)
        //The ternary operator is a conditional operator which evaluates either of two expressions – a true expression and a false expression
        // – based on a conditional expression that you provide. Here's the syntax: condition ? trueExpression : falseExpression.
        // You have the condition which returns a truthy or falsy value.

       while (firstAttacker.health>0 && secondAttacker.health>0){
           secondAttacker.health-=firstAttacker.damagePerAttack;
           if (secondAttacker.health<=0){
               return firstAttacker.name;
           }
           firstAttacker.health-=secondAttacker.damagePerAttack;
           if (firstAttacker.health<=0){
               return secondAttacker.name;
           }
       }return "";
    }
}
