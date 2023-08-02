package Strings;

public class StringsEx2 {
    public static void main(String[] args) {
/*Scrie un program care sa concateneze doua String-uri, mai putin primul caracter din fiecare
Pentru "Java" si "Fundamentals", se va afisa in consola "avaundamentals".
 */
        String one = "Java";
        String two = "Fundamentals";
        System.out.println(one.substring(1)+two.substring(1));

    }
}
