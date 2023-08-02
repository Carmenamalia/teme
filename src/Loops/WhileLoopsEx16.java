import java.util.Scanner;

/* Atunci cand dai rest pentru un produs, vrei sa minimizezi numarul de monede pe care le dai ca rest.
Daca ai de ales ca pentru suma de 50 de centi sa dai rest 2 monede de 25 de centi, sau 5 monede de 10 centi, vei alege prima varianta.
Avem la dispozitie monede de 25 centi, 10 centi, 5 centi, 1 cent.
Programul trebuie sa citeasca de la tastatura valoarea restului si sa afiseze de cate monede este nevoie pentru a da rest,
respectand algoritmul din exemplu.
Programul nu trebuie sa afiseze de cate monede de fiecare tip este nevoie, ci de cate monede in total (chiar daca vor fi monede
de tipuri diferite)
 */
public class WhileLoopsEx16 {
    public static void main(String[] args) {
// citesc de la tastatura valoarea restului, in centi
// calculez cate monede de 25 pot sa ii dau si le adun la numarul total de monede
// scad valoarea monedelor de 25 din valoarea restului
// calculez cate monede de 10 pot sa ii dau si le adun la numarul total de monede
// scad valoarea monedelor de 10 din centii ramasi de dat ca rest
// calculez cate monede de 5 pot sa ii dau si le adun la numarul total de monede
// scad valoarea monedelor de 5 din centii ramasi de dat ca rest
// calculez cate monede de 1 pot sa ii dau si le adun la numarul total de monede
// scad valoarea monedelor de 1 din centii ramasi de dat ca rest
// afisez numarul total de monede
        Scanner scanner = new Scanner(System.in);
        int changeValue = scanner.nextInt();
        int totalCoins = 0;
        if (changeValue < 0) {
            System.out.println("the value is invalid, insert another:");
        }
        while (changeValue != 0) {
            if (changeValue > 25) {
                totalCoins = changeValue / 25;
                changeValue = changeValue - (totalCoins * 25);
                System.out.println(totalCoins + " coins of 25 cents");
                totalCoins = changeValue / 10;
                changeValue = changeValue - (totalCoins * 10);
                System.out.println(totalCoins + " coins of 10 cents");
                totalCoins = changeValue / 5;
                changeValue = changeValue - (totalCoins * 5);
                System.out.println(totalCoins + " coins of 5 cents");
                totalCoins = changeValue / 1;
                changeValue = changeValue - (totalCoins * 1);
                System.out.println(totalCoins + " coins of 1 cent");
                System.out.println(totalCoins);
            }

        }
    }
}



