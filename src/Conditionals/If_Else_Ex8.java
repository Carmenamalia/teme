package Conditionals;

import java.util.Scanner;

/* Citeste de la tastatura previziunea pentru vreme si viteza vantului.
 Previziunea pentru vreme poate fi “rainy” sau “snowing”. Daca previziunea pentru vreme este “rainy”
 sau previziunea este “snowing” si viteaza vantului este mai mare decat 30,
  afiseaza in consola mesajul “Ramai in casa, este periculos afara” Altfel, afiseaza mesajul:
   “S-ar putea sa fie frumos afara”
De exemplu, pentru valorile initiale:
String currentForecast = "rainy"
int currentWindSpeed = 40
se va afisa in consola mesajul "Ramai in casa, este periculos afara"
 */
public class If_Else_Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vremeaAzi = scanner.nextLine();
        int windSpeed = scanner.nextInt();
        if (((vremeaAzi.equals("rainy")) || (vremeaAzi.equals("snowing"))) && (windSpeed > 30)) {
            System.out.println("ramai in casa, e periculos afara");
        } else {
            System.out.println("s-ar putea sa fie frumos afara");
        }
    }
}