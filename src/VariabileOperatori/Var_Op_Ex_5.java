package VariabileOperatori;

import java.util.Scanner;

public class Var_Op_Ex_5 {
 /*Determina daca un utilizator se poate loga in aplicatie.
Ai la dispozitie variabilele username si password deja declarate si initializate.

Citeste de la tastatura inputUsername si inputPassword (adica username-ul si parola pe care ti le da utilizatorul).

Apoi, determina daca ce a introdus utilizatorul este acelasi lucru cu username-ul si parola existente.

Foloseste variabila isUserLoggedIn care sa retina daca utilizatorul s-a logat, sau nu, in aplicatie

  */
 public static void main(String[] args) {
  String username = "carmen";
  String password = "pass";
  Scanner scanner = new Scanner(System.in);
  System.out.println("Introdu " + "username");
  String inputUsername = scanner.nextLine();
  System.out.println("Introdu " + "password");
  String inputPassword = scanner.nextLine();
  boolean isUserLoggedIn = inputUsername.equals(username) && inputPassword.equals(password);
  System.out.println(isUserLoggedIn);
 }
}
