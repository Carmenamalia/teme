package Conditionals;
/* Dorim sa implementam logica unui lift.
Trebuie sa tinem cont de urmatoarele conditii:
-Daca etajul curent este mai mic decat etajul dorit, afisam in consola faptul ca liftul urca
-Daca etajul curent este mai mare decat etajul dorit, afisam in consola faptul ca liftul coboara
-Daca etajul curent este acelasi cu etajul dorit, afisam in consola ca usile se deschid
-Liftul poate functiona doar daca nu este in mentenanta
-Daca liftul este la etajul 0 si nu este in mentenanta, afisam in consola ca usile sunt deschise
 (adica tot timpul usile raman deschise la parter)
Citeste de la tastatura etajul curent, etajul dorit, si daca liftul este in mentenanta sau nu.
 Apoi implementeaza logica necesara.
 */

import java.util.Scanner;

public class If_Else_Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("care e etajul acum?");
        int etaj = scan.nextInt();
        System.out.println("la ce etaj vrei?");
        int et = scan.nextInt();
        System.out.println("este in mentenanta?");
        boolean isMent = scan.nextBoolean();
        if (isMent) {
            System.out.println("liftul nu functioneaza");
        }else if (etaj < et) {
            System.out.println("liftul urca");
        }else if (etaj == 0) {
                System.out.println("usile sunt deschise");
        } else if (etaj > et) {
            System.out.println("liftul coboara");
        } else if (etaj == et){
            System.out.println("usile se deschid");
        }

    }
}
