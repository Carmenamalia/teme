import java.util.Scanner;

/* Scrie un program care calculeaza factorialul unui numar n, n fiind citit de la tastatura
De exemplu, factorialul numarului 3 este 1 * 2 * 3 = 6
Factorialul numarului 4 este 1 * 2 * 3 * 4 = 24
Factorialul numarului 5 este 1 * 2 * 3 * 4 * 5 = 120
Practic trebuie inmultite toate numerele consecutive pana la numarul citit de la tastatura.
 */
public class WhileLoopsEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getFactorial(n));
//n=5    5*4*3*2*1

    }

    public static int getFactorial(int n) {
        if(n == 1){
            System.out.println("n" + "!" + " = 1");
            return 1;
        }else{
            System.out.println(n + "! = " + n + " * " + (n - 1) + "!");
            return  n * getFactorial(n - 1);
        }

    }
    /*sau cu while:
    int n=
    int i = 1;
    int factorial = 1;
      while(i<=n){
        factorial *= 1;
        i++;
     }System.out.println(factorial);

     */

}


