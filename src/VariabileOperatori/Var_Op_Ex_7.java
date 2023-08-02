package VariabileOperatori;

import java.util.Scanner;


public class Var_Op_Ex_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ai completat prerequisites ?");
        boolean hasCompletedPrerequisites = scanner.nextBoolean();

        System.out.println("Cat este nota medie ?");
        char gradeInPrerequisites = scanner.nextLine().charAt(0);

        System.out.println("Are locuri libere ?");
        boolean hasOpenSpots = scanner.nextBoolean();

        System.out.println("Participa la curs");
        boolean canTakeCourse = hasCompletedPrerequisites && hasOpenSpots && (gradeInPrerequisites=='A' || gradeInPrerequisites=='B');
        System.out.println(canTakeCourse);
        }

    }

