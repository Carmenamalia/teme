package VariabileOperatori;

import java.util.Scanner;

public class Var_Op_Ex_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("cartea e inchiriata?");
        boolean isBookRented = scanner.nextBoolean();//nu---!isBookRented
        System.out.println("cate carti inchiriate?");
        int numberOfRentedBooks = scanner.nextInt() ;// <=3
        System.out.println("are datorii?");
        boolean hasLateFees = scanner.nextBoolean(); //nu---!hasLateFees
        boolean canRentBook = !isBookRented  && (numberOfRentedBooks <= 3) && !hasLateFees;
        System.out.println(canRentBook);




    }
}
