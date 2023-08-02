package VariabileOperatori;

import java.util.Scanner;

public class Var_Op_Ex_11 {
    public static void main(String[] args) {
  /*Un jucator poate avansa la nivelul urmator doar daca are mai mult de 1000 de puncte
  sau daca are o cheie de aur, si in plus, nu este sub atac.
   Mai mult, jocul trebuie sa nu fie pus pe pauza si serverul trebuie sa ruleze.
Citeste de la tastatura:
```json
 int playerPoints
 boolean hasGoldenKey
 boolean isUnderAttack
 boolean isGamePaused
 boolean isServerRunning
 ```
Foloseste variabila canAdvanceLevel care sa retina daca jucatorul poate sa avanseze, sau nu.
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("playerPoints?");
        int playerPoints = scanner.nextInt();
        System.out.println("hasGoldenKey?");
        boolean hasGoldenKey = scanner.nextBoolean();
        System.out.println("isUnderAttack?");
        boolean isUnderAttack = scanner.nextBoolean();
        System.out.println("isGamePaused?");
        boolean isGamePaused = scanner.nextBoolean();
        System.out.println("isServerRunning?");
        boolean isServerRunning = scanner.nextBoolean();

        boolean canAdvanceLevel = playerPoints>=1000 || (hasGoldenKey && !isUnderAttack) && !isGamePaused && isServerRunning;
        System.out.println(canAdvanceLevel);
    }
}
