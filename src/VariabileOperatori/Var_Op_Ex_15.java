package VariabileOperatori;
/* O retea securizata poate fi accesata daca utilizatorul este un angajat si are badge-ul activ,
sau daca este un contractor cu badge-ul activ si cu contractul neexpirat.
In plus, trebuie sa nu fie o perioada de mentenanta a retelei.
Citeste de la tastatura:
```json
boolean isEmployee
boolean isContractor
boolean isBadgeActive
boolean isContractExpired
boolean isMaintenanceHour
```
Foloseste variabila canAccessNetwork care sa retina daca reteaua poate fi accesata, sau nu.

 */

import java.util.Scanner;

public class Var_Op_Ex_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este angajat?");
        boolean isEmployee = scanner.nextBoolean();
        System.out.println("este contractor?");
        boolean isContractor = scanner.nextBoolean();
        System.out.println("are badge activ?");
        boolean isBadgeActive = scanner.nextBoolean();
        System.out.println("contractul este expirat?");
        boolean isContractExpired = scanner.nextBoolean();
        System.out.println("este mentenanta?");
        boolean isMaintenanceHour = scanner.nextBoolean();
        boolean canAccessNetwork = (isEmployee || (isContractor && !isContractExpired)) && (isBadgeActive && !isMaintenanceHour);
        System.out.println(canAccessNetwork);

    }


}
