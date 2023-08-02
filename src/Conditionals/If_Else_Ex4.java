package Conditionals;

/*Avand la dispozitie o variabila care stocheaza un numar, afiseaza in consola daca numarul este par sau impar.
De exemplu, pentru valoarea initiala:
int a = 12
se va afisa in consola textul "numarul este par"
 */
public class If_Else_Ex4 {
    public static void main(String[] args) {
        int number = 34;

        if(number % 2 == 0){
           System.out.println("numarul este par");
       }else{
           System.out.println("numarul este impar");
        }

    }

//    public static boolean isEven(int number) {
//        boolean isEven = true;
//        if(number % 2 != 0){
//            isEven = false;
//            return isEven;
//
//        }return isEven;

}
