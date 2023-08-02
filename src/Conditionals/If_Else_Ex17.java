package Conditionals;
/* . Scrie un program care sa spuna ce format media are un fisier, in functie de extensia lui.
Citeste de la tastatura numele fisierului.
Daca extensia fisierului este .jpg, .jpeg, sau .png, atunci fisierul este o imagine
Daca extensia fisierului este .webm, su .mp4, fisierul este un video.
Daca extensia fisierului este .zip, fisierul este o arhiva
 */
import java.util.Scanner;

public class If_Else_Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("spune numele fisierului");
        String answer = scan.nextLine();
        if((answer.endsWith(".jpg")) || (answer.endsWith(".jpeg")) || (answer.endsWith(".png"))){
            System.out.println("fisierul este o imagine");
        }else if((answer.endsWith(".webm")) || (answer.endsWith(".mp4"))){
            System.out.println("fisierul este un video");
        }else if((answer.endsWith(".zip"))){
            System.out.println("fisierul este o arhiva");
        }
    }
}
