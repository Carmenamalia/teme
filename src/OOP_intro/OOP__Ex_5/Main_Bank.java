package OOP_intro.OOP__Ex_5;

import java.util.Scanner;

public class Main_Bank {
    public static void main(String[] args) {
//Creeaza mai multe conturi bancare in Main si apeleaza-le comportamentele.
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        // BankAccount account = new BankAccount(12355, "RON", 2000);
        // BankAccount account2 = new BankAccount(2000, "Euro", 1000);

        account = account.getAccount();//apelez functia care introduce datele contului
        int option = 0;
        do {
            printMenu();
            option = scanner.nextInt();
            performOption(option, account, scanner);
        } while (option != 4);

    }

    public static void printMenu() {

        System.out.println("Alege operatia: ");
        System.out.println("1.Retragere");
        System.out.println("2.Depunere");
        System.out.println("3.Extras de cont");
         System.out.println("4.Exit");

    }

    public static void performOption(int option, BankAccount account, Scanner scanner) {
        // account = new BankAccount();
        int withdraw = 0;
        int depozit = 0;
        switch (option) {
            case 1:
                withdrawSum(account, withdraw, scanner);
                account.getWithdraw(withdraw);
                break;
            case 2:
                depozitS(account, depozit, scanner);
                account.depositSum(depozit);
                break;
            case 3:
                account.printExtras(withdraw, depozit);
                break;
            default:
                System.out.println("EXIT");
        }
    }

 public static void withdrawSum(BankAccount account, int withdraw, Scanner scanner) {
        System.out.println("introdu suma pe care vrei sa o retragi:");
        withdraw = scanner.nextInt();
        if (account.getWithdraw(withdraw)) {
            System.out.println("ai retras: " + withdraw + " " + account.currency);
            System.out.println("sold ramas: " + account.currentSold + " " + account.currency);
        } else {
            System.out.println("fonduri insuficiente sau ai depasit limita maxima");
        }
    }

    public static void depozitS(BankAccount account, int depozit, Scanner scanner) {
        System.out.println("Introdu suma pe care o depozitezi:");
        depozit = scanner.nextInt();
        account.depositSum(depozit);
        System.out.println("ai depus: " + depozit + " " + account.currency);

    }
}
