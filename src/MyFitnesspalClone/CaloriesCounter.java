package MyFitnesspalClone;

import java.util.Scanner;



public class CaloriesCounter {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            printMenu();
            option = scanner.nextInt();
            performSelectedAction(option, productCatalog, scanner);
        } while (option != 6);

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


    public static void performSelectedAction(int option, ProductCatalog productCatalog, Scanner scanner) {

        switch (option) {
            case 1:
                //Adauga produs in calculator si calculeaza-i caloriile
                //apelez metoda readProduct pt a citi detaliile produsului
                //pasam obiectul la metoda addProduct
                System.out.println("Introdu:numele produsului:");
                String name = scanner.next();
                System.out.println("Introdu cate grasimi are :");
                double fats = scanner.nextDouble();
                System.out.println("Introdu cati carbohidrati are:");
                double carbs = scanner.nextDouble();
                System.out.println("introdu cate proteine are:");
                double proteins = scanner.nextDouble();

                Product newProduct = new Product(name, fats, carbs, proteins);
                boolean result = productCatalog.addProduct(newProduct);
                if (result) {
                    System.out.println("Produsul " + newProduct.name + " a fost adaugat si are: " + newProduct.calories + " calorii");
                } else {
                    System.out.println("Prpdusul " + newProduct.name + " nu s-a adaugat");
                }
                break;
            case 2:
                //Calculeaza caloriile pentru un produs fara a fi adaugat in catalog
                //2 apelam metoda computeCalories
                System.out.println("Introdu:numele produsului:");
                name = scanner.next();
                System.out.println("Introdu cate grasimi are :");
                fats = scanner.nextDouble();
                System.out.println("Introdu cati carbohidrati are:");
                carbs = scanner.nextDouble();
                System.out.println("introdu cate proteine are:");
                proteins = scanner.nextDouble();

                newProduct = new Product(name, fats, carbs, proteins);
                Product.computeCalories(fats, carbs, proteins);
                System.out.println("Produsul are " + newProduct.calories + " calorii");
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
                name = scanner.next();
                boolean deleteResult = productCatalog.deleteProduct(name);
                if (deleteResult) {
                    System.out.println("Produsul " + name + " a fost sters");
                } else {
                    System.out.println("Produsul " + name + " nu a fost sters");
                }
                break;
            case 5:
                //Gaseste produs dupa nume
                System.out.println("Introdu numele produsului:");
                name = scanner.next();
                Product product1 = productCatalog.getProductByName(name);
                System.out.println(product1);
            case 6:
                //6.EXIT (Iesi din aplicatie)
                System.out.println("EXIT");
            default:
                System.out.println("Optiune invalida, reintroduceti optiunea");

        }

//        public static Product readProduct (){
//
//            //citim de la tastatura detaliile produsului
//            //ne instantiem(cream un obiect)cu detaliile primite
//
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Introdu:numele produsului:");
//            String name = scanner.nextLine();
//            System.out.println("Introdu cate grasimi are :");
//            double fats = scanner.nextDouble();
//            System.out.println("Introdu cati carbohidrati are:");
//            double carbs = scanner.nextDouble();
//            System.out.println("introdu cate proteine are:");
//            double proteins = scanner.nextDouble();
//
//            Product newProduct = new Product(name, fats, carbs, proteins);
//            return newProduct;
//        }
    }
}

