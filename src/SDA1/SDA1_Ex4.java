package SDA1;

public class SDA1_Ex4 {
/* Verifica daca un String este o rotatie a altui String.
De exemplu, String-ul "cab" este rotatie a string-ului "abc", dar string-ul "acb" nu este rotatie a string-ului "abc".
 */
    //abc cab bca abc
    //rotim de (nr de caractere -1) ori
    //cum facem rotatia: iau ultimul caracter si il pun in alt string pe prima pozitie
    //apoi parcurg str original pana la length-1 si adaug in str nou ,pe rand fiecare caracter
    //apoi verific rotatia
    //putem face o metoda de rotate si sa rotesc de mai multe ori pana obtin str dorit
public static void main(String[] args) {
    // sau putem concatena str cu el insusi "abcabc" si sa verificam daca noul str contine str "cab"
    System.out.println(isRotation("abc","cab"));
    System.out.println(isRotation("abc","cba"));
}
public static boolean isRotation(String s1,String s2){
    if (s1.length()!=s2.length()){
        return false;
    }
    String doubleString = s1+s1;
    return doubleString.contains(s2);
}
}
