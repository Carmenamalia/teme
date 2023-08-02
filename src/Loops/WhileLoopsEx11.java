import java.util.Scanner;

public class WhileLoopsEx11 {
    public static void main(String[] args) {
/*Scrie un program care sa determine cat timp (in ani) ii ia unei populatii sa ajunga la o anumita marime.
Initial, pornim cu o populatie de n oi. In fiecare an, n/3 oi noi se nasc, si n/4 oi mor.

De exemplu, daca am pornit cu o populatie de n = 1200 de oi, in primul an 1200/3=400 de oi se nasc si
 1200/4=300 de oi mor.
Asa ca la sfarsitul anului vom avea 1200 + 400 - 300 = 1300 oi
Citeste de la tastatura populatia initiala (startSize) si populatia la care vrei sa ajungi (endSize)\

Daca utilizatorul introduce un startSize mai mic decat 9, cere-i sa introduca valori in continuare pana cand
introduce minim numarul 9
Daca utilizatorul introduce un endSize mai mic decat startSize-ul introdus enterior, cere-i sa introduca valori
in continuare pana cand introduce o valoare mai mare decat startSize
Programul trebuie sa calcueze numarul de ani necesari ca populatia sa creasca la valoarea endSize
 */
        Scanner scanner = new Scanner(System.in);//endSize = startSize + birth - death
        int startSize = 0;
        int endSize = 0;
        do {
            startSize = scanner.nextInt();
        } while (startSize < 9);

        do {
            endSize = scanner.nextInt();
        } while (endSize < startSize);
        System.out.println(calculateYears(startSize, endSize));
    }

    public static int calculateYears(int startSize, int endSize) {
        int years = 0;

        while (startSize < endSize) {
            //adun la numarul initial de oi diferenta dintre cele nascute si cele mancate
            int newSheeps = startSize / 3;
            int eatenSheeps = startSize / 4;
            startSize = startSize + newSheeps - eatenSheeps;
            //a mai trecut un an
            years++;
        }
        return years;
    }


}



