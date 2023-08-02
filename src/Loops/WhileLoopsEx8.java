import java.util.Scanner;

public class WhileLoopsEx8 {
    public static void main(String[] args) {
/* Scrie un program care inverseaza cifrele unui numar, numarul fiind citit de la tastatura.
Bazeaza-te pe faptul ca ultima cifra a oricarui numar este, de fapt, restul impartirii acelui numar la 10.
In plus, catul impartirii acelui numar la 10 este, de fapt, numarul initial, fara ultima cifra.
 */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int noriginal = n;
        int ninversat = 0;
/*
Am numarul abcd si vreau dcba
  iau ultima cifra cu modulo, o pun intr-o variabila, dupa care elimin ultima cifra.
 Apoi formez numarul inversat pornind de la zero, adaugand o cifra zecimala la care adun cifra pe care am gasit-o.
 */
        while (n != 0) {
            //aflu ultima cifra care este restul impartirii nr la 10
            int cifra = n % 10;
            //adaug cifra gasita la nr invers inmultit cu 10 ,asa ii da o noua pozitie cifrei
            ninversat = ninversat * 10 + cifra;
            n /= 10; //impart la 10 ca sa raman fara ultima cifra

        }
        if (noriginal==ninversat){
            System.out.println("palindrom");
        } else{
            System.out.println("nu este palindrom");
        }
        System.out.println(ninversat);
    }
}

