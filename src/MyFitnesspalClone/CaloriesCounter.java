package MyFitnesspalClone;

import java.util.Scanner;

import static MyFitnesspalClone.Product.computeCalories;


public class CaloriesCounter {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            printMenu();
            option = scanner.nextInt();
            performSelectedAction(option, productCatalog,scanner);
        } while (option !=6);

    }

    public static void printMenu() {
        System.out.println("   MENIU ");
        System.out.println("1. Adauga produs in calculator si calculeaza-i caloriile");
        System.out.println("2. Calculeaza caloriile pentru un produs fara a fi adaugat in catalog");
        System.out.println("3. Afiseaza toate produsele din catalog si caloriile pentru fiecare");
        System.out.println("4. Sterge un produs din catalog");
        System.out.println("5. Gaseste produs dupa nume");
        System.out.println("6. EXIT (Iesi din aplicatie)");
        System.out.println("************************************************");
        System.out.println("Alege actiunea cu numarul:");
    }
/* Dupa afisarea meniului se va citi numarul corespunzator optiunii, introdus de utilizator in consola, si se va efectua operatia specifica optiunii
 alese.\

Pe baza inputului (numarul citit de la consola) se va decide ce operatie trebuie efectuata, folosind instructiunea switch.
Tot acest bloc de cod se va extrage intr-o metoda performSelectedAction() (primeste ca parametru numarul citit din consola (optiunea uilizatorului),
 catalogul de produse si scanner-ul pentru a efectua citiri suplimentare de la tastatura). Metoda nu returneaza nimic, doar efectueaza operatia
 specifica numarului introdus. Pe fiecare ramura case din instructiunea switch, se va apela pe obiectul de tip ProductCatalog, metoda corespunzatoare
  optiunii alese.
Pentru efectuarea operatiilor 1,2,3,4,5, este nevoie de o instanta a clasei ProductCatalog. Aceasta instanta (obiect) se creeaza in metoda main
 inainte de orice linie de cod si se paseaza ca si parametru metodei performSelectedAction (impreuna cu inputul de la consola) pentru a putea fi
 folosita in efectuarea operatiilor necesare.\

Rezumat Metoda main:

In metoda main va trebui instantia unui obiect de tip ProductCatalog
Atat timp cat utilizatorul nu introduce de la consola optiunea 6 (optiunea de iesire din aplicatie), va trebui sa:
Se apeleze metoda printMenu() - pentru a afisa meniul utilizatorului
Sa se citeasca numarul introdus de utilizator (optiunea aleasa)
Se apeleze metoda performSelectedAction() - pentru a face actiunea aleasa de utilizator
Sugestie: orice declarari de variabile (sau obiecte) se vor face in afara intructiunilor repetitive (in interiorul instructiunilor repetitive doar
se vor folosi sau se vor initializa)
Atentie: Toate metodele create in clasa CalorieCounter care se apeleaza in metoda main, trebuie sa contina in semnatura cuvantul cheie static
(inaintea tipului returnat)
Sugestie: Pentru fiecare operatie e nevoie ca inputurile operatiei respective sa fie citite de la tastatura, apoi se va efectua operatia propriu zisa,
 si apoi se va afisa un mesaj corespunzator (dupa efectuarea operatiei). Astfel ca, pentru fiecare actiune selectata se poate face cate o
  metoda separata care incorporeaza toate aceste actiuni (citire, efectuare operatie, afisare mesaj rezultat) care va fi apelata conform
   optiunii selectate in case-ul instructiunii switch
 */

    public static void performSelectedAction(int option, ProductCatalog productCatalog,Scanner scanner) {

        switch (option) {
            case 1:
                //Adauga produs in calculator si calculeaza-i caloriile
                    //apelez metoda readProduct pt a citi detaliile produsului
                //pasam obiectul la metoda addProduct
                productCatalog.addProduct(readProduct());
                System.out.println(productCatalog);
                break;
            case 2:
                //Calculeaza caloriile pentru un produs fara a fi adaugat in catalog
                //2 apelam metoda computeCalories

                double calories = readProduct().calories;
                System.out.println("Produsul are " + calories+ " calorii");
                break;
            case 3:
                //Afiseaza toate produsele din catalog si caloriile pentru fiecare
                //3 apelam metoda printProduct
                System.out.println("Produsele din catalog :");
                productCatalog.printProducts();
                break;
            case 4:
                //Sterge un produs din catalog
                System.out.println("Ai ales sa stergi un nume din catalog,introdu numele:");
                String name = scanner.nextLine();
                productCatalog.getProductByName(name);
                productCatalog.deleteProduct(name);
                break;
            case 5:
                //Gaseste produs dupa nume
                System.out.println("Introdu numele produsului:");
               String name2 = scanner.nextLine();
                productCatalog.getProductByName(name2);
            default:
                //6.EXIT (Iesi din aplicatie)
                System.out.println("EXIT");
        }
    }

    public static Product readProduct() {

        //citim de la tastatura detaliile produsului
        //ne instantiem(cream un obiect)cu detaliile primite

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu:numele produsului:");
        String name = scanner.nextLine();
        System.out.println("Introdu cate grasimi are :");
        double fats = scanner.nextDouble();
        System.out.println("Introdu cati carbohidrati are:");
        double carbs = scanner.nextDouble();
        System.out.println("introdu cate proteine are:");
        double proteins = scanner.nextDouble();

        Product newProduct = new Product(name, fats, carbs, proteins);
        return newProduct;
    }

}
//am incercat sa introduct produse alegand optiunea 1,am introdus detaliile unui produs,mi-a dat iar meniul ,
// am ales iar 1,am introdus alt produs si mi-a dat eroarea
/* Exception in thread "main" java.lang.NullPointerException: Cannot read field "name" because "this.products[i]" is null
	at MyFitnesspalClone.ProductCatalog.isProductAdded(ProductCatalog.java:52)
	at MyFitnesspalClone.ProductCatalog.addProduct(ProductCatalog.java:34)
	at MyFitnesspalClone.CaloriesCounter.performSelectedAction(CaloriesCounter.java:66)
	at MyFitnesspalClone.CaloriesCounter.main(CaloriesCounter.java:14)

 */