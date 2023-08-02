package VariabileOperatori;

import java.util.Scanner;

public class Var_Op_Ex_10 {
    public static void main(String[] args) {
/*        .Un utilizator poate accesa o pagina secreta de pe un website daca are rolul de administrator
 * --sau-- daca are---- atat rolul de manager --si --este si parte din proiectul paginii secrete.
 * In plus, utilizatorul trebuie sa aiba 2FA (two factor authentication)
 * ---si-- sa nu fie marcat cu activitate suspicioasa. In plus, server-ul trebuie sa fie pornit.
*        Citeste de la tastatura:
```json
        boolean isAdministrator
        boolean isManager
        boolean isPartOfProject
        boolean hasTwoFactorEnabled
        boolean isFlaggedSuspicious
        boolean isServerUp
 ```
*        Foloseste variabila canAccessPage care sa retina daca utilizatorul poate accesa pagina secreta, sau nu.
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("isAdministrator?");
        boolean isAdministrator = scanner.nextBoolean();//true
                                                            //SAU
        System.out.println("isManager?");
        boolean isManager = scanner.nextBoolean(); //true
                                                            //SI
        System.out.println("isPartOfProject?");
        boolean isPartOfProject = scanner.nextBoolean();//true
                                                            //SI
        System.out.println("hasTwoFactorEnabled?");
        boolean hasTwoFactorEnabled = scanner.nextBoolean();//true
                                                                //SI
        System.out.println("isFlaggedSuspicious?");
        boolean isFlaggedSuspicious = scanner.nextBoolean();//true
                                                                    //SI
        System.out.println("isServerUp?");
        boolean isServerUp = scanner.nextBoolean();

        boolean canAccessPage = isAdministrator || (isManager && isPartOfProject) && hasTwoFactorEnabled && !isFlaggedSuspicious && isServerUp;
        System.out.println(canAccessPage);
    }
}
