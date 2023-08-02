package VariabileOperatori;

import java.util.Scanner;

public class Var_Op_Ex_9 {
    public static void main(String[] args) {

 /* Un angajat este eligibil pentru o promovare daca lucreza in companie de cel putin 5 ani si
* scorul de performanta este mai mare decat 8, sau daca are o recomandare de la manager si
* nu are sanctiuni disciplinare. Totusi, promovarea se poate face doar daca
*  compania nu are promovarile inghetate.
*  Citeste de la tastatura:
```json
    int yearsWorked
    double performanceScore
    boolean hasManagerRecommendation
    boolean hasDisciplinaryAction
    boolean isPromotionFreeze
```
* Foloseste variabila isEligibleForPromotion care sa retina daca angajatul poate promova, sau nu.

*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("de cati ani lucreaza in companie?");
        int yearsWorked = scanner.nextInt();
        System.out.println("cat e scorul de performanta?");
        double performanceScore = scanner.nextDouble();
        System.out.println("are recomandare de la manager?");
        boolean hasManagerRecommendation = scanner.nextBoolean();
        System.out.println("are sanctiuni disciplinare?");
        boolean hasDisciplinaryAction = scanner.nextBoolean();
        System.out.println("compania are promovarile inghetate?");
        boolean isPromotionFreeze = scanner.nextBoolean();

        boolean isEligibleForPromotion = (yearsWorked>=5 && performanceScore>=8) || (hasManagerRecommendation && !hasDisciplinaryAction) && !isPromotionFreeze;
        System.out.println(isEligibleForPromotion);
    }

}
