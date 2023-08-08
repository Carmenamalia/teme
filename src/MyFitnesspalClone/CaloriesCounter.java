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

