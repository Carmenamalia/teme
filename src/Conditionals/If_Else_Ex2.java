package Conditionals;

import java.util.Scanner;

/* Produci software pentru un fierbator de apa. Citeste de la tastatura temperatura curenta a apei si:
Var1: afiseaza un mesaj corespunzator daca temperatura este mai mare de 100 de grade (apa fierbe)
Var2: afiseaza un mesaj corespunzator daca apa fierbe, si un alt mesaj corespunzator in caz contrar
Var3: afiseaza un mesaj corespunzator daca temperatura este mai mare de 100 de grade (apa fierbe),
 un alt mesaj daca temperatura este mai mica decat 50 de grade (apa este in curs de fierbere)
 si un altul daca apa are temperatura intre 50 si 100 de grade (apa este aproape fiarta)

 */
public class If_Else_Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Care e temperatura apei?");
        int tempApa = scanner.nextInt();
        if (tempApa >= 100){
            System.out.println("apa fierbe");
       // }else {
        //    System.out.println("apa nu fierbe");
        }else if (tempApa < 50){
            System.out.println("apa e in curs de fierbere");
        }else if (tempApa < 100 && tempApa >=50){
            System.out.println("apa e aproape fiarta");
        }

    }
}
