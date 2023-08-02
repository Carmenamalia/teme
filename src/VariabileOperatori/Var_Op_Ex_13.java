package VariabileOperatori;

import java.util.Scanner;

public class Var_Op_Ex_13 {
    public static void main(String[] args) {
/*Un angajat poate sa rezerve un meeting room doar daca este disponibil si daca
 nu a depasit numarul de rezervari per saptamana. Daca camera este o camera speciala (cu multe locuri),
  atunci poate fi rezervata doar daca echipa angajatului are mai mult de 10 membri.
Citeste de la tastatura:
```json
boolean isRoomAvailable
boolean isQuotaExceeded
boolean isHighCapacityRoom
int teamSize
```
Foloseste variabila canBookRoom care sa retina daca angajatul poate sa rezerve sala, sau nu.
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("isRoomAvailable?");
        boolean isRoomAvailable = scanner.nextBoolean();
        System.out.println("isQuotaExceeded?");
        boolean isQuotaExceeded = scanner.nextBoolean();
        System.out.println("isHighCapacityRoom?");
        boolean isHighCapacityRoom = scanner.nextBoolean();
        System.out.println("teamSize?");
        int teamSize = scanner.nextInt();

        boolean canBookRoom = (isRoomAvailable || (isHighCapacityRoom && (teamSize>=10)))  && !isQuotaExceeded;
        System.out.println(canBookRoom);
    }
}
