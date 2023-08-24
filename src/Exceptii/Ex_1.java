package Exceptii;

public class Ex_1 {
    /* Citeste de la tastatura un string care reprezinta un array.
    De exemplu, vei citi string-ul "1 7 10 2 6 5", adica un string format din numere separate de cate un spatiu.

    Defineste o functie care extrage numerele din string si returneaza un array de numere intregi (format din acele numere extrase)

    Foloseste metoda parseInt() pentru a converti din string in numar si trateaza cazul exceptional in care nu se poate converti.
     De exemplu, pentru "1 abc 10 2 6 5", abc nu se va putea converti in numar, si atunci se va renunta cu totul la generarea array-ului.
    */
    public static void main(String[] args) {
        String s = "1 7 abc 2 6 5";
        //iau fiecare nr din string
        //il pun intr-un sir
        try {
            int[] numbers = convert(s);
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] convert(String s) {
        String[] numbersStrings = s.split(" ");
        int[] numbers = new int[numbersStrings.length];
        for (int i = 0; i < numbersStrings.length; i++) {
            //pe fiecare numbersStrings[i] il convertesc in numar

            numbers[i] = Integer.parseInt(numbersStrings[i]);

        }
        return numbers;
    }
}
