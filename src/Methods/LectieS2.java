package Methods;

import java.util.Scanner;

public class LectieS2 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
       // System.out.println("what's your name?");//vrem sa punem asta intr-o functie
      //  String answer = scanner.nextLine();
       String answer = getName(); //punem numele functiei intr-o variabila,deoarece trebuie sa ne apara ce ne returneaza
        sayHello(answer);  //apelam functia ,ii dam ca si parametru answer(numele)
    }

    public static void sayHello(String to) {   //functia care sa printeze nu returneaza nimic,deci e void
        System.out.println("hello " + to);//am pus variabila 'to' care e un parametru
    }

    public static String getName(){ //nu avem parametrii pt ca vrem sa luam de la tastatura raspuns
        Scanner scanner = new Scanner(System.in);
        System.out.println("what's your name?");
        String answer = scanner.nextLine();
        return answer;
    }

}
