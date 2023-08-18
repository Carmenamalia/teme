package OOP.ex2scoala;

public class Teacher extends Person{
    String department;
   String subject; // (adică ce predă profesorul)

    public Teacher(String firstName, String lastName,String department,String subject) {
        super(firstName, lastName);
        this.department = department;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "department='" + department + '\'' +
                ", subject='" + subject + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
//Metoda introduce() - implementează metoda abstractă din subclasă și afișează un mesaj.
    // Exemplu: “I am John Decker, I teach Math and I am a teacher”

    public void introduce(){
        System.out.println("I am " + this.getFirstName()+this.getLastName()+", I teach "+this.subject+" and I am a " + this.department);
    }
}
