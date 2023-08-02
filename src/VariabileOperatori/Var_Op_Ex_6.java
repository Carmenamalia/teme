package VariabileOperatori;

import java.util.Scanner;

/*Un utilizator poate vizualiza un video premium daca este un membru premium, sau daca a cumparat acel video. In plus, server-ul trebuie sa fie on-line
Citeste de la tastatura:

boolean isPremiumMember;
boolean hasBoughtVideo;
boolean isServerOnline;
Foloseste variabila canViewVideo care sa retina daca utilizatorul poate sau nu sa vizualizeze video premium.
*/
public class Var_Op_Ex_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isPremiumMember = scanner.hasNextBoolean();
        boolean hasBoughtVideo = scanner.hasNextBoolean();
        boolean isServerOnline = scanner.hasNextBoolean();

        boolean canViewVideo = (isPremiumMember || hasBoughtVideo) && isServerOnline;
        System.out.println(canViewVideo);



    }
}
