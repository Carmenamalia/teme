package OOP_intro.OOP_Ex_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/* Creeaza un program care sa simuleze o masina
Clasa Car are urmatoarele atribute:

*numar de roti
*viteza maxima
*brand
*culoare
*viteza curenta
*treapta curenta de viteza
Clasa Car are urmatoarele functionalitati:

*porneste masina (treapta de viteza devine 1 si viteza curenta devine 1)
*accelereaza (mareste viteza curenta cu o anumita valoare, iar daca se accelereaza cu mai mult de 20 km/ora, treapta de viteza se mareste automat)
*decelereaza (scade viteza curenta cu o anumita valoare, iar daca se decelereaza cu mai mult de 20 km/ora, treapta de viteza se scade automat)
*mareste treapta de viteza
*scade treapta de viteza
*converteste o anumita valoare a vitezei din km/ora in mile/ora
Creeaza mai multe masini in Main si apeleaza-le comportamentele.
 */
        Car audi = new Car(280, "Audi", "red");
//        Car bmw = new Car(300,"BMW","blue");
//        System.out.println(Car.NUMBER_OF_WHEELS);
//        audi.startCar();
//        bmw.startCar();
//        audi.accelerate(30);
//        System.out.println(audi);
//        System.out.println(bmw);
//       // Car.convertToMpH(50);
//        System.out.println(Car.convertToMpH(audi.currentSpeed);
        //printam meniul
        //citim optiunea de la tastatura
        //in functie de optiunea introdusa apelam functia coresp
        //facem pasii 1,2,3 atat timp cat optiunea introdusa nu este 3
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        do {
            printMain();
            option = scanner.nextInt();
            performSelectedOption(option,audi,scanner);
           int speed = 0;

            if (option == 1) {
                 speed = scanner.nextInt();
                audi.accelerate(speed);
                System.out.println("viteza este acum: " + audi.currentSpeed);
            } else if (option == 2) {
                 speed = scanner.nextInt();
                audi.deccelerate(speed);
                System.out.println("viteza este acum: " + audi.currentSpeed);
            } else if (option != 3) {
                System.out.println("optiune invalida,reintrodu numarul");
            }
        } while (option != 3);
    }

    public static void printMain() {
        System.out.println("------------------");
        System.out.println("Meniu");
        System.out.println("1.accelereaza");
        System.out.println("2.decelereaza");
        System.out.println("3.iesi din aplicaties");
        System.out.println("-------------------");
        System.out.println("introdu optiunea dorita");
    }
    public static void performSelectedOption(int option,Car car,Scanner scanner){
        int speed = 0;
        switch (option) {
            case 1:
                speed = scanner.nextInt();
                car.accelerate(speed);
                System.out.println("viteza este acum: " + car.currentSpeed);
                break;
            case 2:
                speed = scanner.nextInt();
                car.deccelerate(speed);
                System.out.println("viteza este acum: " + car.currentSpeed);
            case 3:
                System.out.println("program will shut down");
                break;
            default:
                System.out.println("optiune invalida,reintrodu numarul");
        }
    }
}
