package OOP_intro;

import java.util.Scanner;

public class Sesiunea9 {
    /* paradigma procedurala
    paradigma programarea orientata pe obiecte
     */
    public static void main(String[] args) {
        //numele si adresa unui student
//        Student student = getStudent();
        Student student = Student.read();
      // double average = student.getAverage();
        System.out.println(student.toString());
        System.out.println(student.getCountry());
//        System.out.println(student.name + " " + student.adress);
//        Student student1 = new Student("Ionut", "Cluj");
//        Student student2 = new Student("Andrei", "Bucuresti");
    }


}
