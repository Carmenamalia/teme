package Conditionals;
/* Cursantii se pot inscrie la un curs daca indeplinesc toate urmatoarele 3 conditii:
Au platit costul cursului sau au o bursa pentru curs
Exista locuri disponibile in curs
Perioada de inscrieri este deschisa, sau au un cont premium
De asemenea, vor primi un discount la urmatorul curs daca indeplinesc cel putin una dintre urmatoarele
 3 conditii: au completat cel putin 2 cursuri in trecut si au un rating mediu mai mare decat
  8 din 10 de la instructori au recomandat plaftorma la cel putin 3 prieteni in trecut.
Citeste de la tastatura urmatoarele informatii:
-Daca studentul a platit costul cursului sau nu
-Daca studentul are bursa sau nu
-Numarul de locuri disponibile la curs
-Daca perioada de inscrieri este deschisa sau nu
-Daca studentul are cont premium sau nu
-Numarul de cursuri completate in trecut de catre sutdent
-Rating-ul mediu obtinut de student
-Numarul de prieteni recomandati de student
Apoi implementeaza logica necesara
 */
import java.util.Scanner;

public class If_Else_Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("studentul a platit?");
        boolean isPayed = scan.nextBoolean();
        System.out.println("studentul are bursa");
        boolean haveScShip = scan.nextBoolean();
        System.out.println("cate locuri mai sunt disponibile?");
        int place = scan.nextInt();
        System.out.println("perioada de inscrieri este deschisa?");
        boolean isOpen = scan.nextBoolean();
        System.out.println("studentul are cont premium?");
        boolean isPremium = scan.nextBoolean();
        System.out.println("cursuri completate in trecut");
        int curs = scan.nextInt();
        System.out.println("care e ratingul mediu?");
        int rate = scan.nextInt();
        System.out.println("cati prieteni recomandati");
        int friend = scan.nextInt();
//Au platit costul cursului sau au o bursa pentru curs
        //Exista locuri disponibile in curs
        //Perioada de inscrieri este deschisa, sau au un cont premium
        if ((isPayed || haveScShip) && (isOpen || isPremium) && (place != 0)) {
            System.out.println("cursantii se pot inscrie la curs");
        } else {
            System.out.println("cursantii nu se pot inscrie");
            //au completat cel putin 2 cursuri in trecut si au un rating mediu mai mare decat 8 din 10 de la instructori
            // au recomandat plaftorma la cel putin 3 prieteni in trecut.
        }
        if ((curs >= 2) && ((rate >= 8) && (rate <= 10)) && (friend >= 3)) {
            System.out.println("cursantii primesc un discount la urmatorul curs");
        } else {
            System.out.println("cursantii nu primesc un discount la urmatorul curs");
        }
    }
}