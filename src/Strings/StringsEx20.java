package Strings;

import java.util.Scanner;

public class StringsEx20 {
    public static void main(String[] args) {
/* Implementeaza jocul Spanzuratoarea.
Tu, ca jucator, ai posibilitatea sa incerci sa ghicesti cuvinte intre 5 si 8 litere.
Jocul va avea o lista cu cuvinte predefinite pe care le poti ghici, atat cu 5, cat si cu 6-7-8 litere.
De la tastatura se va citi numarul de litere - adica din cate litere sa fie cuvantul pe care sa il ghiceasca utilizatoul.

Creeaza o functie chooseWord() care alege din lista de cuvinte predefinite un cuvant care sa aiba numarul de litere egal cu numarul citit
 de la tastatura.
Acesta va fi cuvantul secret, care trebuie ghicit.

Utilizatorul are 6 incercari sa ghiceasca cuvantul secret. Aceste incercari se vor citi de la tastatura. La fiecare incercare, va primi un hint
(afisat in consola).
Creeaza o functie getHint() care returneaza un hint in functie de incercarea utilizatorului.
Hint-ul va fi un cuvant format din dublul numarului de caractere ale incercarii utilizatorului.
Pentru fiecare litera din incercarea data de utilizator, se va mai alatura o un nou caracter imediat dupa:

Daca litera din incercare este aceeasi cu litera din cuvantul secret, de la aceeasi pozitie, atunci in hint se va pune litera din incercare
urmata de caracterul "#".
Asta semnifica faptul ca utilizatorul a ghicit acea litera. Este exact in locul potrivit.
Daca litera din incercare exista in cuvantul secret, doar ca in alta pozitie, atunci in hint se va pune litera din incercare urmata de
caracterul "?".
Asta semnifica faptul ca utilizatorul a ghicit litera, doar ca este la alta pozitie.
Daca litera din incercare nu exista in cuvantul secret, atunci in hint se va pune litera din incercare urmata de caracterul "_".
Asta semnifica faptul ca utilizatorul nu a ghicit deloc litera.\
Exemplu pentru cuvantul secret "since":

Daca utilizatorul introduce in prima incercare cuvantul crash, i se va printa ca hint : c?r_a_s?h_
Daca utilizatorul introduce in a doua incercare cuvantul scone, i se va printa ca hint : s#c?o_n?e#
Daca utilizatorul intrduca in a 3-a incercare cuvantul since, i se va printa ca hint: s#i#n#c#e si jocul va lua sfarsit.
 */
        String word1 = "cinci";//5 litere
        String word2 = "cuvant";//6 litere
        String word3 = "parinte";//7 litere
        String word4 = "dormitor";//8 litere
        String[] wordsList = {word1, word2, word3, word4};
        Scanner scanner = new Scanner(System.in);

       String secretWord= chooseWord(scanner, wordsList);

       int numberOfAttemps = 0;
        while (numberOfAttemps <= 6) {
            System.out.println("ghiceste cuvantul:");
            String word = scanner.next();
            System.out.println(getHint(word,secretWord));
            if (!secretWord.equals(word)) {
                numberOfAttemps++;
            }else {
                System.out.println("ai  ghicit");
                break;
            }
        }
    }

    public static String chooseWord(Scanner scanner, String[] wordsList) {
        System.out.println("din cate litere va fi cuvantul ?");
        int numberOfLetters = scanner.nextInt();
        String secretWord = "";
        for (int i = 0; i < wordsList.length; i++) {
            if (numberOfLetters == wordsList[i].length()) {
                secretWord = wordsList[i];
            }
        }
        return secretWord;
    }

    public static String getHint(String word,String secretWord) {
        String hint = "";
       int lenght = hint.length();
       lenght = word.length()*2;
        for (int i = 0; i < word.length(); i++) {
            char wordChar = word.charAt(i);
            char secretWordChar = secretWord.charAt(i);
            //Daca litera din incercare este aceeasi cu litera din cuvantul secret, de la aceeasi pozitie, atunci in hint se va pune
            // litera din incercare urmata de caracterul "#".
               if (word.charAt(i)==secretWord.charAt(i)){
                hint += word.charAt(i) + "#";
            }
            //Daca litera din incercare exista in cuvantul secret, doar ca in alta pozitie, atunci in hint se va pune
            // litera din incercare urmata de caracterul "?".
           else if (secretWord.contains(String.valueOf(word.charAt(i)))){
                hint += word.charAt(i) + "?";
            }
           //Daca litera din incercare nu exista in cuvantul secret, atunci in hint se va pune
                // litera din incercare urmata de caracterul "_".
                else {
                    hint += word.charAt(i) + "_";
                }
            }return hint;
        }
    }

