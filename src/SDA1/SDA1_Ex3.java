package SDA1;

public class SDA1_Ex3 {
    /* Genereaza mesajele pentru sistemul de like-uri al Facebook-ului.
    Ai la dispozitie ca si input un array cu numele persoanelor care au dat like (la ceva) si trebuie sa generezi textul corespunzator,
     dupa regula pe care o deduci din urmatorul exemplu:

    [] -> "no one likes this"
    ["Peter"] -> "Peter likes this"
    ["Jacob", "Alex"] -> "Jacbok and Alex like this"
    ["Max", "John", "Mark"] -> "Max, John and mark like this"
    ["Alex", "Jacob", "Mark", "Max"] -> "Alex, Jacob and 2 others like this"
     */
    public static void main(String[] args) {
        //input
        String[] names = {"Alex", "Jacob", "Mark", "Max","Mary" };

        //daca lungimea array-ului este 0,textul este "no one..."
        //daca lungimea e 1,textul e array[0] + likes this
        //daca lungimea e 2,textul este array[0] si array[1] + like this
        //daca lungimea e 3,textul este array[0], array[1] si array[3] + like this
        //daca lungimea e mai mare decat 3,textul este array[0], array[1] si (lungimea array-ului-2) others  like this

        System.out.println(whoLikesIt(names));
    }

    public static String whoLikesIt(String[] names) {
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
            return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " likes this";
            case 3:
            return names[0] + "," + names[1] + " and " + names[2] + " likes this";
            default :
                return names[0] + "," + names[1] + " and " + (names.length-2) + " others likes this";
        }
    }
}
