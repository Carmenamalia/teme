package SDA1;

public class SDA1_Ex6 {
 /* Scrie un program care sa codifice un String dupa metoda "Run Length Encoding".
Aceasta metoda detecteaza secventele de litere identice dintr-un String si le transforma intr-o cifra, care reprezinta de cate ori apare
acea litera in acea secventa. De exemplu, String-ul "AAAAAAAAAAAAABBCCCCDD" va fi convertit in "9A4A2B4C2D". Observa ca nu se foloseste 13A,
 secventele maxime fiind de 9 litere.
  */
    // 9 de A,4 de A, 2 de B,4 de C,2 de D
   //"9A4A2B4C2D"
    //run lenght encoding
 public static void main(String[] args) {
     //parcurg  toate car de la index 1
     //verific daca car de la pozitia curenta este diferit de cel de la pozitia anterioara || contorul este 9
        //pun contorul si car de la pozitia anterioara in stringul codificat
        //resetez contorul la 0
     //contorizez,
     System.out.println(rle("AAAAAAAAAAAAABBCCCCDD"));

 }
 public static  String rle(String s){
     int currentLenght = 1;
     String encodingString = "";
     for (int i = 1;i<s.length();i++){
         char previousCharacter = s.charAt(i-1);
         char currentCharacter = s.charAt(i);
         if (previousCharacter !=currentCharacter || currentLenght==9){
             encodingString+=currentLenght;
             encodingString+=previousCharacter;
             currentLenght = 0;
         }
         currentLenght++;
     }
     return encodingString;
 }
}

