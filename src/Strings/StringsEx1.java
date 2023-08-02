package Strings;

public class StringsEx1 {
    public static void main(String[] args) {
/*Scrie un program care sa extraga prima jumatate a unui String de lungime para
De exemplu, pentru "programmer", se va afisa in consola "progr".
 */
//        String str = "programmer";
//         System.out.println(str.length());
//        System.out.println(str.length() / 2);
//        String half = str.substring(0, str.length() / 2);
//        System.out.println(half);

        String str = "programmer";
        str = str.substring(0,str.length()/2);
        System.out.println(str);
    }
}
