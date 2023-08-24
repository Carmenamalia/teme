package OOP_pr.ex2scoala;

public class Student extends Person{
    String groupClass; // (adică clasa în care este studentul)

    public Student(String firstName, String lastName,String groupClass) {
        super(firstName, lastName);
        this.groupClass = groupClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupClass='" + groupClass + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
//Metoda introduce() - implementează metoda abstractă din subclasă și afișează un mesaj.
    // Exemplu: “I am Dave Brown, I am in 12A class and I am a student”


    @Override
    public void introduce() {
        System.out.println("I am " + this.getFirstName() + this.getLastName() + ", I am in "+this.groupClass+" and I am a student");
    }
}
