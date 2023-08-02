import java.util.Scanner;

public class WhileLoopsEx12 {
    public static void main(String[] args) {
/*Scrie un program care sa determine in cati ani economiile tale vor creste la target-ul pe care ti l-ai propus.
Sa presupunem ca deschizi un cont de economii cu o suma initiala de bani, la care se adauga in fiecare an o dobanda.
De exemplu, daca deschizi un cont de 1000 de lei cu o dobanda anuala de 10%,
 dupa primul an vei avea 1000 + 0.1 * 1000 = 1100 de lei.
Apoi, dupa al doilea an vei avea 1100 + 0.1 * 1100 = 1210
Si tot asa, in fiecare an.
Citeste de la tastatura suma initiala, procentul de dobanda anual, si suma target la care vrei sa ajungi.
Apoi calculeaza cati ani e nevoie sa treaca pana ca in cont sa ajungi la suma target.
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("suma initiala?");
        double sumaIn = scanner.nextInt();
        System.out.println("dobanda anuala in procent");
        double dobAn = scanner.nextInt();
        System.out.println("suma target?");
        double sumTarget = scanner.nextInt();
        int years = 0;
        do {//atat timp cat suma initiala e mai mica decat targetul
            sumaIn = sumaIn + ((dobAn * sumaIn) / 100);//calculez suma dintre suma initiala si dobanda pe an
            System.out.println(sumaIn);
            years++;
        } while (sumaIn < sumTarget);{

        }
        System.out.println(years);
    }

}

