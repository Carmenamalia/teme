package VariabileOperatori;
/*Scrie un program care sa interschimbe valorile a doua variabile de tip int
De exemplu, pentru valorile initiale:

int a = 10;
int b = 20;
ar trebui sa se afiseze in consola valoarea 20 cand il printezi pe a, si valoarea 10 cand il printezi pe b
*/

public class Var_Op_Ex_2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int d = 0;
        System.out.println(a);
        System.out.println(b);
         d = a;
         a = b;
         b = d;
        System.out.println(a);
        System.out.println(b);


    }
}
