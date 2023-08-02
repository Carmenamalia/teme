package VariabileOperatori;

import java.util.Scanner;

public class Var_Op_Ex_14 {
    public static void main(String[] args) {
/*Un aplicant pentru un credit va obtine creditul daca are un credit score peste 700 si daca
 are o sursa de venit stabila. Daca creditul este mare (peste 100000 euro), atunci clientul trebuie
  sa ofere si colateral ca sa fie aprobat. In plus, banca nu trebuie sa fie intr-o perioada in care nu ofera credite.
Citeste de la tastatura:
```json
int creditScore
boolean hasSteadyIncome
double loanAmount
boolean hasCollateral
boolean isBankInCreditFreeze
```
Foloseste variabila isLoanApproved care sa retina daca creditul este aprobat, sau nu.

 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("creditScore?");
        int creditScore = scanner.nextInt();
        System.out.println("hasSteadyIncome?");
        boolean hasSteadyIncome = scanner.nextBoolean();
        System.out.println("loanAmount?");
        double loanAmount = scanner.nextDouble();
        System.out.println("hasCollateral?");
        boolean hasCollateral = scanner.nextBoolean();
        System.out.println("isBankInCreditFreeze?");
        boolean isBankInCreditFreeze = scanner.nextBoolean();

        boolean isLoanApproved = (((creditScore>=700) && hasSteadyIncome) || ((loanAmount>=1000000) && hasCollateral)) && !isBankInCreditFreeze;
        System.out.println(isLoanApproved);

    }
}
