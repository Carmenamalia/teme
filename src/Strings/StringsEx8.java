package Strings;

import java.util.Arrays;

public class StringsEx8 {
    public static void main(String[] args) {
/* Scrie un program care sa inverseze toate cuvintele dintr-un text. Cuvintele sunt separate de spatii.
De exemplu, pentru “This is Java” se va afisa: “Java is This”
 */
        String myText = "This is Java";
        String reverseText = "";
        // char[] text = myText.toCharArray();
        String[] split = myText.split(" ");
        System.out.println(Arrays.toString(split));
        for (int i = split.length-1;i>=0;i--){
            reverseText+=(split[i]+" ");

        }System.out.println(reverseText);
    }

}
