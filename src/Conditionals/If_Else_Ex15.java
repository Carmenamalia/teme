package Conditionals;
/* Scrie un program care intreaba utilizatorul care este parola secreta.
Citeste de la tastatura raspunsul utilizatorului.\
Printeaza apoi "corect", daca utilizatorul a raspuns cu 42, "forty-two" sau "forty-two",
 indiferent daca a folosit litere mari sau mici
Atlfel, printeaza "incorect"

 */
import java.util.Scanner;

public class If_Else_Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("care e parola secreta?");
        String answer = scan.nextLine();
        if((answer.equalsIgnoreCase("forty-two")) || (answer.equals("42"))){
            System.out.println("corect!");
        }else{
            System.out.println("incorect!");
        }


    }
}
