package OOP_pr.ex8companyapp;

import java.util.Arrays;

public class Department {
    private String name;
    private Employee[] employees;
    private int numberOfEmployeesAdded;


    public Department(String name, Employee[] employees, int numberOfEmployeesAdded) {
        this.name = name;
        this.employees = employees;
        this.numberOfEmployeesAdded = numberOfEmployeesAdded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public boolean addEmployee(Employee employee) {
        employees[numberOfEmployeesAdded] = employee;
        numberOfEmployeesAdded++;
        return true;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getNumberOfEmployeesAdded() {
        return numberOfEmployeesAdded;
    }

    public void setNumberOfEmployeesAdded(int numberOfEmployeesAdded) {
        this.numberOfEmployeesAdded = numberOfEmployeesAdded;
    }

    //8.4. scrie un program care afiseaza numarul de angajati din departament:
    public void printNumberOfEmployeeOfDep() {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            count += employees[i].getName().length();
            count++;
        }
        System.out.println(count);
    }

    //8.5. scrie o metoda care printeaza toti angajatii din departament
    public void printAllEmployeesOfDep() {
        for (int i = 0; i < numberOfEmployeesAdded; i++) {
            System.out.println(employees[i].getName());

        }
    }


    //8.6. scrie o metoda care printeaza toate strazile adreselor angajatilor din departament

    public void printAllEmployeesAddressStreets() {
        for (int i = 0; i < numberOfEmployeesAdded; i++) {
            System.out.println(employees[i].getAdress().getStreet());

        }
    }

    //8.7. scrie o metoda care cauta un anumit angajat dupa nume in departament, si ii afiseaza numele daca il gaseste
    public Employee getEmployeeByName(String employeeName) {
        for (int i = 0; i < numberOfEmployeesAdded; i++) {
            if (employeeName.equals(employees[i].getName())) {
                return employees[i];
            }
        }
        return null;
    }

    //8.8. scrie o metoda care printeaza adresa unui anumit angajat din departament ???
    public void printAdressOfEmployee(String name) {
        for (int i = 0; i < numberOfEmployeesAdded; i++) { //trec prin numarul de angajati din dep
            if (name.equals(employees[i].getName())) { //daca numele este = cu numele angajatului de la pozitia i
                employees[i].printAdress(); // printez adresa angajatului
            }

        }
        System.out.println("not found");
    }

    //8.9. scrie o metoda care cauta o adresa (dupa strada) in lista de angajati a departamentului, si ii afiseaza strada daca o gaseste ???
    public void findAdressByStreet(String street) {
        for (int i = 0; i < numberOfEmployeesAdded; i++) {
            if (street.equals(employees[i].getAdressStreet())) {
                System.out.println(employees[i].getAdressStreet());
            }
        }
        System.out.println("not found");
    }

    //8.19. scrie o metoda care printeaza numele angajatului cu cel mai mare salariu dintr-un anumit departament
    public String getNameOfEmplWithBiggerSalary() {
        for (int i = 0; i < numberOfEmployeesAdded; i++) {
            String temp = null;
            for (int j = i; j < numberOfEmployeesAdded; j++) {
                if (employees[j].getSalary() > employees[i].getSalary()) {
                   temp = employees[j].getName();
                }
            }
            return temp;
        }
       return null;
    }
    //8.22. scrie o metoda care printeaza numele angajatului cu cel mai mic salariu dintr-un anumit departament;
    public String getNameOfEmplWithSmallerSalary() {
        for (int i = 0; i < numberOfEmployeesAdded; i++) {
            String temp = null;
            for (int j = i; j < numberOfEmployeesAdded; j++) {
                if (employees[j].getSalary() < employees[i].getSalary()) {
                    temp = employees[j].getName();
                }
            }
            return temp;
        }
        return null;
    }
    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", numberOfEmployeesAdded=" + numberOfEmployeesAdded +
                '}';
    }
}



