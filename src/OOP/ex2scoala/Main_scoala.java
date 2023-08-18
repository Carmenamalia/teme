package OOP.ex2scoala;

public class Main_scoala {
    public static void main(String[] args) {
        Student student = new Student("Andrei","Popescu","12A");
        System.out.println(student);
        Teacher teacher = new Teacher("Simona","Radu","teacher","maths");
        System.out.println(teacher);
        student.introduce();
        teacher.introduce();

    }
}
