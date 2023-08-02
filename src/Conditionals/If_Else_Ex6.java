package Conditionals;/* Vrei sa determini BMI-ul (Body Mass Index) al unei persoane. Citeste de la tastatura greutatea si
 inaltimea unui om. Apoi calculeaza BMI-ul utilizand formula: “greutate / (inaltime * intaltime)”
Apoi, daca BMI-ul este mai mic decat 18, 5 afiseaza in consola “esti sub greutatea normala”.

Daca BMI-ul este intre 18.5 si 24.9, afiseaza in consola “ai greutatea normala”.
Daca BMI-ul este intre 25 si 29.9, afiseaza in consola “esti peste greutatea normala”.
Daca BMI-ule este mai mare deact 29.9, afiseaza in consola “esti obez”.
 */
import java.util.Scanner;

public class If_Else_Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ce inaltime?");
        double height = scanner.nextDouble();
        System.out.println("ce greutate?");
        double weight = scanner.nextDouble();
        double bmi = weight / (height*height);
        if(bmi < 18.5){
            System.out.println("esti sub greutatea normala");
        }else if((bmi >= 18.5) && (bmi <= 24.9)){
            System.out.println("ai greutatea normala");
        }else if((bmi >= 25) && (bmi <= 29.9)){
            System.out.println("esti peste greutatea normala");
        }else
            System.out.println("esti obez");
        }


    }
