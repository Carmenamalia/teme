package Conditionals;
/* Trebuie sa tinem cont de urmatoarele conditii: Cladura se va porni daca temperatura este
 mai mica decat 20 de grade si fie este iarna, fie este cineva acasa Luminile se vor porni daca
 afara este intuneric si daca cineva este acasa. Totusi, daca persoana care este acasa doarme,
  atunci luminile nu se vor porni Alarma se va activa daca nimeni nu este acasa si fie este intuneric,
   fie fereastra este deschisa.
Casa are multi senzori care primesc informatii:
Valoarea temperaturii
Daca este sau nu cineva acasa
Daca este sau nu intuneric afara
Daca este sau nu fereastra deschisa
Daca persoana din casa doarme
Daca este iarna
Citeste de la tastatura valorile senzorilor si apoi implementeaza logica necesara.
 */

import java.util.Scanner;

//cald=temp<20&&(e iarna || e acasa)
//lumini= intuneric&& eacasa&& nu doarme
//alarma = nu e acasa &( e intuneric || fereastra deschisa)
public class If_Else_Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("care e temperatura?");
        int temp = scan.nextInt();
        System.out.println("Este intuneric afara?");
        boolean isDarkOut = scan.nextBoolean();
        System.out.println("este cineva acasa?");
        boolean isHome = scan.nextBoolean();
        System.out.println("este fereastra deschisa?");
        boolean isWOpen = scan.nextBoolean();
        System.out.println("persoana doarme?");
        boolean isSleep = scan.nextBoolean();
        System.out.println("este iarna?");
        boolean isWinter = scan.nextBoolean();

        if ((temp < 20) && (isWinter || !isHome)) {
            System.out.println("porneste caldura");
        } else if (isDarkOut && isHome && !isSleep) {
            System.out.println("aprinde lumina");
        } else if (!isHome && (isDarkOut || isWOpen)) {
            System.out.println("porneste alarma");
        }
    }
}


