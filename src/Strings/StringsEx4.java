package Strings;

public class StringsEx4 {
    public static void main(String[] args) {
  /* Scrie un program care sa inlocuiasca fiecare animal care incepe cu litera "B" cu "Lion", intr-un array de animale.
Pseudocod:

Pentru fiecare animal din lista de animale:
   Daca primul caracter al animalului este 'B', atunci la acel index pun valoarea "Lion".
De exemplu, array-ul {"Aardvark", "Bear", "Bobcat", "Cheetah", "Dog"} va deveni
{"Aardvark", "Lion", "Lion", "Cheetah", "Dog"}
 */
        String[] animals = new String[]{"Aardvark", "Bear", "Bobcat", "Cheetah", "Dog"};
//ca sa accesez o liera dintr-un string din array-ul de stringuri:
// spre ex prima litera din al doilea element:  animals[1].charAt(0) sau animals[1].toCharArray()[0]
// sau  char[] chars = animals[1].toCharArray();
//      System.out.println(chars[0]);
// ca sa pargurg fiecare caracter din array-ul de stringuri:
        for (int i = 0; i < animals.length; i++) {
            // sau pot baga animals[i] intr-o variabila de tip String
            // sau variabila sa fie de tip char array (char[]) cu valoarea animals[i].toCharArray()
            //si atunci j va fi < decat lungimea array-ului de tip char
            //si vom printa array-ul char de j
//              for (int j = 0;j< animals[i].length();j++){
//                  System.out.print(animals[i].charAt(j) + " ");
//              }
            //  if (animals[i].charAt(0) == 'B') {//sau:
            if (animals[i].toLowerCase().startsWith("b")) {
                animals[i] = "Lion";
            }
        }
        for (int j = 0; j < animals.length; j++) {
            System.out.print(animals[j] + " ");
        }
    }
}

