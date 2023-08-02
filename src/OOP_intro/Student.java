package OOP_intro;

import java.util.Scanner;

public class Student {
    String name;
    String adress;
    String phoneNumber;
    double[] grades;

   //metoda "constructor"
    public Student(String name, String adress, String phoneNumber){
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }
    public String toString(){
        return "numele este " + this.name + " adresa este " + this.adress;
    }
    public String getCountry(){
        if (this.phoneNumber.startsWith("+40")){
            return "Romania";
        } else if (this.phoneNumber.startsWith("+44")) {
            return "Anglia";
        }else{
            return "unknown";
        }
    }
    public static Student read() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String adress = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
//        Student student = new Student(name, adress);
//        return student;
        //sau:
        return new Student(name,adress,phoneNumber);
    }
    public  double getAverage(double[] grades){
        //calculul mediei
        //this.grades;
        return 0;
    }
}
