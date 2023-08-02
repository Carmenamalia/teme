package Strings;

public class StringsEx6 {
    public static void main(String[] args) {
/*Scrie un program care citeste de la tastatura un String si ii inverseaza caracterele.
De exemplu, String-ul "java" devine "avaj".
 */
        String word = "java";
        String reverseWord = "";
        for (int i = word.length()-1;i>=0;i--) {
           // reverseWord+=word.charAt(i);
            reverseWord = String.valueOf(word.charAt(i));

        }
        System.out.print(reverseWord);
        //daca vrem sa facem ca la array:
        char[] wordChars = word.toCharArray();
        for (int i = 0;i< wordChars.length/2;i++){
            char temp = wordChars[i];
            wordChars[i] = wordChars[wordChars.length-i-1];
        wordChars[wordChars.length-i-1] = temp;

        }

    }
}
