package Strings;

public class StringsEx13 {
    public static void main(String[] args) {
/* Scrie un program care sa numere literele, spatiile, numerele, si celelalte caractere dintr-un String. (folositi metodele String-ului)
De exemplu, pentru “Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33”, se va afisa in consola: "23 litere, 9 spatii, 8 numere, 6 alte caractere".
 */
        String text = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
       int countDigit = 0;
       int countLetter = 0;
       int countWhitespace = 0;
       int countOtherChar = 0;

       for (int i =0;i<text.length();i++){
           if (Character.isDigit(text.charAt(i))){
               countDigit++;
           }
            if (Character.isLetter(text.charAt(i))){
                countLetter++;
            }
            if (Character.isWhitespace(text.charAt(i))){
                countWhitespace++;
            }
            if ((!Character.isDigit(text.charAt(i)))&&(!Character.isLetter(text.charAt(i)))&&(!Character.isWhitespace(text.charAt(i)))){
                countOtherChar++;
           }

       } System.out.print(countLetter + " litere, " + countWhitespace + " spatii, " + countDigit + " numere, " + countOtherChar +" alte caractere");
    }
}
