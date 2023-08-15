package Strings;

public class StringsEx18 {
    public static void main(String[] args) {
/* Scrie un program care sa codifice vocalele din cuvinte prin cifre.
Regula este ca litera a (indiferent daca este mica sau mare) se codifica cu cifra 4, e cu 3, i cu 1, o cu 0 si u cu 7.
De exemplu, pentru "antrenor" se va afisa "4ntr3n0r".
 */
       String str = "nestiutoare";
        System.out.println("nestiutoare");
       String str2 = "";
       for (int i = 0;i<str.length();i++){
           char strCh = str.charAt(i);
           if (Character.isLetter(strCh)){
               str2 =str.replace("a","4");
               str2 =str2.replace("e","3");
               str2 =str2.replace("i","1");
               str2 =str2.replace("o","0");
               str2 =str2.replace("u","7");

           }

       }
        System.out.println(str2);
    }
}
