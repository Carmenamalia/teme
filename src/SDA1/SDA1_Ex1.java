package SDA1;

import java.util.Scanner;

public class SDA1_Ex1 {
    /* Scrie un program care sa calculeze cum vei vopsi un gard
    Avem un gard format din n scanduri, n fiind citit de la tastatura. n trebuie sa fie minim 3.

    Un copil vopseste cu culoarea rosie din 2 in 2 scanduri (prima scandura colorata cu rosu este scandura 2), iar alt copil vopseste cu culoarea albastra
     din 3 in 3 scanduri (prima scandura colorata cu albastru este scandura 3). Scandura 1 ramane nevopsita.

    Exista posibilitatea ca o scandura sa fie violet, atunci cand cand ambii copii o vopsesc (de exemplu, scandura 6 va fi vopsita de ambii copii).

    Calculeaza (din cele n scanduri) cate scanduri vopsite cu albastru vor fi, cate scanduri vopsite cu rosu vor fi, cate scanduri vopsite cu violet
     vor fi, si cate scanduri nevopsite vor fi.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // | |R|A|R| |V| |R|A|R |  |V |  |
        // |1|2|3|4|5|6|7|8|9|10|11|12|13|

        //input nr scanduri
        int n = 13;
        //output
        int red = 1;
        int blue = 1;
        int purple = 0;
        int noColor = 1;
        //pt fiecare scandura de la 4 pana la n
        //pt o scandura:
            //daca e multiplu si de 2 si de 3 e violet
            //altfel daca e multiplu de 2 e rosie
            //atfel daca e multiplu de 3 e albastra
            //altfel ,atumci numaram ca si nevopsit

        for (int i = 4;i<=n;i++){
            if (i%2==0 && i%3==0){
                purple++;
            } else if(i%2==0) {
                red++;
            }else if(i%3==0){
                blue++;
            }else{
                noColor++;
            }
        }
        System.out.println("red " + red);
        System.out.println("blue " + blue);
        System.out.println("purple " + purple);
        System.out.println("no color " + noColor);
    }
}


