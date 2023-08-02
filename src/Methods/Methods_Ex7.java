package Methods;

import java.util.Scanner;

/* Un colet poate fi in 4 etape inainte de a ajunge la destinatie: preluare, procesare, trimitere,
livrare.
Citeste de la tastatura numarul de identificare al coletului.
Creeaza cate o metoda pentru fiecare dintre etape, care sa returneze un mesaj cu starea pachetului.
De exemplu, metoda pentru etapa de preluare ar putea returna urmatorul mesaj:
"Coletul cu numarul 32445 a fost preluat".
 */
public class Methods_Ex7 {
    public static void main(String[] args) {
        System.out.println("nr coletului?");
        int nrColet = giveColetNo(0);
        preluare(nrColet);
        procesare(nrColet);
        trimitere(nrColet);
        livrare(nrColet);
    }
    public static int giveColetNo(int nrColet) {
        Scanner scanner = new Scanner(System.in);
        nrColet = scanner.nextInt();
        return nrColet;
    }
    public static void preluare(int nrColet) {
        System.out.println("Coletul nr " + nrColet + " a fost preluat");
    }
    public static void procesare(int nrColet) {
        System.out.println("Coletul nr " + nrColet + " este procesat");
    }
    public static void trimitere(int nrColet) {
        System.out.println("Coletul nr " + nrColet + " este trimis");
    }
    public static void livrare(int nrColet) {
        System.out.println("Coletul nr " + nrColet + " a fost livrat");
    }
}
