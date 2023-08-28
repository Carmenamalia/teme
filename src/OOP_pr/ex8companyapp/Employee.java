package OOP_pr.ex8companyapp;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
    private Address address;

    public Employee(String firstName, String lastName, int salary, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAdress() {
        return address;
    }
    public void setAdress(Address adress) {
        this.address = adress;
    }

//8.1. Scrie o metoda care afiseaza numele angajatului:
    public String getName() {
        return this.lastName + " " + this.firstName;
    }
//8.2. Scrie o metoda care afiseaza strada adresei angajatului
    public String getAdressStreet(){
      return this.address.getStreet();
    }
//8.3. Scrie o metoda care afiseaza toate atributele adresei angajatului
    public void printAdress() {
        System.out.println("city: " + this.address.getCity() + " ,str. " + this.address.getStreet() + " ,nr. " + this.address.getNumber());

    }
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
