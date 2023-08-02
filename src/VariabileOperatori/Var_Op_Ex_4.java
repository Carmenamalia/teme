package VariabileOperatori;

public class Var_Op_Ex_4 {
    public static void main(String[] args) {
/*Scrie un program care converteste din grade Fahrenheit in grade Celsius
De exemplu, pentru valoarea initiala:

int temperature = 95
programul ar trebui sa afiseze in consola valoarea 35 (valoarea in grade celsius)
*/
//(30°C x 1.8) + 32 = 86°F
//C = (F-32) / 1.8
        double F = 95;
        double C = (F- 32) / 1.8;
        System.out.println(C);

    }
}
