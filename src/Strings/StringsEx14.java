package Strings;

import java.util.Scanner;

public class StringsEx14 {
    public static void main(String[] args) {
/*Scrie un program care sa citeasca un String de la tastatura in format camel case si sa il printeze apoi in format snake case.\
De exemplu, pentru "thisIsAVariabile", se va afisa "this_is_a_variable".
Presupune ca input-ul citit de la tastatura va fi in format camel case.

 */
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
        String str = "FromCamelCaseToSnakeCase";
        //creez un string gol
        String result = "";
        //parcurg stringul camelcase
        for (int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            //daca un caracter e uppercase
            if (Character.isUpperCase(c)) {
                //il adaug in result si il transform in lowercase
                result = result + Character.toLowerCase(c);
            }else{
                //adaug si caracterele lowercase din string
                result = result + c;
            }
        }
        System.out.println(result);
    }
}
