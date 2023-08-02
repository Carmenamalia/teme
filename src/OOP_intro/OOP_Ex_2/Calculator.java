package OOP_intro.OOP_Ex_2;

public class Calculator {
    /* Creeaza un program care sa simuleze un calculator
    Clasa nu are niciun atribut, dar are ca si functionalitati:

    * suma a doua numere
    * diferenta a doua numere
    * factorialul unui numar
    Creeaza un calculator in Main si apeleaza-i comportamentele.
     */
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int diff(int x, int y) {
        return x - y;
    }
    public static int fact(int x){
        int fact = 1;
        for(int i = 1;i<=x;i++){
         fact*=i;

        }return fact;

    }

}
