package VariabileOperatori;

import java.util.Scanner;

public class Var_Op_Ex_12 {
    public static void main(String[] args) {
/*O racheta poate decola daca are nivelul de combustibil mai mare decat 50%,
 daca toate sistemele functioneaza (reprezentate de un system check), si daca
  vremea este buna. Racheta nu poate decola daca are oameni la bord.
  Exceptia este ca poate decola cu oameni la bord, daca este o misiune de salvare
Citeste de la tastatura:
```json
double fuelLevel
boolean isSystemsCheckPassed
boolean isWeatherClear
boolean hasLivingCreaturesInCargo
boolean isRescueMission
```
Foloseste variabila canTakeOff care sa retina daca racheta poate sa decoleze, sau nu.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("fuelLevel?");
        double fuelLevel = scanner.nextDouble();
        System.out.println("isSystemsCheckPassed?");
        boolean isSystemsCheckPassed = scanner.nextBoolean();
        System.out.println("isWeatherClear?");
        boolean isWeatherClear = scanner.nextBoolean();
        System.out.println("hasLivingCreaturesInCargo?");
        boolean hasLivingCreaturesInCargo = scanner.nextBoolean();
        System.out.println("isRescueMission?");
        boolean isRescueMission = scanner.nextBoolean();

        boolean canTakeOff = (fuelLevel>0.5) && isSystemsCheckPassed && isWeatherClear && (!hasLivingCreaturesInCargo || isRescueMission);
        System.out.println(canTakeOff);
    }
}
